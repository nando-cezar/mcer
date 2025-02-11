package br.com.mcer.backend.domain.entities;

public class HistoryLocationBuilderImpl implements HistoryLocationBuilder {

    private HistoryLocation historyLocation;

    @Override
    public void createNewInstance() {
        this.historyLocation = new HistoryLocation();
    }

    @Override
    public HistoryLocation withLatitude(double latitude) {
        this.historyLocation.setLatitude(latitude);
        return this.historyLocation;
    }

    @Override
    public HistoryLocation withLongitude(double longitude) {
        this.historyLocation.setLongitude(longitude);
        return this.historyLocation;
    }

    @Override
    public HistoryLocation withDescription(String description) {
        this.historyLocation.setDescription(description);
        return this.historyLocation;
    }
}
