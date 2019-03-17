package com.itclj.database.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.itclj.database.entity.Warninginfo;
import com.itclj.database.service.WarninginfoService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class WarninginfoController {
private static Logger logger = Logger.getLogger(WarninginfoController.class);
	
	@Autowired
    private WarninginfoService warninginfoService;
	
	/**
	 * 查询警告信息
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/warninginfo/getWarninginfo", method = RequestMethod.POST)
	@ResponseBody
	public String getWarningInfo(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<>();
		List<Warninginfo> warninginfoList = new ArrayList<Warninginfo>();
		String jsonStr  =(String) request.getParameter("warninginfo");
		Map tMap = JSON.parseObject(jsonStr,Map.class); 
		logger.info("查询告警日志信息参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("strttime", "");
			param.put("endtime", "");
		}else {
			param.put("strttime",(String)tMap.get("strttime"));
			param.put("endtime",(String)tMap.get("endtime"));
		}
		warninginfoList = warninginfoService.getWarninginfoList(param);
		String result = JSON.toJSONString(warninginfoList);
		return result;
	}
	/**
	 * 批量插入告警日志
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/warninginfo/insertWarninginfo", method = RequestMethod.POST)
	@ResponseBody
	public int  insertWarninginfo(HttpServletRequest request) {
		int result = 0;
		List<Warninginfo> warninginfoList = new ArrayList<Warninginfo>();
		String jsonStr  =(String) request.getParameter("warninginfo");
		logger.info("插入告警日志，参数为" + jsonStr);
		warninginfoList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Warninginfo>>() {});
		result = warninginfoService.insertWarninginfo(warninginfoList);
		return result;
	}
	/**
	 * 批量删除告警日志
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/warninginfo/deleteWarninginfo", method = RequestMethod.POST)
	@ResponseBody
	public int deleteWarninginfo(HttpServletRequest request) {
		int result = 0;
		List<Warninginfo> warninginfoList = new ArrayList<Warninginfo>();
		String jsonStr  =(String) request.getParameter("warninginfo");
		logger.info("删除告警日志，参数为" + jsonStr);
		warninginfoList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Warninginfo>>() {});
		result = warninginfoService.deleteWarninginfo(warninginfoList);
		return result;
	}
	
	/**
	 * 更新告警日志
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/warninginfo/updateWarninginfo", method = RequestMethod.POST)
	@ResponseBody
	public int  updateWarninginfo(HttpServletRequest request) {
		int result = 0;
		List<Warninginfo> warninginfoList = new ArrayList<Warninginfo>();
		String jsonStr  =(String) request.getParameter("warninginfo");
		logger.info("更新告警日志，参数为" + jsonStr);
		warninginfoList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Warninginfo>>() {});
		result = warninginfoService.updateWarninginfo(warninginfoList);
		return result;
	}
}
