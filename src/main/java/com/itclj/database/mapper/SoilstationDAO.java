package com.itclj.database.mapper;

import com.itclj.database.entity.Soilstation;

public interface SoilstationDAO {
    int deleteByPrimaryKey(String stationid);

    int insert(Soilstation record);

    int insertSelective(Soilstation record);

    Soilstation selectByPrimaryKey(String stationid);

    int updateByPrimaryKeySelective(Soilstation record);

    int updateByPrimaryKey(Soilstation record);
}