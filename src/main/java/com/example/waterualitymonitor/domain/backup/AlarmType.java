package com.example.waterualitymonitor.domain.backup;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class AlarmType {
    private int alarmTypeId;
    private String earlyWarning;
    private String overproof;
    private String invalidData;
    private String missData;

    @Id
    @Column(name = "alarm_type_id")
    public int getAlarmTypeId() {
        return alarmTypeId;
    }

    public void setAlarmTypeId(int alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }

    @Basic
    @Column(name = "early_warning")
    public String getEarlyWarning() {
        return earlyWarning;
    }

    public void setEarlyWarning(String earlyWarning) {
        this.earlyWarning = earlyWarning;
    }

    @Basic
    @Column(name = "overproof")
    public String getOverproof() {
        return overproof;
    }

    public void setOverproof(String overproof) {
        this.overproof = overproof;
    }

    @Basic
    @Column(name = "invalid_data")
    public String getInvalidData() {
        return invalidData;
    }

    public void setInvalidData(String invalidData) {
        this.invalidData = invalidData;
    }

    @Basic
    @Column(name = "miss_data")
    public String getMissData() {
        return missData;
    }

    public void setMissData(String missData) {
        this.missData = missData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmType alarmType = (AlarmType) o;
        return alarmTypeId == alarmType.alarmTypeId &&
                Objects.equals(earlyWarning, alarmType.earlyWarning) &&
                Objects.equals(overproof, alarmType.overproof) &&
                Objects.equals(invalidData, alarmType.invalidData) &&
                Objects.equals(missData, alarmType.missData);
    }

    @Override
    public int hashCode() {

        return Objects.hash(alarmTypeId, earlyWarning, overproof, invalidData, missData);
    }
}
