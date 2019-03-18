package com.example.waterualitymonitor.domain.backup;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "alarm_processing_log", schema = "WaterWeatherTable", catalog = "")
public class AlarmProcessingLog {
    private int alarmProcessId;
    private Integer monitorFactorId;
    private String procesTime;
    private String processMode;
    private String handler;
    private String processProgress;
    private String processDetail;

    @Id
    @Column(name = "alarm_process_id")
    public int getAlarmProcessId() {
        return alarmProcessId;
    }

    public void setAlarmProcessId(int alarmProcessId) {
        this.alarmProcessId = alarmProcessId;
    }

    @Basic
    @Column(name = "monitor_factor_id")
    public Integer getMonitorFactorId() {
        return monitorFactorId;
    }

    public void setMonitorFactorId(Integer monitorFactorId) {
        this.monitorFactorId = monitorFactorId;
    }

    @Basic
    @Column(name = "proces_time")
    public String getProcesTime() {
        return procesTime;
    }

    public void setProcesTime(String procesTime) {
        this.procesTime = procesTime;
    }

    @Basic
    @Column(name = "process_mode")
    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    @Basic
    @Column(name = "handler")
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    @Basic
    @Column(name = "process_progress")
    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    @Basic
    @Column(name = "process_detail")
    public String getProcessDetail() {
        return processDetail;
    }

    public void setProcessDetail(String processDetail) {
        this.processDetail = processDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmProcessingLog that = (AlarmProcessingLog) o;
        return alarmProcessId == that.alarmProcessId &&
                Objects.equals(monitorFactorId, that.monitorFactorId) &&
                Objects.equals(procesTime, that.procesTime) &&
                Objects.equals(processMode, that.processMode) &&
                Objects.equals(handler, that.handler) &&
                Objects.equals(processProgress, that.processProgress) &&
                Objects.equals(processDetail, that.processDetail);
    }

    @Override
    public int hashCode() {

        return Objects.hash(alarmProcessId, monitorFactorId, procesTime, processMode, handler, processProgress, processDetail);
    }
}
