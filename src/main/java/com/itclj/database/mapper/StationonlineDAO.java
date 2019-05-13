package com.itclj.database.mapper;

import com.itclj.database.entity.Stationonline;

public interface StationonlineDAO {
    int deleteByPrimaryKey(String stationid);

    int insert(Stationonline record);

    int insertSelective(Stationonline record);

    Stationonline selectByPrimaryKey(String stationid);

    int updateByPrimaryKeySelective(Stationonline record);

    int updateByPrimaryKey(Stationonline record);
}