package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Rain;



public interface RainDAO {
    int insert(Rain record);

    int insertRainList(List<Rain> records);
    
    List<Rain> getRainList(Map<String,Object> param);
    
    int updateRainList(List<Rain> records);
    
    int deleteRain(Rain record);
    
    int insertSelective(Rain record);
}