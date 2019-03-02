package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.HydlStation;
import com.itclj.database.mapper.HydlstationDAO;

/**
 * 
 * @author gaoming
 *	水情测站管理service
 */
@Service
public class HydlstationService {
	
	private static Logger logger = Logger.getLogger(HydlstationService.class);
	
	@Autowired
	private HydlstationDAO hydlstationDAO;
	
	/**
	 * 查询水情站信息
	 * @param param
	 * @return
	 */
	public List<HydlStation> getHydlstationList(Map<String,Object> param){
		List<HydlStation> retList = new ArrayList<HydlStation>();
		logger.info("开始查询水情站信息" + param);
		try {
			retList = hydlstationDAO.selectByPrimaryKey(param);
		}catch(Exception e) {
			logger.error("查询水情站信息失败" + e.getMessage());
			return null;
		}
		logger.info("查询水情站信息完成" + retList.size());
		return retList;
	}
	/**
	 * 插入水情站信息
	 * @param hydlStationList
	 * @return
	 */
	public int insertHydlStation(List<HydlStation> hydlStationList) {
		logger.info("开始插入水情站信息" + hydlStationList.size());
		int result = 0;
		try {
			result = hydlstationDAO.insertHydlstationList(hydlStationList);
		}catch (Exception e) {
			logger.error("水情站信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入水情站信息完成" + result);
		return result;
	}
	
	/**
	 * 更新水情站信息
	 * @param hydlStationList
	 * @return
	 */
	public int updateHydlStation(List<HydlStation> hydlStationList) {
		logger.info("开始更新水情站信息" + hydlStationList.size());
		int result = 0;
		try {
			result = result + hydlstationDAO.updateHydlstationList(hydlStationList);
		}catch (Exception e) {
			logger.error("水情站信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("更新水情站信息完成" + result);
		return result;
	}
	/**
	 * 删除水情测站信息
	 * @param hydlStationList
	 * @return
	 */
	public int deleteHydlStation(List<HydlStation>  hydlStationList) {
		logger.info("开始删除水情站信息" + hydlStationList.size());
		int result = 0;
		int flag = 0;
		String [] hydlStationIds = new String[hydlStationList.size()];
		try {
			for (HydlStation hydlStation : hydlStationList) {
				hydlStationIds[flag] = hydlStation.getStationid();
				flag++;
			}
			result = result + hydlstationDAO.deleteByPrimaryKey(hydlStationIds);
		}catch (Exception e) {
			logger.error("删除水情站信息失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除水情站信息完成" + result);
		return result;
	}
	
	
	
}
