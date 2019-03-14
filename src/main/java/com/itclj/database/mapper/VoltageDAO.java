package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Voltage;

public interface VoltageDAO {
	public int insert(Voltage record);

	public int insertSelective(Voltage record);
    
	public int insertVoltageList(List<Voltage> records);
    
	public int updateVolatgeList(List<Voltage> records);
    
	public int deleteVoltage(Voltage voltage);
    
	public List<Voltage> getVoltageList(Map<String,Object> param);
}