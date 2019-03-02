package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Water;

public interface WaterDAO {
    int insert(Water record);

    int insertSelective(Water record);
    
    int insertWaterList(List<Water> records);
    
    int updateWaterList(List<Water> records);
    
    List<Water> getWaterList(Map<String,Object> param);
    
    int deleteWater(Water record);
}