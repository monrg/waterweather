package com.example.waterualitymonitor.service;

import com.example.waterualitymonitor.domain.TMeteorologicalValue;

import java.util.List;

public interface ShowMeService {

    public TMeteorologicalValue showOneMetFun();
    public List<TMeteorologicalValue> showTenMetun();

}
