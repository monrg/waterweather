package com.example.waterualitymonitor.service;



import com.example.waterualitymonitor.domain.AlarmTypeEntity;
import com.example.waterualitymonitor.respository.AlarmTypeMapper;

import java.util.List;

public interface AlarmTypeService {
    List<AlarmTypeMapper> catAllAlarmType();
    AlarmTypeEntity addType(AlarmTypeEntity alarmTypeEntity);
    AlarmTypeEntity deleteType(Integer id);
}
