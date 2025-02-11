package br.com.mcer.backend.domain.entities;

public interface HistoryLocationBuilder {
    void createNewInstance();
    HistoryLocation withLatitude(double latitude);
    HistoryLocation withLongitude(double latitude);
    HistoryLocation withDescription(String description);
}
