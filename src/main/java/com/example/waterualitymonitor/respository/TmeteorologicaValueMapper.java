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

    List<TMeteorologicalValue> getDAy();
    List<TMeteorologicalValue> getWeek(Timestamp start, Timestamp end);
    List<TMeteorologicalValue> getMonth();



}
