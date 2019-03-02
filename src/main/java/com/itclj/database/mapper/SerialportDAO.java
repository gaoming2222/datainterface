package com.itclj.database.mapper;

import com.itclj.database.entity.Serialport;

public interface SerialportDAO {
    int deleteByPrimaryKey(Long portnumber);

    int insert(Serialport record);

    int insertSelective(Serialport record);

    Serialport selectByPrimaryKey(Long portnumber);

    int updateByPrimaryKeySelective(Serialport record);

    int updateByPrimaryKey(Serialport record);
}