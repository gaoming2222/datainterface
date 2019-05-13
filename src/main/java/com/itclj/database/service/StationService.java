package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.Station;
import com.itclj.database.mapper.StationDAO;

/**
 * 
 * @author pure
 * B/S 站点管理
 */
@Service
public class StationService {
	private static Logger logger = Logger.getLogger(StationService.class);
	
	@Autowired
	private StationDAO stationDAO;
	
	/**
	 * 查询站点信息 B/S
	 * @param param
	 * @return 
	 */
	public List<Station> getStationList(Map<String, Object> param){
		List<Station> retList = new ArrayList<Station>();
		logger.info("查询站点信息" + param);
		try{
			retList = stationDAO.selectStationList(param);
		}
		catch(Exception e){
			logger.error("查询站点信息失败" + e.getMessage());
			return null;
		}
		return retList;
	}
	
	/**
	 * 插入站点信息B/S
	 * @param stationList
	 * @return
	 */
	public int insertStation(List<Station> stationList) {
		logger.info("开始插入站点信息" + stationList);
		int result = 0;
		try {
			for (Station station : stationList) {
				result = result + stationDAO.insert(station);
			}
		}catch (Exception e) {
			logger.error("站点信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入站点信息完成" + result);
		return result;
	}
	
	/**
	 * 更新站点信息B/S
	 * @param stationList
	 * @return
	 */
	public int updateStation(List<Station> stationList) {
		logger.info("开始更新站点数据" + stationList.size());
		int result = 0;
		try {
			for (Station station : stationList) {
				result = result + stationDAO.updateStation(station);
			}
		}catch (Exception e) {
			logger.error("更新站点数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("更新站点数据完成" + result);
		return result;
	}
	
	/**
	 * 逐条删除站点数据
	 * @param stationList
	 * @return
	 */
	public int deleteStation(List<Station> stationList) {
		logger.info("开始删除站点数据" + stationList.size());
		int result = 0;
		try {
			for (Station station : stationList) {
				result = result + stationDAO.deleteStation(station);
			}
		}catch (Exception e) {
			logger.error("删除站点数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除站点数据完成" + result);
		return result;
	}
	
}
