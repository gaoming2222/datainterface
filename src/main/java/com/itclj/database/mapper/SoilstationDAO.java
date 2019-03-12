package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Soilstation;

public interface SoilstationDAO {
	public int deleteByPrimaryKey(String[] stationids);

	public int insert(Soilstation record);
    
    public int insertSoilstationList(List<Soilstation> records);

    public int insertSelective(Soilstation record);

    public List<Soilstation> selectByPrimaryKey(Map<String, Object> param);

    public int updateByPrimaryKeySelective(Soilstation record);

    public int updateByPrimaryKey(Soilstation record);
}