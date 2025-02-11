package br.com.mcer.backend.infra.controller;

import br.com.mcer.backend.application.usecases.CreateHistoryLocation;
import br.com.mcer.backend.application.usecases.FindHistoryLocation;
import br.com.mcer.backend.domain.entities.HistoryLocation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/history-location")
public class HistoryLocationController {

    private final CreateHistoryLocation createHistoryLocation;
    private final FindHistoryLocation findHistoryLocation;

    public HistoryLocationController(CreateHistoryLocation createHistoryLocation, FindHistoryLocation findHistoryLocation) {
        this.createHistoryLocation = createHistoryLocation;
        this.findHistoryLocation = findHistoryLocation;
    }

    @PostMapping
    public HistoryLocationDto save(@RequestBody HistoryLocationDto dto) {
        HistoryLocation data = createHistoryLocation.save(
                new HistoryLocation(dto.latitude(),
                        dto.longitude(),
                        dto.description()
                )
        );
        return new HistoryLocationDto(data.getLatitude(), data.getLongitude(), data.getDescription());
    }

    @GetMapping
    public List<HistoryLocationDto> findAll() {
        return findHistoryLocation.findAll().stream()
                .map(h -> new HistoryLocationDto(
                        h.getLatitude(),
                        h.getLongitude(),
                        h.getDescription()
                )).toList();
    }
}
