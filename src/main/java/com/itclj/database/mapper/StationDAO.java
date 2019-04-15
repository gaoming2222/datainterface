package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Station;

public interface StationDAO {
	
    public List<Station> selectStationList(Map<String,Object> param);
    
	public int insert(Station record);

	public int updateStation(Station record);

	public int deleteStation(Station record);

}
