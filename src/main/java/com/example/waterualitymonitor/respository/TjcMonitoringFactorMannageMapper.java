package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TmonitoringFactorManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TjcMonitoringFactorMannageMapper {
List<TmonitoringFactorManage> getAll();

}
