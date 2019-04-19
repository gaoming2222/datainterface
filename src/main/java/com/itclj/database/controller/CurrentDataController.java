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
import com.itclj.database.entity.Currentdata;
import com.itclj.database.service.CurrentdataService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class CurrentDataController {
	
	private static Logger logger = Logger.getLogger(CurrentDataController.class);
	
	@Autowired
	private CurrentdataService currentdataService;
	
	/**
	 * 查询站点当前数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/getCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public List<Currentdata> getCurrentdata(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Currentdata> currentList = new ArrayList<Currentdata>();
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("查询当前数据参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
			param.put("datatime", "");
			param.put("strttime", null);
			param.put("endtime", null);
		}else {
			//List<Subcenter> subcenter = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
			Currentdata currentdata = JSON.parseObject(jsonStr, new TypeReference<Currentdata>() {});
			param.put("stationid", currentdata.getStationid());
			param.put("datatime", currentdata.getDatatime());
			param.put("strttime", null);
			param.put("endtime", null);
		}
		currentList = currentdataService.getCurrentDataByStationId(param);
		return currentList;
	}
	/**
	 * 批量插入当前数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/batchInsertCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  batchInsertCurrentdata(HttpServletRequest request) {
		int result = 0;
		List<Currentdata> currentList = new ArrayList<Currentdata>();
		String jsonStr =(String) request.getParameter("currentdata");
		logger.info("批量插入当前数据,参数为" + jsonStr);
		currentList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Currentdata>>() {});
		result = currentdataService.batchInsertCurrentdata(currentList);
		return result;
	}
	/**
	 * 逐条插入当前数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/insertCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  insertCurrentdata(HttpServletRequest request) {
		int result = 0;
		Currentdata currentdata = null;
		String jsonStr =(String) request.getParameter("currentdata");
		logger.info("逐条插入当前数据,参数为" + jsonStr);
		currentdata = JSON.parseObject(jsonStr, new TypeReference<Currentdata>() {});
		result = currentdataService.insertCurrentdata(currentdata);
		return result;
	}
	/**
	 * 逐条更新当前数据信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/updateCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  updateCurrentdata(HttpServletRequest request) {
		int result = 0;
		Currentdata currentdata = null;
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("更新当前数据信息，参数为" + jsonStr);
		currentdata = JSON.parseObject(jsonStr, new TypeReference<Currentdata>() {});
		result = currentdataService.updateCurrentdata(currentdata);
		return result;
	}
	
	@RequestMapping(value = "/currentdata/deleteCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  deleteCurrentdata(HttpServletRequest request) {
	
		return -1;
	}

}
