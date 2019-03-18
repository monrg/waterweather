package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TAfactorManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TAfactorManagerMapper {
    List<TAfactorManage> getAll();
}
