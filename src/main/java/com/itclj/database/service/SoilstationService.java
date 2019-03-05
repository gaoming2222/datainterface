package com.itclj.database.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.Soilstation;
import com.itclj.database.mapper.SoilstationDAO;

/**
 * 
 * @author 
 *	墒情站管理service
 */
@Service
public class SoilstationService {
	private static Logger logger = Logger.getLogger(SoilstationService.class);
	
	@Autowired
	private SoilstationDAO soilstationDAO;
	/**
	 * 查询墒情站信息
	 * @param param
	 * @return
	 */
	public List<Soilstation> getSoilstationList(Map<String,Object> param){
		List<Soilstation> retList = new ArrayList<Soilstation>();
		logger.info("开始查询墒情站信息" + param);
		try {
			//String stationid = (String) param.get("stationid");
			
			retList =  soilstationDAO.selectByPrimaryKey(param);
			
		}catch(Exception e) {
			logger.error("查询墒情站信息失败" + e.getMessage());
			return null;
		}
		logger.info("查询墒情站信息完成" );
		return retList;
	}
	/**
	 * 插入墒情站信息
	 * @param soilstationList
	 * @return
	 */
	public int insertSoilstation(List<Soilstation> soilstationList) {
		logger.info("开始插入墒情站信息" + soilstationList.size());
		int result = 0;
		try {
			for(Soilstation soilstation : soilstationList)
				result = result + soilstationDAO.insert(soilstation);
		}catch (Exception e) {
			logger.error("墒情站信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入墒情站信息完成" + result);
		return result;
	}
	/**
	 * 更新墒情站信息
	 * @param soilstationList
	 * @return
	 */
	public int updateSoilstation(List<Soilstation> soilstationList) {
		logger.info("开始更新墒情站信息" + soilstationList.size());
		int result = 0;
		try {
			for (Soilstation soilstation : soilstationList) {
				result = result + soilstationDAO.updateByPrimaryKey(soilstation);
			}
		}catch (Exception e) {
			logger.error("墒情站信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("更新墒情站信息完成" + result);
		return result;
	}
	/**
	 * 删除墒情测站信息
	 * @param soilstationList
	 * @return
	 */
	public int deleteSoilstation(List<Soilstation> soilstationList) {
		logger.info("开始删除墒情站信息" + soilstationList.size());
		int result = 0;
		try {
			for (Soilstation soilstation : soilstationList) {
				result = result + soilstationDAO.deleteByPrimaryKey(soilstation.getStationid());
			}
		}catch (Exception e) {
			logger.error("删除墒情站信息失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除墒情站信息完成" + result);
	return result;
	}

}
