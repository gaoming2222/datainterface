package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.Warninginfo;
import com.itclj.database.mapper.WarninginfoDAO;

@Service
public class WarninginfoService {
private static Logger logger = Logger.getLogger(WarninginfoService.class);
	
	@Autowired
	private WarninginfoDAO warninginfoDAO;
	/**
	 * 查询错误信息
	 * @param param
	 * @return
	 */
	public List<Warninginfo> getWarninginfoList(Map<String,Object> param) {
		List<Warninginfo> retList = new ArrayList<Warninginfo>();
		logger.info("开始查询告警日志信息" + param);
		try {
			retList = warninginfoDAO.getWarninginfo(param);
		}catch (Exception e) {
			logger.error("查询告警日志信息出错" + e.getMessage());
			return null;
		}
		logger.info("完成告警日志信息查询");
		return retList;
	}
	/**
	 * 插入错误信息
	 * @param warninginfoList
	 * @return
	 */
	public int insertWarninginfo(List<Warninginfo> warninginfoList) {
		logger.info("开始插入错误信息" + warninginfoList);
		int result = 0;
		if(warninginfoList == null || warninginfoList.size() == 0) {
			return 0;
		}
		try {
			for (Warninginfo warninginfo : warninginfoList) {
				result = result + warninginfoDAO.insert(warninginfo);
			}
		}catch (Exception e) {
			logger.error("错误信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入错误信息完成" + result);
		return result;
	}
	/**
	 * 更新错误信息
	 * @param warninginfoList
	 * @return
	 */
	public int updateWarninginfo(List<Warninginfo> warninginfoList) {
		logger.info("开始更新警告信息数据" + warninginfoList.size());
		int result = 0;
		try {
			for (Warninginfo warninginfo : warninginfoList) {
				result = result + warninginfoDAO.updateByPrimaryKey(warninginfo);
			}
		}catch (Exception e) {
			logger.error("更新警告信息数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("更新警告信息数据完成" + result);
		return result;
	}
	/**
	 * 逐条删除警告信息数据
	 * @param warninginfoList
	 * @return
	 */
	public int deleteWarninginfo(List<Warninginfo> warninginfoList) {
		logger.info("开始删除警告信息数据" + warninginfoList.size());
		int result = 0;
		try {
			for (Warninginfo warninginfo : warninginfoList) {
				result = result + warninginfoDAO.deleteByPrimaryKey(warninginfo.getInfoid());
			}
		}catch (Exception e) {
			logger.error("删除警告信息数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除警告信息数据完成" + result);
		return result;
	}
}
