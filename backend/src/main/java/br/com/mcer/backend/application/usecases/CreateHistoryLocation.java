package br.com.mcer.backend.application.usecases;

import br.com.mcer.backend.application.gateways.HistoryLocationRepository;
import br.com.mcer.backend.domain.entities.HistoryLocation;

public class CreateHistoryLocation {

    private final HistoryLocationRepository repository;

    public CreateHistoryLocation(HistoryLocationRepository repository) {
        this.repository = repository;
    }

    public HistoryLocation save(HistoryLocation usuario) {
        return repository.save(usuario);
    }
}
