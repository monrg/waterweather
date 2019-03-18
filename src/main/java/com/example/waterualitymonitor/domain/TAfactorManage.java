package com.example.waterualitymonitor.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TAfactorManage {
    private String taFactorId;
    private String taname;
    private Double stanardUpLimit;
    private Double stanardFloorLimit;
    private Double effectiveValueUpLimit;
    private Double effectiveValueValueLimit;
    private byte wheatherToEnable;

    @Id
    @Column(name = "TA_factor_id")
    public String getTaFactorId() {
        return taFactorId;
    }

    public void setTaFactorId(String taFactorId) {
        this.taFactorId = taFactorId;
    }

    @Basic
    @Column(name = "Taname")
    public String getTaname() {
        return taname;
    }

    public void setTaname(String taname) {
        this.taname = taname;
    }

    @Basic
    @Column(name = "stanard_up_limit")
    public Double getStanardUpLimit() {
        return stanardUpLimit;
    }

    public void setStanardUpLimit(Double stanardUpLimit) {
        this.stanardUpLimit = stanardUpLimit;
    }

    @Basic
    @Column(name = "stanard_floor_limit")
    public Double getStanardFloorLimit() {
        return stanardFloorLimit;
    }

    public void setStanardFloorLimit(Double stanardFloorLimit) {
        this.stanardFloorLimit = stanardFloorLimit;
    }

    @Basic
    @Column(name = "effective_value_up_limit")
    public Double getEffectiveValueUpLimit() {
        return effectiveValueUpLimit;
    }

    public void setEffectiveValueUpLimit(Double effectiveValueUpLimit) {
        this.effectiveValueUpLimit = effectiveValueUpLimit;
    }

    @Basic
    @Column(name = "effective_value_value_limit")
    public Double getEffectiveValueValueLimit() {
        return effectiveValueValueLimit;
    }

    public void setEffectiveValueValueLimit(Double effectiveValueValueLimit) {
        this.effectiveValueValueLimit = effectiveValueValueLimit;
    }

    @Basic
    @Column(name = "wheather_to_enable")
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
