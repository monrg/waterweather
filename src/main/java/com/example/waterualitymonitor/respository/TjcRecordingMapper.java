package com.example.waterualitymonitor.respository;

import com.example.waterualitymonitor.domain.TjcRecording;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface TjcRecordingMapper {
    TjcRecording getOne();
    List<TjcRecording> getTen();

    List<TjcRecording> getDay(Timestamp now);
    List<TjcRecording> getWeek(Timestamp start,Timestamp end);
    List<TjcRecording> getMonth(Timestamp now);


    //获取一天数据并按照小时，天,周求平均值
    List<TjcRecording> gethourAvg(Timestamp now);
    List<TjcRecording> getDayhAvg(Timestamp now);
    List<TjcRecording> getWeekAvg(Timestamp start, Timestamp end);

}
