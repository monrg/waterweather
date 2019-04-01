package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TAmonitoring;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface TAmonitoringMapper {
    //获取一条
    TAmonitoring getOne();
    List<TAmonitoring> getTen();

    //获取一天数据
    List<TAmonitoring> getDay(Timestamp now);
    List<TAmonitoring> getMonth(Timestamp now);
    List<TAmonitoring> getWeek(Timestamp start, Timestamp end);

    //获取一天数据并按照小时，天,周求平均值
    List<TAmonitoring> gethourAvg(Timestamp now);
    List<TAmonitoring> getDayhAvg(Timestamp now);
    List<TAmonitoring> getWeekAvg(Timestamp start, Timestamp end);

}
