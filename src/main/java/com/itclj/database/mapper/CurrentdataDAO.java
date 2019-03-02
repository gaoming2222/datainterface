package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Currentdata;



public interface CurrentdataDAO {
    int deleteByPrimaryKey(String stationid);

    int insert(Currentdata record);
    
    int batchInsert(List<Currentdata> records);

    int insertSelective(Currentdata record);

    List<Currentdata> selectByPrimaryKey(Map<String,Object> param);

    int updateByPrimaryKeySelective(Currentdata record);

    int updateByPrimaryKey(Currentdata record);

	
}