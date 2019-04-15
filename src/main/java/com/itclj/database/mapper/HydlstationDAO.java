package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.HydlStation;
import com.itclj.database.entity.HydlStationBS;

public interface HydlstationDAO {
    public int deleteByPrimaryKey(String[] stationids);
    
    public int insertHydlstationList(List<HydlStation> records);
    
    public int updateHydlstationList(List<HydlStation> records);
    
    public List<HydlStation> selectHydlstationList(Map<String,Object> param);

    public int insert(HydlStation record);

    public int insertSelective(HydlStation record);

    public int updateByPrimaryKeySelective(HydlStation record);

    public int updateByPrimaryKey(HydlStation record);
    
    
    public List<HydlStationBS> selectHydlstationListBS(Map<String,Object> param);

    public int insertHydlstationBS(HydlStationBS records);

    public int updateHydlstationBS(HydlStationBS records);

    public int deleteHydlstationBS(HydlStationBS records);

}