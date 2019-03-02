package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Voltage;

public interface VoltageDAO {
    int insert(Voltage record);

    int insertSelective(Voltage record);
    
    int insertVoltageList(List<Voltage> records);
    
    int updateVolatgeList(List<Voltage> records);
    
    int deleteVoltage(Voltage voltage);
    
    List<Voltage> getVoltageList(Map<String,Object> param);
}