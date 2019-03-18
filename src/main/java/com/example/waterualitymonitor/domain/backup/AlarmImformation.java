package com.example.waterualitymonitor.domain.backup;

import javax.persistence.*;
import java.util.Objects;
public class AlarmImformation {
    private int alarmImformationId;
    private Integer monitorFactor;
    private Integer alarmTypeId;
    private String alarmTime;
    private String standardLimit;
    private String effectiveRange;
    private String actualValue;

    @Id
    @Column(name = "alarm_imformation_id")
    public int getAlarmImformationId() {
        return alarmImformationId;
    }

    public void setAlarmImformationId(int alarmImformationId) {
        this.alarmImformationId = alarmImformationId;
    }

    @Basic
    @Column(name = "monitor_factor")
    public Integer getMonitorFactor() {
        return monitorFactor;
    }

    public void setMonitorFactor(Integer monitorFactor) {
        this.monitorFactor = monitorFactor;
    }

    @Basic
    @Column(name = "alarm_type_id")
    public Integer getAlarmTypeId() {
        return alarmTypeId;
    }

    public void setAlarmTypeId(Integer alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }

    @Basic
    @Column(name = "alarm_time")
    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Basic
    @Column(name = "standard_limit")
    public String getStandardLimit() {
        return standardLimit;
    }

    public void setStandardLimit(String standardLimit) {
        this.standardLimit = standardLimit;
    }

    @Basic
    @Column(name = "effective_range")
    public String getEffectiveRange() {
        return effectiveRange;
    }

    public void setEffectiveRange(String effectiveRange) {
        this.effectiveRange = effectiveRange;
    }

    @Basic
    @Column(name = "actual_value")
    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmImformation that = (AlarmImformation) o;
        return alarmImformationId == that.alarmImformationId &&
                Objects.equals(monitorFactor, that.monitorFactor) &&
                Objects.equals(alarmTypeId, that.alarmTypeId) &&
                Objects.equals(alarmTime, that.alarmTime) &&
                Objects.equals(standardLimit, that.standardLimit) &&
                Objects.equals(effectiveRange, that.effectiveRange) &&
                Objects.equals(actualValue, that.actualValue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(alarmImformationId, monitorFactor, alarmTypeId, alarmTime, standardLimit, effectiveRange, actualValue);
    }
}
