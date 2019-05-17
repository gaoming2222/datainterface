package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Splashmapdata;

public interface SplashmapdataDAO {

	
	  List<Splashmapdata> getSplashmapdataList(Map<String,Object> param);
	  
	  int insertSplashmapdata(List<Splashmapdata> list);
	  
	  int updateSplashmapdata(List<Splashmapdata> list);
	
	  
}