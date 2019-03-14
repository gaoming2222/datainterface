package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Rain;



public interface RainDAO {
    int insert(Rain record);

    public int insertRainList(List<Rain> records);
    
    public List<Rain> getRainList(Map<String,Object> param);
    
    public int updateRainList(List<Rain> records);
    
    public int deleteRain(Rain record);
    
    public int insertSelective(Rain record);
}