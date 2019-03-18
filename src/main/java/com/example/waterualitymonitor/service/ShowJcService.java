package com.example.waterualitymonitor.service;

import com.example.waterualitymonitor.domain.TjcRecording;

import java.util.List;

public interface ShowJcService {
    public TjcRecording showOneJcFun();
    public List<TjcRecording> showTenJcFun();
}
