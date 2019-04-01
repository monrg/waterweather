package com.example.waterualitymonitor.respository;


import com.example.waterualitymonitor.domain.AlarmImformationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AlarmImformationMapper {

    //检测报警信息


    //记录报警信息
    AlarmImformationMapper writeAlarmImformation(AlarmImformationEntity alarmImformationEntity);

    

}
