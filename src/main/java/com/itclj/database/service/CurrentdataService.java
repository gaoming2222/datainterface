package com.itclj.database.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.Currentdata;

import com.itclj.database.mapper.CurrentdataDAO;
/**
 * date:2019-02-11
 * @author gaoming
 *
 */

@Service
public class CurrentdataService {
	
	private static Logger logger = Logger.getLogger(CurrentdataService.class);
	
	@Autowired
	private CurrentdataDAO currentdataDAO;
	
	/**
	 * 根据站点ID查询单站数据信息
	 * @param param
	 * @return
	 */
	public List<Currentdata> getCurrentDataByStationId(Map<String,Object> param){
		List<Currentdata> ret = new ArrayList<Currentdata>();
		logger.info("开始查询实时数据信息" + param);
		try {
			ret = currentdataDAO.selectByPrimaryKey(param);
		}catch(Exception e) {
			logger.error("查询实时数据信息失败" + e.getMessage());
			return null;
		}
		logger.info("查询水情站信息完成" + ret);
		return ret;
	}
	
	/**
	 * 批量插入当前数据信息
	 * @param currentdataList
	 * @return
	 */
	public int batchInsertCurrentdata(List<Currentdata> currentdataList) {
		logger.info("开始插入实时数据信息" + currentdataList.size());
		int result = 0;
		try {
			result = currentdataDAO.batchInsert(currentdataList);
		}catch (Exception e) {
			logger.error("插入实时数据信息失败" + e.getMessage());
			return -1;
		}
		logger.info("插入实时数据信息完成" + result);
		return result;
	}
	
	/**
	 * 逐条插入当前数据信息
	 * @param currentdata
	 * @return
	 */
	public int insertCurrentdata(Currentdata currentdata) {
		logger.info("开始插入实时数据信息" + currentdata);
		int result = 0;
		try {
			result = currentdataDAO.insert(currentdata);
		}catch (Exception e) {
			logger.error("插入实时数据信息失败" + e.getMessage());
			return -1;
		}
		logger.info("插入实时数据信息完成" + result);
		return result;
	}
	
	/**
	 * 更新当前数据信息
	 * @param hydlStationList
	 * @return
	 */
	public int updateCurrentdata(Currentdata currentdata) {
		logger.info("开始更新实时数据信息" + currentdata);
		int result = 0;
		try {
			result = result + currentdataDAO.updateByPrimaryKey(currentdata);
		}catch (Exception e) {
			logger.error("更新实时数据信息失败" + e.getMessage());
			return -1;
		}
		logger.info("更新实时数据信息完成" + result);
		return result;
	}
	
}
