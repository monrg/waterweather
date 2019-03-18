package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TAmonitoring;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface TAmonitoringMapper {
    TAmonitoring getOne();
    List<TAmonitoring> getTen();

    List<TAmonitoring> getDay();
    List<TAmonitoring> getMonth();
    List<TAmonitoring> getWeek(Timestamp start, Timestamp end);

}
