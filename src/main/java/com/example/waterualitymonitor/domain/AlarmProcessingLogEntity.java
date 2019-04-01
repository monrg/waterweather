package com.example.waterualitymonitor.domain;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class AlarmProcessingLogEntity {
    private int alarmProcessId;
    private String monitorFactorId;
    private LocalDateTime procesTime;
    private String processMode;
    private String handler;
    private String processProgress;
    private String processDetail;

    public AlarmProcessingLogEntity() {
    }

    public AlarmProcessingLogEntity(int alarmProcessId, String monitorFactorId, LocalDateTime procesTime, String processMode, String handler, String processProgress, String processDetail) {
        this.alarmProcessId = alarmProcessId;
        this.monitorFactorId = monitorFactorId;
        this.procesTime = procesTime;
        this.processMode = processMode;
        this.handler = handler;
        this.processProgress = processProgress;
        this.processDetail = processDetail;
    }

    public AlarmProcessingLogEntity(String monitorFactorId, LocalDateTime procesTime, String processMode, String handler, String processProgress, String processDetail) {
        this.monitorFactorId = monitorFactorId;
        this.procesTime = procesTime;
        this.processMode = processMode;
        this.handler = handler;
        this.processProgress = processProgress;
        this.processDetail = processDetail;
    }

    public int getAlarmProcessId() {
        return alarmProcessId;
    }

    public void setAlarmProcessId(int alarmProcessId) {
        this.alarmProcessId = alarmProcessId;
    }

    public String getMonitorFactorId() {
        return monitorFactorId;
    }

    public void setMonitorFactorId(String monitorFactorId) {
        this.monitorFactorId = monitorFactorId;
    }

    public LocalDateTime getProcesTime() {
        return procesTime;
    }

    public void setProcesTime(LocalDateTime procesTime) {
        this.procesTime = procesTime;
    }

    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public String getProcessDetail() {
        return processDetail;
    }

    public void setProcessDetail(String processDetail) {
        this.processDetail = processDetail;
    }

    @Override
    public String toString() {
        return "AlarmProcessingLogEntity{" +
                "alarmProcessId=" + alarmProcessId +
                ", monitorFactorId='" + monitorFactorId + '\'' +
                ", procesTime=" + procesTime +
                ", processMode='" + processMode + '\'' +
                ", handler='" + handler + '\'' +
                ", processProgress='" + processProgress + '\'' +
                ", processDetail='" + processDetail + '\'' +
                '}';
    }
}
