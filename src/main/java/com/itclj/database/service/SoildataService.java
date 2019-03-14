package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.Soildata;
import com.itclj.database.mapper.SoildataDAO;

@Service
public class SoildataService {
	private static Logger logger = Logger.getLogger(SoildataService.class);
	
	@Autowired
	private SoildataDAO soildataDAO;
	
	/**
	 * 根据参数 查询墒情信息
	 * @param param
	 * @return
	 */
	public List<Soildata> getSoildataList(Map<String,Object> param) {
		List<Soildata> retList = new ArrayList<Soildata>();
		logger.info("开始查询墒情数据" + param);
		try {
			retList = soildataDAO.getSoilList(param);
		}catch (Exception e) {
			logger.error("查询墒情数据出错" + e.getMessage());
			return null;
		}
		logger.info("墒情数据查询完成");
		return retList;
	}
	
	/**
	 * 批量插入墒情数据
	 * @param soildataList
	 * @return
	 */
	public int insertSoildata(List<Soildata> soildataList) {
		logger.info("开始插入墒情数据" + soildataList);
		int result = 0;
		if(soildataList == null || soildataList.size() == 0) {
			return 0;
		}
		try {
			result = soildataDAO.insertSoilList(soildataList);
		}catch (Exception e) {
			logger.error("墒情信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("墒情数据插入完成" + result);
		return result;
	}
	
	/**
	 * 批量更新墒情数据
	 * @param soildataList
	 * @return
	 */
	public int updateSoildata(List<Soildata> SoildataList) {
		logger.info("开始更新墒情数据" + SoildataList);
		int result = 0;
		try {
			result = result + soildataDAO.updateSoilList(SoildataList);
		}catch (Exception e) {
			logger.error("墒情数据更新失败" + e.getMessage());
			return -1;
		}
		logger.info("墒情数据更新完成" + result);
		return result;
	}
	
	/**
	 * 删除墒情数据
	 * @param soildataList
	 * @return
	 */
	public int deleteSoildata(List<Soildata> soildataList) {
		logger.info("开始删除墒情数据" + soildataList.size());
		int result = 0;
		try {
			for (Soildata soildata : soildataList) {
				result = result + soildataDAO.deleteSoil(soildata);
			}
		}catch (Exception e) {
			logger.error("删除墒情数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除墒情数据完成" + result);
		return result;
	}
	
	
}
