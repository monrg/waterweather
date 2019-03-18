package com.example.waterualitymonitor.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Tmonitoring_factorManage", schema = "WaterWeatherTable", catalog = "")
public class TmonitoringFactorManage {
    private String tmonitoringFactorId;
    private String tmonitoringFactorName;
    private Double stanardUpLimit;
    private Double stanardFloorLimit;
    private Double effectiveValueUpLimit;
    private Double effectiveValueValueLimit;
    private byte wheatherToEnable;

    @Id
    @Column(name = "tmonitoring_factor_id")
    public String getTmonitoringFactorId() {
        return tmonitoringFactorId;
    }

    public void setTmonitoringFactorId(String tmonitoringFactorId) {
        this.tmonitoringFactorId = tmonitoringFactorId;
    }

    @Basic
    @Column(name = "tmonitoring_factor_name")
    public String getTmonitoringFactorName() {
        return tmonitoringFactorName;
    }

    public void setTmonitoringFactorName(String tmonitoringFactorName) {
        this.tmonitoringFactorName = tmonitoringFactorName;
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
