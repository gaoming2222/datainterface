package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.Rain;
import com.itclj.database.entity.RainBS;



public interface RainDAO {
    int insert(Rain record);

    public int insertRainList(List<Rain> records);
    
    public int insertRpRainList(List<Rain> records);
    
    
    public List<Rain> getRainList(Map<String,Object> param);
        
    public int updateRainList(List<Rain> records);
    
    public int deleteRain(Rain record);
    
    public int insertSelective(Rain record);
    
    
    
    public List<RainBS> getRainListBS(Map<String,Object> param);

    public int insertRainListBS(List<RainBS> records);

	public int updateRainListBS(List<RainBS> records);

	public int deleteRainBS(RainBS record);
}