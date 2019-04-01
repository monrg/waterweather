package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TMeteorologica;
import com.example.waterualitymonitor.domain.TMeteorologicalValue;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface TmeteorologicaValueMapper {
    TMeteorologicalValue getOne();
    List<TMeteorologicalValue> getTen();

    List<TMeteorologicalValue> getDay(Timestamp now);
    List<TMeteorologicalValue> getWeek(Timestamp start, Timestamp end);
    List<TMeteorologicalValue> getMonth(Timestamp now);


    //获取一天数据并按照小时，天,周求平均值
    List<TMeteorologicalValue> gethourAvg(Timestamp now);
    List<TMeteorologicalValue> getDayhAvg(Timestamp now);
    List<TMeteorologicalValue> getWeekAvg(Timestamp start, Timestamp end);




}
