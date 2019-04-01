package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.AlarmTypeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface AlarmTypeMapper {
     AlarmTypeEntity addAlarmType(AlarmTypeEntity alarmTypeEntity);
     AlarmTypeEntity deleteAlarmTypeById(Integer id);
     List<AlarmTypeMapper> selectAllAlarmType();
}
