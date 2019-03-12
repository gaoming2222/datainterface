package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.HydlStation;

public interface HydlstationDAO {
    public int deleteByPrimaryKey(String[] stationids);
    
    public int insertHydlstationList(List<HydlStation> records);
    
    public int updateHydlstationList(List<HydlStation> records);
    
    public List<HydlStation> selectHydlstationList(Map<String,Object> param);

    public int insert(HydlStation record);

    public int insertSelective(HydlStation record);

    public int updateByPrimaryKeySelective(HydlStation record);

    public int updateByPrimaryKey(HydlStation record);
}