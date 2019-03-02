package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.Subcenter;
import com.itclj.database.mapper.SubcenterDao;
/**
 * 
 * @author gaoming
 *
 */

@Service
public class SubcenterService {
	
	private static Logger logger = Logger.getLogger(SubcenterService.class);
	
	@Autowired
	private SubcenterDao subcenterMapper;
	
	/**
	 * 根据条件获取站点信息
	 * @param param
	 * @return
	 */
	
	public List<Subcenter> getASubcenterList(Map<String,Object> param) {
		List<Subcenter> retList = new ArrayList<Subcenter>();
		logger.info("开始查询分中心信息" + param);
		try {
			retList = subcenterMapper.getSubcenter(param);
		}catch (Exception e) {
			logger.error("查询分中心信息出错" + e.getMessage());
			return null;
		}
		logger.info("完成分中心信息查询");
		return retList;
	}
	/**
	  * 批量插入分中心
	 * @param subcenterList
	 * @return
	 */
	public int insertSubcenter(List<Subcenter> subcenterList) {
		logger.info("开始插入分中心信息" + subcenterList);
		int result = 0;
		try {
			result = subcenterMapper.insertSubcenter(subcenterList);
		}catch (Exception e) {
			logger.error("分中心信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("完成插入分中心信息" + result);
		return result;
	}
	/**
	 * 更新分中心信息
	 * @param subcenterList
	 * @return
	 */
	public int updateSubcenter(List<Subcenter> subcenterList) {
		logger.info("开始更新分中心信息" + subcenterList);
		int result = 0;
		try {
			result = result + subcenterMapper.updateSubcenter(subcenterList);
		}catch (Exception e) {
			logger.error("分中心信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("完成更新分中心信息" + subcenterList);
		return result;
	}
	
	public int deleteSubcenter(List<Subcenter> subcenterList) {
		logger.info("开始删除分中心信息" + subcenterList);
		int result = 0;
		int flag = 0;
		String [] subcenterIds = new String[subcenterList.size()];
		try {
			for (Subcenter subcenter : subcenterList) {
				subcenterIds[flag] = subcenter.getSubcenterId();
				flag++;
			}
			result = result + subcenterMapper.deleteSubcenter(subcenterIds);
		}catch (Exception e) {
			logger.error("删除分中心信息失败" + e.getMessage());
			return -1;
		}
		
		logger.info("完成删除分中心信息" + result);
		return result;
	}
}
