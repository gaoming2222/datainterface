package com.itclj.database.mapper;

import com.itclj.database.entity.Watertoflow;

public interface WatertoflowDAO {
    int insert(Watertoflow record);

    int insertSelective(Watertoflow record);
}