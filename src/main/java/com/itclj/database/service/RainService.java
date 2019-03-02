package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.Rain;
import com.itclj.database.mapper.RainDAO;

/***
 * 雨量数据逻辑处理类
 * @author gaoming
 * 
 */
@Service
public class RainService {
	private static Logger logger = Logger.getLogger(RainService.class);
	
	@Autowired
	private RainDAO rainDAO;
	
	/**
	 * 根据参数 查询雨量信息
	 * @param param
	 * @return
	 */
	public List<Rain> getRainList(Map<String,Object> param) {
		List<Rain> retList = new ArrayList<Rain>();
		logger.info("开始查询雨量数据" + param);
		try {
			retList = rainDAO.getRainList(param);
		}catch (Exception e) {
			logger.error("查询雨量数据出错" + e.getMessage());
			return null;
		}
		logger.info("雨量数据查询完成");
		return retList;
	}
	/**
	 * 批量更新雨量数据
	 * @param rainList
	 * @return
	 */
	public int updateRain(List<Rain> rainList) {
		logger.info("开始更新雨量数据" + rainList);
		int result = 0;
		try {
			result = result + rainDAO.updateRainList(rainList);
		}catch (Exception e) {
			logger.error("雨量数据更新失败" + e.getMessage());
			return -1;
		}
		logger.info("雨量数据更新完成" + result);
		return result;
	}
	/**
	 * 删除雨量数据
	 * @param rainList
	 * @return
	 */
	public int deleteRain(List<Rain> rainList) {
		logger.info("开始删除雨量数据" + rainList);
		int result = 0;
		try {
			for (Rain rain : rainList) {
				result = result + rainDAO.deleteRain(rain);
			}
		}catch (Exception e) {
			logger.error("删除雨量数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除雨量数据完成" + result);
		return result;
	}
	
	/**
	 * 批量插入雨量数据
	 * @param rainList
	 * @return
	 */
	public int insertRain(List<Rain> rainList) {
		logger.info("开始插入雨量数据" + rainList);
		int result = 0;
		if(rainList == null || rainList.size() == 0) {
			return 0;
		}
		try {
			result = rainDAO.insertRainList(rainList);
		}catch (Exception e) {
			logger.error("雨量信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("雨量数据插入完成" + result);
		return result;
	}
  
}
