package br.com.mcer.backend.infra.gateway;

import br.com.mcer.backend.domain.entities.HistoryLocation;
import br.com.mcer.backend.infra.persistence.HistoryLocationEntity;

public class HistoryLocationMapper {

    public HistoryLocationEntity toEntity(HistoryLocation historyLocation) {
        return new HistoryLocationEntity(
                historyLocation.getLatitude(),
                historyLocation.getLongitude(),
                historyLocation.getDescription()
        );
    }

    public HistoryLocation toDomain(HistoryLocationEntity historyLocationEntity) {
        return new HistoryLocation(
                historyLocationEntity.getLatitude(),
                historyLocationEntity.getLongitude(),
                historyLocationEntity.getDescription()
        );
    }
}
