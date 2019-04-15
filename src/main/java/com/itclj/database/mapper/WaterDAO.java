package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Water;
import com.itclj.database.entity.WaterBS;

public interface WaterDAO {
	public int insert(Water record);

	public int insertSelective(Water record);
    
	public int insertWaterList(List<Water> records);
    
	public int updateWaterList(List<Water> records);
    
	public List<Water> getWaterList(Map<String,Object> param);
	    
	public int deleteWater(Water record);
	
	
	public List<WaterBS> getWaterListBS(Map<String,Object> param);

	public int insertWaterListBS(List<WaterBS> records);

	public int updateWaterListBS(List<WaterBS> records);

	public int deleteWaterBS(WaterBS record);

}