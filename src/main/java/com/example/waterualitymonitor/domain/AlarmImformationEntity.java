package com.example.waterualitymonitor.domain;

public class AlarmImformationEntity {
    private int alarmImformationId;
    private String monitorFactor;
    private Integer alarmTypeId;
    private String alarmTime;
    private String standardLimit;
    private String effectiveRange;
    private String actualValue;


    public int getAlarmImformationId() {
        return alarmImformationId;
    }

    public void setAlarmImformationId(int alarmImformationId) {
        this.alarmImformationId = alarmImformationId;
    }


    public String getMonitorFactor() {
        return monitorFactor;
    }

    public void setMonitorFactor(String monitorFactor) {
        this.monitorFactor = monitorFactor;
    }


    public Integer getAlarmTypeId() {
        return alarmTypeId;
    }

    public void setAlarmTypeId(Integer alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }


    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }


    public String getStandardLimit() {
        return standardLimit;
    }

    public void setStandardLimit(String standardLimit) {
        this.standardLimit = standardLimit;
    }


    public String getEffectiveRange() {
        return effectiveRange;
    }

    public void setEffectiveRange(String effectiveRange) {
        this.effectiveRange = effectiveRange;
    }


    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
