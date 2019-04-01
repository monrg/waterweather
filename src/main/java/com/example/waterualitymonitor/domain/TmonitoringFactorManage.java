package com.example.waterualitymonitor.domain;


import java.util.Objects;

public class TmonitoringFactorManage {
    private String tmonitoringFactorId;
    private String tmonitoringFactorName;
    private Double stanardUpLimit;
    private Double stanardFloorLimit;
    private Double effectiveValueUpLimit;
    private Double effectiveValueValueLimit;
    private byte wheatherToEnable;


    public String getTmonitoringFactorId() {
        return tmonitoringFactorId;
    }

    public void setTmonitoringFactorId(String tmonitoringFactorId) {
        this.tmonitoringFactorId = tmonitoringFactorId;
    }


    public String getTmonitoringFactorName() {
        return tmonitoringFactorName;
    }

    public void setTmonitoringFactorName(String tmonitoringFactorName) {
        this.tmonitoringFactorName = tmonitoringFactorName;
    }

    public Double getStanardUpLimit() {
        return stanardUpLimit;
    }

    public void setStanardUpLimit(Double stanardUpLimit) {
        this.stanardUpLimit = stanardUpLimit;
    }

    public Double getStanardFloorLimit() {
        return stanardFloorLimit;
    }

    public void setStanardFloorLimit(Double stanardFloorLimit) {
        this.stanardFloorLimit = stanardFloorLimit;
    }


    public Double getEffectiveValueUpLimit() {
        return effectiveValueUpLimit;
    }

    public void setEffectiveValueUpLimit(Double effectiveValueUpLimit) {
        this.effectiveValueUpLimit = effectiveValueUpLimit;
    }


    public Double getEffectiveValueValueLimit() {
        return effectiveValueValueLimit;
    }

    public void setEffectiveValueValueLimit(Double effectiveValueValueLimit) {
        this.effectiveValueValueLimit = effectiveValueValueLimit;
    }

    public byte getWheatherToEnable() {
        return wheatherToEnable;
    }

    public void setWheatherToEnable(byte wheatherToEnable) {
        this.wheatherToEnable = wheatherToEnable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TmonitoringFactorManage that = (TmonitoringFactorManage) o;
        return wheatherToEnable == that.wheatherToEnable &&
                Objects.equals(tmonitoringFactorId, that.tmonitoringFactorId) &&
                Objects.equals(tmonitoringFactorName, that.tmonitoringFactorName) &&
                Objects.equals(stanardUpLimit, that.stanardUpLimit) &&
                Objects.equals(stanardFloorLimit, that.stanardFloorLimit) &&
                Objects.equals(effectiveValueUpLimit, that.effectiveValueUpLimit) &&
                Objects.equals(effectiveValueValueLimit, that.effectiveValueValueLimit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tmonitoringFactorId, tmonitoringFactorName, stanardUpLimit, stanardFloorLimit, effectiveValueUpLimit, effectiveValueValueLimit, wheatherToEnable);
    }
}
