package com.itclj.database.mapper;

import com.itclj.database.entity.Splashmapdata;

public interface SplashmapdataDAO {
    int deleteByPrimaryKey(String stationid);

    int insert(Splashmapdata record);

    int insertSelective(Splashmapdata record);

    Splashmapdata selectByPrimaryKey(String stationid);

    int updateByPrimaryKeySelective(Splashmapdata record);

    int updateByPrimaryKey(Splashmapdata record);
}