package com.example.waterualitymonitor.service.serviceimpl;

import com.example.waterualitymonitor.domain.TAmonitoring;
import com.example.waterualitymonitor.domain.TMeteorologicalValue;
import com.example.waterualitymonitor.domain.TjcRecording;
import com.example.waterualitymonitor.respository.*;
import com.example.waterualitymonitor.service.ShowTaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowTaServiceImpl implements ShowTaService {

    //岸边监测管理数据
    @Autowired
    TAfactorManagerMapper tAfactorManagerMapper;

    //岸边监测数据
    @Autowired
    TAmonitoringMapper tAmonitoringMapper;



    @Override
    public TAmonitoring showOneTaFun() {
        TAmonitoring one = tAmonitoringMapper.getOne();

        return one;
    }

    @Override
    public List<TAmonitoring> showTenTaFun() {
        List<TAmonitoring> ten = tAmonitoringMapper.getTen();
        return ten;
    }


}
