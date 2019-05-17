package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

import org.apache.log4j.Logger;
import org.hibernate.procedure.internal.Util.ResultClassesResolutionContext;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.itclj.database.entity.Splashmapdata;
import com.itclj.database.mapper.SplashmapdataDAO;

@Service
public class SplashmapdataService {
	
	private static Logger logger = Logger.getLogger(SplashmapdataService.class);
	
	@Autowired
	private SplashmapdataDAO splashmapdataDAO;
	/**
	 * 批量查询雨量色斑图信息
	 * @param param
	 * @return
	 */
	public List<Splashmapdata> getSplashmapdataList(Map<String,Object> param){
		logger.info("查询雨量色斑图信息开始" + param);
		List<Splashmapdata> retList = new ArrayList<Splashmapdata>();
		try{
			retList = splashmapdataDAO.getSplashmapdataList(param);
		}
		catch(Exception e){
			logger.error("查询雨量色斑图信息失败" + e.getMessage());
			return null;
		}
		logger.info("查询雨量色斑图信息完成");
		return retList;
	}
	/**
	 * 
	 * @param list
	 * @return
	 */
    public int insertSplashmapdata(List<Splashmapdata> list) {
    	logger.info("插入雨量色斑图信息开始" + list.size());
    	int result = -1;
    	try {
			result = splashmapdataDAO.insertSplashmapdata(list);
		}catch (Exception e) {
			logger.error("插入雨量色斑图信息失败" + e.getMessage());
			return -1;
		}
    	logger.info("插入雨量色斑图信息完成");
    	return result;
    }
	  
	public int updateSplashmapdata(List<Splashmapdata> list) {
		logger.info("更新雨量色斑图信息开始" + list.size());
		int result = -1;
		try {
			result = result + splashmapdataDAO.updateSplashmapdata(list);
		}catch (Exception e) {
			logger.error("更新雨量色斑图信息失败" + e.getMessage());
			return -1;
		}
		logger.info("更新雨量色斑图信息完成");
		return result;
	}

}
