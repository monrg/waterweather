package com.example.waterualitymonitor.service.serviceimpl;

import com.example.waterualitymonitor.domain.TjcRecording;
import com.example.waterualitymonitor.respository.TjcMonitoringFactorMannageMapper;
import com.example.waterualitymonitor.respository.TjcRecordingMapper;
import com.example.waterualitymonitor.service.ShowJcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowJcServiceImpl implements ShowJcService {

    //监测因子管理数据
    @Autowired
    TjcMonitoringFactorMannageMapper tjcMonitoringFactorMannageMapper;

    //监测因子管理数据
    @Autowired
    TjcRecordingMapper tjcRecordingMapper;


    @Override
    public TjcRecording showOneJcFun() {
        TjcRecording one = tjcRecordingMapper.getOne();
        return one;
    }

    @Override
    public List<TjcRecording> showTenJcFun() {
        List<TjcRecording> ten = tjcRecordingMapper.getTen();
        return ten;
    }

}
