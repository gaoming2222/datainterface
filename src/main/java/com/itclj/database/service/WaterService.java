package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.Water;
import com.itclj.database.mapper.WaterDAO;



@Service
public class WaterService {
	
	private static Logger logger = Logger.getLogger(WaterService.class);
	
	@Autowired
	private WaterDAO waterDAO;
	
	/**
	 * 水位数据查询
	 * @param param
	 * @return
	 */
	public List<Water> getWaterList(Map<String,Object> param) {
		List<Water> retList = new ArrayList<Water>();
		logger.info("开始查询水位数据" + param);
		try {
			retList = waterDAO.getWaterList(param);
		}catch (Exception e) {
			logger.error("查询水位数据出错" + e.getMessage());
			return null;
		}
		logger.info("水位数据查询完成");
		return retList;
	}
	/**
	 * 批量更新水位数据
	 * @param waterList
	 * @return
	 */
	public int updateWater(List<Water> waterList) {
		logger.info("开始更新水位数据" + waterList.size());
		int result = 0;
		try {
			result = result + waterDAO.updateWaterList(waterList);
		}catch (Exception e) {
			logger.error("水位数据更新失败" + e.getMessage());
			return -1;
		}
		logger.info("水位数据更新完成" + result);
		return result;
	}
	/**
	 * 批量插入水位数据
	 * @param waterList
	 * @return
	 */
	public int insertWater(List<Water> waterList) {
		logger.info("开始插入雨量数据" + waterList.size());
		int result = 0;
		if(waterList == null || waterList.size() == 0) {
			return 0;
		}
		try {
			result = waterDAO.insertWaterList(waterList);
		}catch (Exception e) {
			logger.error("水位信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("水位数据插入完成" + result);
		return result;
	}
	/**
	 * 逐条删除水位数据
	 * @param waterList
	 * @return
	 */
	public int deleteWater(List<Water> waterList) {
		logger.info("开始删除水位数据" + waterList.size());
		int result = 0;
		try {
			for (Water water : waterList) {
				result = result + waterDAO.deleteWater(water);
			}
		}catch (Exception e) {
			logger.error("删除水位数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除水位数据完成" + result);
		return result;
	}
	
	

}
