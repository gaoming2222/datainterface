package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Currentdata;



public interface CurrentdataDAO {
    int deleteByPrimaryKey(String stationid);

    int insert(Currentdata record);
    
    int batchInsert(List<Currentdata> records);

    int insertSelective(Currentdata record);

    int updateByPrimaryKeySelective(Currentdata record);

    int updateByPrimaryKey(Currentdata record);
    
    

    public List<Currentdata> getCurrentdataList(Map<String,Object> param);
    
    public int insertCurrentdata(List<Currentdata> records);

	public int updateCurrentdata(List<Currentdata> records);

	public int deleteCurrentdata(Currentdata record);

}