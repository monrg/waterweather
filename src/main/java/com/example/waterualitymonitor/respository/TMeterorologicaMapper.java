package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TMeteorologica;
import com.example.waterualitymonitor.domain.TMeteorologicalValue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TMeterorologicaMapper {
    List<TMeteorologica> getAll();
}
