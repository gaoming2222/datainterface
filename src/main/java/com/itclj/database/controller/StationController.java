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
import com.itclj.database.entity.Station;
import com.itclj.database.service.StationService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class StationController {
	private static Logger logger = Logger.getLogger(StationController.class);
	
	@Autowired
	private StationService stationService;
	
	/**
	 * 查询站点信息
	 * @param request
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/station/getStation", method = RequestMethod.POST)
	@ResponseBody
	public String getStationData(HttpServletRequest request){
		Map<String, Object> param = new HashMap();
		List<Station> stationList = new ArrayList<Station>();
		String jsonStr = request.getParameter("station");
		Map tMap = JSON.parseObject(jsonStr,Map.class);
		logger.info("查询站点信息，接收的参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() ==""){
			param.put("StationID", "");
			param.put("ID", "");
		}else{
			param.put("StationID", (String)tMap.get("StationID"));
			param.put("ID", (String)tMap.get("ID"));
		}
		stationList = stationService.getStationList(param);
		String result = JSON.toJSONString(stationList);
		return result;
	}
	
	/**
	 * 批量插入站点数据B/S
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/station/insertStation", method = RequestMethod.POST)
	@ResponseBody
	public int  insertStation(HttpServletRequest request) {
		int result = 0;
		List<Station> stationList = new ArrayList<Station>();
		String jsonStr  =(String) request.getParameter("station");
		logger.info("插入站点数据，参数为" + jsonStr);
		stationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Station>>() {});
		result = stationService.insertStation(stationList);
		return result;
	}
	
	/**
	 * 批量删除站点信息BS
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/station/deleteStation", method = RequestMethod.POST)
	@ResponseBody
	public int deleteStation(HttpServletRequest request) {
		int result = 0;
		List<Station> stationList = new ArrayList<Station>();
		String jsonStr  =(String) request.getParameter("station");
		logger.info("删除站点信息，参数为" + jsonStr);
		stationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Station>>() {});
		result = stationService.deleteStation(stationList);
		return result;
	}
	
	/**
	 * 更新站点信息B/S
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/station/updateStation", method = RequestMethod.POST)
	@ResponseBody
	public int  updateStation(HttpServletRequest request) {
		int result = 0;
		List<Station> stationList = new ArrayList<Station>();
		String jsonStr  =(String) request.getParameter("station");
		logger.info("更新站点信息，参数为" + jsonStr);
		stationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Station>>() {});
		result = stationService.updateStation(stationList);
		return result;
	}
	
	
	
}
