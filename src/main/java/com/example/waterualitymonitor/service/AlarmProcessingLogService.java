package com.example.waterualitymonitor.service;


import com.example.waterualitymonitor.domain.AlarmProcessingLogEntity;

import java.time.LocalDateTime;

public interface AlarmProcessingLogService {
    AlarmProcessingLogEntity selectByMonitor();

    //修改数据库处理时间的类型
    AlarmProcessingLogEntity selectByProcessTime(LocalDateTime start, LocalDateTime end);

    AlarmProcessingLogEntity selectByHandler(String handlerName);

    AlarmProcessingLogEntity insertAlarmProcessLog(AlarmProcessingLogEntity alarmProcessingLogEntity);
}
