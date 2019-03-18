package com.example.waterualitymonitor.service.serviceimpl;

import com.example.waterualitymonitor.domain.TMeteorologicalValue;
import com.example.waterualitymonitor.respository.TMeterorologicaMapper;
import com.example.waterualitymonitor.respository.TmeteorologicaValueMapper;
import com.example.waterualitymonitor.service.ShowMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowMeServiceImpl implements ShowMeService {

    //气象管理数据
    @Autowired
    TMeterorologicaMapper tMeterorologicaMapper;

    //气象数据
    @Autowired
    TmeteorologicaValueMapper tmeteorologicaValueMapper;
    @Override
    public TMeteorologicalValue showOneMetFun() {
        TMeteorologicalValue one = tmeteorologicaValueMapper.getOne();
        return one;
    }

    @Override
    public List<TMeteorologicalValue> showTenMetun() {
        List<TMeteorologicalValue> ten = tmeteorologicaValueMapper.getTen();
        return ten;
    }
}
