package com.itclj.database.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.Currentdata;
import com.itclj.database.entity.CurrentdataCS;
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
	 * 查询实时数据信息
	 * @param param
	 * @return
	 */
	public List<Currentdata> getCurrentdataList(Map<String, Object> param){
		List<Currentdata> retList = new ArrayList<Currentdata>();
		logger.info("查询站点当前数据信息" + param);
		try{
			retList = currentdataDAO.getCurrentdataList(param);
		}
		catch(Exception e){
			logger.error("查询站点当前数据信息失败" + e.getMessage());
			return null;
		}
		return retList;
	}
	
	/**
	 * 批量插入实时数据信息
	 * @param param
	 * @return
	 */
	public int insertCurrentdata(List<Currentdata> currentdataList) {
		logger.info("开始插入实时数据信息" + currentdataList.size());
		int result = 0;
		try {
			result = currentdataDAO.insertCurrentdata(currentdataList);
		}catch (Exception e) {
			logger.error("实时数据信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入实时数据信息完成" + result);
		return result;
	}
	
	/**
	 * 批量插入实时数据信息CS
	 * @param param
	 * @return
	 */
	public int insertCurrentdataCS(List<CurrentdataCS> currentdataList) {
		logger.info("开始插入实时数据信息" + currentdataList.size());
		int result = 0;
		try {
			result = currentdataDAO.insertCurrentdataCS(currentdataList);
		}catch (Exception e) {
			logger.error("实时数据信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入实时数据信息完成" + result);
		return result;
	}
	
	/**
	 * 批量更新实时数据信息
	 * @param param
	 * @return
	 */
	public int updateCurrentdata(List<Currentdata> currentdataList) {
		logger.info("开始更新实时数据信息" + currentdataList.size());
		int result = 0;
		try {
			result = result + currentdataDAO.updateCurrentdata(currentdataList);
		}catch (Exception e) {
			logger.error("实时数据信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("更新实时数据信息完成" + result);
		return result;
	}
	
	/**
	 * 批量更新实时数据信息CS
	 * @param param
	 * @return
	 */
	public int updateCurrentdataCS(List<CurrentdataCS> currentdataList) {
		logger.info("开始更新实时数据信息" + currentdataList.size());
		int result = 0;
		try {
			result = result + currentdataDAO.updateCurrentdataCS(currentdataList);
			result = 1;
		}catch (Exception e) {
			logger.error("实时数据信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("更新实时数据信息完成" + result);
		return result;
	}
	/**
	 * 逐条删除实时数据
	 * @param param
	 * @return
	 */
	public int deleteCurrentdata(List<Currentdata> currentdataList) {
		logger.info("开始删除实时数据数据" + currentdataList.size());
		int result = 0;
		try {
			for (Currentdata currentdata : currentdataList) {
				result = result + currentdataDAO.deleteCurrentdata(currentdata);
			}
		}catch (Exception e) {
			logger.error("删除实时数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除实时数据完成" + result);
		return result;
	}
	
}
