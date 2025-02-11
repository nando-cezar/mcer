package br.com.mcer.backend.application.gateways;

import br.com.mcer.backend.domain.entities.HistoryLocation;

import java.util.List;

public interface HistoryLocationRepository {
    HistoryLocation save(HistoryLocation historyLocation);
    List<HistoryLocation> findAll();
}
