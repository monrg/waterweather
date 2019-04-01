package com.example.waterualitymonitor.domain;


import java.util.Objects;


public class TMeteorologica {
    private String meteorologicalId;
    private String meteorologicalName;


    public String getMeteorologicalId() {
        return meteorologicalId;
    }

    public void setMeteorologicalId(String meteorologicalId) {
        this.meteorologicalId = meteorologicalId;
    }


    public String getMeteorologicalName() {
        return meteorologicalName;
    }

    public void setMeteorologicalName(String meteorologicalName) {
        this.meteorologicalName = meteorologicalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMeteorologica that = (TMeteorologica) o;
        return Objects.equals(meteorologicalId, that.meteorologicalId) &&
                Objects.equals(meteorologicalName, that.meteorologicalName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(meteorologicalId, meteorologicalName);
    }
}
