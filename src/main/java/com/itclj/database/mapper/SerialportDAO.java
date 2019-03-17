package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Serialport;



public interface SerialportDAO {
    int deleteByPrimaryKey(Long portnumber);

    int insert(Serialport record);

    int insertSelective(Serialport record);

    Serialport selectByPrimaryKey(Long portnumber);
    
    List<Serialport> getSerialPort(Map<String, Object> param);

    int updateByPrimaryKeySelective(Serialport record);

    int updateByPrimaryKey(Serialport record);
}