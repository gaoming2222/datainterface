package com.itclj.database.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.Errorlog;
import com.itclj.database.mapper.ErrorlogDAO;

@Service
public class ErrorlogService {
	
	private static Logger logger = Logger.getLogger(ErrorlogService.class);
	
	@Autowired
	private ErrorlogDAO errorlogDAO;
	/**
	 * 查询错误日志数据
	 * @param param
	 * @return
	 */
	public List<Errorlog> getErrorlogList(Map<String,Object> param) {
		List<Errorlog> retList = new ArrayList<Errorlog>();
		logger.info("开始查询错误日志信息" + param);
		try {
			retList = errorlogDAO.getErrorlog(param);
		}catch (Exception e) {
			logger.error("查询错误日志信息出错" + e.getMessage());
			return null;
		}
		logger.info("查询错误日志信息完成");
		return retList;
	}
	/**
	 * 插入错误日志数据
	 * @param errorlogList
	 * @return
	 */
	public int insertErrorlog(Errorlog errorlog) {
		logger.info("开始插入错误日志数据" + errorlog);
		int result = 0;
		if(errorlog == null ) {
			return 0;
		}
		try {
			result = errorlogDAO.insert(errorlog);
		}catch (Exception e) {
			logger.error("错误日志信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("错误日志数据插入完成" + result);
		return result;
	}
  
	
}
