package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.AlarmProcessingLogEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Mapper
@Component
public interface AlarmProcessingLogMapper {
    AlarmProcessingLogEntity selectByMonitor();

    //修改数据库处理时间的类型
    AlarmProcessingLogEntity selectByProcessTime(LocalDateTime start, LocalDateTime end);

    AlarmProcessingLogEntity selectByHandler(String handlerName);

    AlarmProcessingLogEntity insertAlarmProcessLog(AlarmProcessingLogEntity alarmProcessingLogEntity);
}
