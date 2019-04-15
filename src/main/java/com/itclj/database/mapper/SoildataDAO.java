package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Soildata;
import com.itclj.database.entity.SoildataBS;



public interface SoildataDAO {
	public int insert(Soildata record);

    public int insertSelective(Soildata record);
    
    public int insertSoilList(List<Soildata> records);
    
    public int updateSoilList(List<Soildata> records);
    
    public int deleteSoil(Soildata record);
    
    public List<Soildata> getSoilList(Map<String,Object> param);
    
    public List<SoildataBS> getSoilListBS(Map<String,Object> param);

}