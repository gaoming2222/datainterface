package com.itclj.database.mapper;

import com.itclj.database.entity.Errorlog;

public interface ErrorlogDAO {
    int insert(Errorlog record);

    int insertSelective(Errorlog record);
}