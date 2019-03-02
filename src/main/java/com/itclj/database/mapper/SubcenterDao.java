package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;

import com.itclj.database.entity.Subcenter;

/**
 * 
 * @author gaoming
 *
 */

public interface SubcenterDao {
	
	public List<Subcenter> getSubcenter(Map<String, Object> param);
	public int  insertSubcenter(List<Subcenter> subcenters);
	public int  updateSubcenter(List<Subcenter> subcenters);
	public int  deleteSubcenter(String[] subcenterIds);
}
