package br.com.mcer.backend.application.usecases;

import br.com.mcer.backend.application.gateways.HistoryLocationRepository;
import br.com.mcer.backend.domain.entities.HistoryLocation;

import java.util.List;

public class FindHistoryLocation {

    private final HistoryLocationRepository repository;

    public FindHistoryLocation(HistoryLocationRepository repository) {
        this.repository = repository;
    }

    public List<HistoryLocation> findAll() {
        return repository.findAll();
    }
}
