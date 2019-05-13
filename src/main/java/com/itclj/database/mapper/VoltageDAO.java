package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Voltage;
import com.itclj.database.entity.VoltageBS;

public interface VoltageDAO {
	public int insert(Voltage record);

	public int insertSelective(Voltage record);
    
	public int insertVoltageList(List<Voltage> records);
	
	public int insertRpVoltageList(List<Voltage> records);
    
	public int updateVolatgeList(List<Voltage> records);
    
	public int deleteVoltage(Voltage voltage);
    
	public List<Voltage> getVoltageList(Map<String,Object> param);
	
	public List<VoltageBS> getVoltageListBS(Map<String,Object> param);

	public int insertVoltageListBS(List<VoltageBS> records);

	public int updateVolatgeListBS(List<VoltageBS> records);

	public int deleteVoltageBS(VoltageBS voltage);

}