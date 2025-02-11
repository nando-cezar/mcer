package br.com.mcer.backend.infra.gateway;

import br.com.mcer.backend.application.gateways.HistoryLocationRepository;
import br.com.mcer.backend.domain.entities.HistoryLocation;
import br.com.mcer.backend.infra.persistence.HistoryLocationEntity;
import br.com.mcer.backend.infra.persistence.HistoryLocationJpaRepository;

import java.util.List;

public class HistoryLocationJpaImpl implements HistoryLocationRepository {

    private final HistoryLocationJpaRepository repository;
    private final HistoryLocationMapper mapper;

    public HistoryLocationJpaImpl(HistoryLocationJpaRepository repository, HistoryLocationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public HistoryLocation save(HistoryLocation historyLocation) {
        HistoryLocationEntity entity = mapper.toEntity(historyLocation);
        var data = repository.save(entity);
        return mapper.toDomain(data);
    }

    @Override
    public List<HistoryLocation> findAll() {
        return repository.findAll().stream().map(mapper::toDomain).toList();
    }
}
