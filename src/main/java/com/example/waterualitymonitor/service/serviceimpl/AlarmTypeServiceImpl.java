package com.example.waterualitymonitor.service.serviceimpl;


import com.example.waterualitymonitor.domain.AlarmTypeEntity;
import com.example.waterualitymonitor.respository.AlarmTypeMapper;
import com.example.waterualitymonitor.service.AlarmTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AlarmTypeServiceImpl implements AlarmTypeService {

    private AlarmTypeMapper alarmTypeMapper;

    @Override
    public List<AlarmTypeMapper> catAllAlarmType() {
        return alarmTypeMapper.selectAllAlarmType();
    }

    @Override
    public AlarmTypeEntity addType(AlarmTypeEntity alarmTypeEntity) {
        return alarmTypeMapper.addAlarmType(alarmTypeEntity);
    }

    @Override
    public AlarmTypeEntity deleteType(Integer id) {
        return alarmTypeMapper.deleteAlarmTypeById(id);
    }
}
