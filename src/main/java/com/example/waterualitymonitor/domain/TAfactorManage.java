package com.example.waterualitymonitor.domain;


import java.util.Objects;


public class TAfactorManage {
    private String taFactorId;
    private String taname;
    private Double stanardUpLimit;
    private Double stanardFloorLimit;
    private Double effectiveValueUpLimit;
    private Double effectiveValueValueLimit;
    private byte wheatherToEnable;

    public String getTaFactorId() {
        return taFactorId;
    }

    public void setTaFactorId(String taFactorId) {
        this.taFactorId = taFactorId;
    }

    public String getTaname() {
        return taname;
    }

    public void setTaname(String taname) {
        this.taname = taname;
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
        TAfactorManage that = (TAfactorManage) o;
        return wheatherToEnable == that.wheatherToEnable &&
                Objects.equals(taFactorId, that.taFactorId) &&
                Objects.equals(taname, that.taname) &&
                Objects.equals(stanardUpLimit, that.stanardUpLimit) &&
                Objects.equals(stanardFloorLimit, that.stanardFloorLimit) &&
                Objects.equals(effectiveValueUpLimit, that.effectiveValueUpLimit) &&
                Objects.equals(effectiveValueValueLimit, that.effectiveValueValueLimit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(taFactorId, taname, stanardUpLimit, stanardFloorLimit, effectiveValueUpLimit, effectiveValueValueLimit, wheatherToEnable);
    }
}
