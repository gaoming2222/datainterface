package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Errorlog;

public interface ErrorlogDAO {
    int insert(Errorlog record);

    int insertSelective(Errorlog record);
    
    List<Errorlog> getErrorlog(Map<String,Object> param);

}