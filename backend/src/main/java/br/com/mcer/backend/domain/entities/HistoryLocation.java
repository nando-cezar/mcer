package br.com.mcer.backend.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HistoryLocation {
    private double latitude;
    private double longitude;
    private String description;

    public HistoryLocation() {
    }

    public HistoryLocation(double latitude, double longitude, String description) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
    }

}
