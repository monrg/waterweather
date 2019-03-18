package com.example.waterualitymonitor.service;

import com.example.waterualitymonitor.domain.TAmonitoring;
import com.example.waterualitymonitor.domain.TMeteorologicalValue;
import com.example.waterualitymonitor.domain.TjcRecording;

import java.util.List;

public interface ShowTaService {
    public TAmonitoring showOneTaFun();
    public List<TAmonitoring> showTenTaFun();



}
