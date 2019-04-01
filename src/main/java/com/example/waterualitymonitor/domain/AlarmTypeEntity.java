package com.example.waterualitymonitor.domain;


public class AlarmTypeEntity {
    private Integer alarmTypeId;
    private String earlyWarning;
    private String overproof;
    private String invalidData;
    private String missData;

    public AlarmTypeEntity() {
    }

    public AlarmTypeEntity(String earlyWarning, String overproof, String invalidData, String missData) {
        this.earlyWarning = earlyWarning;
        this.overproof = overproof;
        this.invalidData = invalidData;
        this.missData = missData;
    }

    public Integer getAlarmTypeId() {
        return alarmTypeId;
    }

    public void setAlarmTypeId(Integer alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }

    public String getEarlyWarning() {
        return earlyWarning;
    }

    public void setEarlyWarning(String earlyWarning) {
        this.earlyWarning = earlyWarning;
    }

    public String getOverproof() {
        return overproof;
    }

    public void setOverproof(String overproof) {
        this.overproof = overproof;
    }

    public String getInvalidData() {
        return invalidData;
    }

    public void setInvalidData(String invalidData) {
        this.invalidData = invalidData;
    }

    public String getMissData() {
        return missData;
    }

    public void setMissData(String missData) {
        this.missData = missData;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
