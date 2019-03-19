package com.itclj.database.mapper;

import com.itclj.database.entity.Warninginfo;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface WarninginfoDAO {
	public int deleteByPrimaryKey(BigDecimal infoid);

	public int insert(Warninginfo record);

	public int insertSelective(Warninginfo record);
    
	public List<Warninginfo> getWarninginfo(Map<String, Object> param);

	public Warninginfo selectByPrimaryKey(BigDecimal infoid);

	public int updateByPrimaryKeySelective(Warninginfo record);

	public int updateByPrimaryKey(Warninginfo record);
}