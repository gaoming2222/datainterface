package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Soildata;



public interface SoildataDAO {
    int insert(Soildata record);

    int insertSelective(Soildata record);
    
    int insertSoilList(List<Soildata> records);
    
    int updateSoilList(List<Soildata> records);
    
    int deleteSoil(Soildata record);
    
    int getSoilList(Map<String,Object> param);
}