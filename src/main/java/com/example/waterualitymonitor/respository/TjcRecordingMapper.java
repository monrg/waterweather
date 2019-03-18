package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TjcRecording;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface TjcRecordingMapper {
    TjcRecording getOne();
    List<TjcRecording> getTen();

    List<TjcRecording> getDay();
    List<TjcRecording> getWeek(Timestamp start,Timestamp end);
    List<TjcRecording> getMonth();
}
