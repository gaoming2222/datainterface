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
import com.itclj.database.entity.Water;
import com.itclj.database.service.WaterService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class WaterDataController {
	
	private static Logger logger = Logger.getLogger(WaterDataController.class);
	
	@Autowired
	private WaterService waterService;
	
	/**
	 * 查询雨量数据
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/water/getWater", method = RequestMethod.POST)
	@ResponseBody
	public String getWaterData(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Water> waterList = new ArrayList<Water>();
		String jsonStr  =(String) request.getParameter("water");
		Map tMap = JSON.parseObject(jsonStr,Map.class);
		logger.info("查询水位数据参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
			param.put("datatime", "");
			param.put("strttime", null);
			param.put("endtime", null);
		}else {
			//List<Subcenter> subcenter = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
			param.put("stationid", (String)tMap.get("stationid"));
			param.put("datatime", (String)tMap.get("datatime"));
			param.put("strttime", (String)tMap.get("strttime"));
			param.put("endtime", (String)tMap.get("endtime"));
		}
		waterList = waterService.getWaterList(param);
		String s = JSON.toJSONString(waterList);
		return s;
	}
	/**
	 * 批量插入水位数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/water/insertWater", method = RequestMethod.POST)
	@ResponseBody
	public int insertWaterData(HttpServletRequest request) {
		int result = 0;
		List<Water> waterList = new ArrayList<Water>();
		String jsonStr  =(String) request.getParameter("water");
		logger.info("插入水位数据，参数为" + jsonStr);
		waterList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Water>>() {});
		result = waterService.insertWater(waterList);
		return result;
	}
	/**
	 * 批量更新水位数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/water/updateWater", method = RequestMethod.POST)
	@ResponseBody
	public int  updateWaterData(HttpServletRequest request) {
		int result = 0;
		List<Water> waterList = new ArrayList<Water>();
		String jsonStr  =(String) request.getParameter("water");
		logger.info("更新水位信息，参数为" + jsonStr);
		waterList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Water>>() {});
		result = waterService.updateWater(waterList);
		return result;
	}
	/**
	 * 逐条删除水位数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/water/deleteWater", method = RequestMethod.POST)
	@ResponseBody
	public int deleteWaterData(HttpServletRequest request) {
		int result = 0;
		List<Water> waterList = new ArrayList<Water>();
		String jsonStr  =(String) request.getParameter("water");
		logger.info("删除水位信息，参数为" + jsonStr);
		waterList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Water>>() {});
		result = waterService.deleteWater(waterList);
		return result;
	}

}
