package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Soilstation;

public interface SoilstationDAO {
    int deleteByPrimaryKey(String stationid);

    int insert(Soilstation record);
    
    public int insertSoilstationList(List<Soilstation> records);

    int insertSelective(Soilstation record);

    public List<Soilstation> selectByPrimaryKey(Map<String, Object> param);

    int updateByPrimaryKeySelective(Soilstation record);

    int updateByPrimaryKey(Soilstation record);
}