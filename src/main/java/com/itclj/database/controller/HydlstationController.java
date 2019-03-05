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
import com.itclj.database.entity.HydlStation;
import com.itclj.database.service.HydlstationService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class HydlstationController {
	
	private static Logger logger = Logger.getLogger(HydlstationController.class);
	
	@Autowired
	private HydlstationService hydlstationService;
	
	/**
	 * 查询水情站信息
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/hydlstation/getHydlStation", method = RequestMethod.POST)
	@ResponseBody
	public String getSubcenterData(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<>();
		List<HydlStation> hydlStationList = new ArrayList<HydlStation>();
		String jsonStr  =(String) request.getParameter("hydlstation");
		Map tMap = JSON.parseObject(jsonStr,Map.class); 
		logger.info("查询水情站信息，接收参数为：" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
		}else {
			
			param.put("stationid",(String)tMap.get("stationid"));
			
		}
		hydlStationList = hydlstationService.getHydlstationList(param);
		String s = JSON.toJSONString(hydlStationList);
		return s;
	}
	
	/**
	 * 插入水情站信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/hydlstation/insertHydlstation", method = RequestMethod.POST)
	@ResponseBody
	public int  insertSubcenterData(HttpServletRequest request) {
		int result = 0;
		List<HydlStation> hydlstationList = new ArrayList<HydlStation>();
		String jsonStr  =(String) request.getParameter("hydlstation");
		logger.info("插入水情站信息，参数为" + jsonStr);
		hydlstationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<HydlStation>>() {});
		result = hydlstationService.insertHydlStation(hydlstationList);
		return result;
		
	}
	
	/**
	 * 批量更新水情站信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/hydlstation/updateHydlstation", method = RequestMethod.POST)
	@ResponseBody
	public int  updateSubcenterData(HttpServletRequest request) {
		int result = 0;
		List<HydlStation> hydlStationList = new ArrayList<HydlStation>();
		String jsonStr  =(String) request.getParameter("hydlstation");
		logger.info("更新水情站信息，参数为" + jsonStr);
		hydlStationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<HydlStation>>() {});
		result = hydlstationService.updateHydlStation(hydlStationList);
		return result;
	}
	
	/**
	 * 批量删除水情站信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/hydlstation/deleteHydlstation", method = RequestMethod.POST)
	@ResponseBody
	public int deleteSubcenterData(HttpServletRequest request) {
		int result = 0;
		List<HydlStation> hydlStationList = new ArrayList<HydlStation>();
		String jsonStr  =(String) request.getParameter("hydlstation");
		logger.info("删除水情站信息，参数为" + jsonStr);
		hydlStationList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<HydlStation>>() {});
		result = hydlstationService.deleteHydlStation(hydlStationList);
		return result;
	}

}
