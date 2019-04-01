package com.example.waterualitymonitor.service.serviceimpl;


import com.example.waterualitymonitor.domain.AlarmProcessingLogEntity;
import com.example.waterualitymonitor.respository.AlarmProcessingLogMapper;
import com.example.waterualitymonitor.service.AlarmProcessingLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
public class AlarmProcessingLogServiceImpl implements AlarmProcessingLogService {

    private AlarmProcessingLogMapper alarmProcessingLogMapper;

    @Override
    public AlarmProcessingLogEntity selectByMonitor() {
        return alarmProcessingLogMapper.selectByMonitor();
    }

    @Override
    public AlarmProcessingLogEntity selectByProcessTime(LocalDateTime start, LocalDateTime end) {
        return alarmProcessingLogMapper.selectByProcessTime(start,end);
    }

    @Override
    public AlarmProcessingLogEntity selectByHandler(String handlerName) {
        return alarmProcessingLogMapper.selectByHandler(handlerName);
    }

    @Override
    public AlarmProcessingLogEntity insertAlarmProcessLog(AlarmProcessingLogEntity alarmProcessingLogEntity) {
        return alarmProcessingLogMapper.insertAlarmProcessLog(alarmProcessingLogEntity);
    }
}
