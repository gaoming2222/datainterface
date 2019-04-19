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
import com.itclj.database.entity.Soilstation;
import com.itclj.database.service.SoilstationService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class SoilStationController {
	private static Logger logger = Logger.getLogger(SoilStationController.class);
	
    @Autowired
    private SoilstationService soilstationService;
    
    /**
	 * 查询墒情站信息
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
    @RequestMapping(value = "/soilstation/getSoilstation", method = RequestMethod.POST)
	@ResponseBody
	public String getSoilstation(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Soilstation> soilstationList = new ArrayList<Soilstation>();
		String jsonStr  =(String) request.getParameter("Soilstation");
		Map tMap = JSON.parseObject(jsonStr,Map.class); 
		logger.info("查询墒情站信息，接收参数为：" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
		}else {

			param.put("stationid",(String)tMap.get("stationid"));

		}
		soilstationList = soilstationService.getSoilstationList(param);
		String s = JSON.toJSONString(soilstationList);
		return s;
	}
	
    /**
	 * 插入墒情站信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/soilstation/insertSoilstation", method = RequestMethod.POST)
	@ResponseBody
	public int insertSoilstationData(HttpServletRequest request) {
		int result = 0;
		List<Soilstation> soilstationList = new ArrayList<Soilstation>();
		String jsonStr  =(String) request.getParameter("soilstation");
		logger.info("插入墒情站信息，参数为" + jsonStr);
		soilstationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Soilstation>>() {});
		result = soilstationService.insertSoilstation(soilstationList);
		return result;
		
	}
	
	/**
	 * 批量更新墒情站信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/soilstation/updateSoilstation", method = RequestMethod.POST)
	@ResponseBody
	public int  updateSoilstationData(HttpServletRequest request) {
		int result = 0;
		List<Soilstation> soilstationList = new ArrayList<Soilstation>();
		String jsonStr  =(String) request.getParameter("soilstation");
		logger.info("更新墒情站信息，参数为" + jsonStr);
		soilstationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Soilstation>>() {});
		result = soilstationService.updateSoilstation(soilstationList);
		return result;
	}
	
	/**
	 * 批量删除墒情站信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/soilstation/deleteSoilstation", method = RequestMethod.POST)
	@ResponseBody
	public int deleteSoilstationData(HttpServletRequest request) {
		int result = 0;
		List<Soilstation> soilstationList = new ArrayList<Soilstation>();
		String jsonStr  =(String) request.getParameter("soilstation");
		logger.info("删除墒情站信息，参数为" + jsonStr);
		soilstationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Soilstation>>() {});
		result = soilstationService.deleteSoilstation(soilstationList);
		return result;
	}
}
