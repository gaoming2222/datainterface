package com.itclj.database.mapper;

import com.itclj.database.entity.Warninginfo;
import java.math.BigDecimal;

public interface WarninginfoDAO {
    int deleteByPrimaryKey(BigDecimal infoid);

    int insert(Warninginfo record);

    int insertSelective(Warninginfo record);

    Warninginfo selectByPrimaryKey(BigDecimal infoid);

    int updateByPrimaryKeySelective(Warninginfo record);

    int updateByPrimaryKey(Warninginfo record);
}