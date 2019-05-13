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
import com.itclj.database.entity.CurrentdataCS;
import com.itclj.database.service.CurrentdataService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class CurrentDataController {
	
	private static Logger logger = Logger.getLogger(CurrentDataController.class);
	
	@Autowired
	private CurrentdataService currentdataService;
	
	/**
	 * 查询站点实时数据信息
	 * @param request
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/currentdata/getCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public String getCurrentData(HttpServletRequest request){
		Map<String, Object> param = new HashMap();
		List<Currentdata> currentdataList = new ArrayList<Currentdata>();
		String jsonStr = request.getParameter("currentdata");
		Map tMap = JSON.parseObject(jsonStr,Map.class);
		logger.info("查询站点当前数据信息，接收的参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() ==""){
			param.put("StationID", "");
		}else{
			param.put("StationID", (String)tMap.get("StationID"));
		}
		currentdataList = currentdataService.getCurrentdataList(param);
		String result = JSON.toJSONString(currentdataList);
		return result;
	}
	
	/**
	 * 批量插入实时数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/insertCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int insertCurrentData(HttpServletRequest request) {
		int result = 0;
		List<Currentdata> currentdataList = new ArrayList<Currentdata>();
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("插入实时数据，参数为" + jsonStr);
		currentdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Currentdata>>() {});
		result = currentdataService.insertCurrentdata(currentdataList);
		return result;
	}
	
	/**
	 * 批量插入实时数据CS
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/insertCurrentdataCS", method = RequestMethod.POST)
	@ResponseBody
	public int insertCurrentDataCS(HttpServletRequest request) {
		int result = 0;
		List<CurrentdataCS> currentdataList = new ArrayList<CurrentdataCS>();
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("插入实时数据，参数为" + jsonStr);
		currentdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<CurrentdataCS>>() {});
		result = currentdataService.insertCurrentdataCS(currentdataList);
		return result;
	}
	/**
	 * 批量更新实时数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/updateCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  updateCurrentData(HttpServletRequest request) {
		int result = 0;
		List<Currentdata> currentdataList = new ArrayList<Currentdata>();
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("更新实时数据信息，参数为" + jsonStr);
		currentdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Currentdata>>() {});
		result = currentdataService.updateCurrentdata(currentdataList);
		return result;
	}
	
	/**
	 * 批量更新实时数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/updateCurrentdataCS", method = RequestMethod.POST)
	@ResponseBody
	public int  updateCurrentDataCS(HttpServletRequest request) {
		int result = 0;
		List<CurrentdataCS> currentdataList = new ArrayList<CurrentdataCS>();
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("更新实时数据信息，参数为" + jsonStr);
		currentdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<CurrentdataCS>>() {});
		result = currentdataService.updateCurrentdataCS(currentdataList);
		return result;
	}
	/**
	 * 逐条删除实时数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/currentdata/deleteCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int deleteCurrentData(HttpServletRequest request) {
		int result = 0;
		List<Currentdata> currentdataList = new ArrayList<Currentdata>();
		String jsonStr  =(String) request.getParameter("currentdata");
		logger.info("删除实时数据信息，参数为" + jsonStr);
		currentdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Currentdata>>() {});
		result = currentdataService.deleteCurrentdata(currentdataList);
		return result;
	}

}
