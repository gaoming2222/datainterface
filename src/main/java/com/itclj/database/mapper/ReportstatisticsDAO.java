package com.itclj.database.mapper;

import com.itclj.database.entity.Reportstatistics;
import com.itclj.database.entity.ReportstatisticsKey;

public interface ReportstatisticsDAO {
    int deleteByPrimaryKey(ReportstatisticsKey key);

    int insert(Reportstatistics record);

    int insertSelective(Reportstatistics record);

    Reportstatistics selectByPrimaryKey(ReportstatisticsKey key);

    int updateByPrimaryKeySelective(Reportstatistics record);

    int updateByPrimaryKey(Reportstatistics record);
}