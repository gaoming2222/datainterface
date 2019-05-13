package com.itclj.database.controller;

import java.text.ParseException;
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
import com.itclj.database.entity.Soildata;
import com.itclj.database.entity.SoildataBS;
import com.itclj.database.service.SoildataService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class SoilDataController {
	
	private static Logger logger = Logger.getLogger(SoilDataController.class);
	
	@Autowired
	private SoildataService soildataService;
	
	/**
	 * 根据参数查询墒情数据
	 * @param request
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings({"rawtypes" })
	@RequestMapping(value = "/soildata/getSoildata", method = RequestMethod.POST)
	@ResponseBody
	public String getSoilData(HttpServletRequest request) throws ParseException {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Soildata> soildataList = new ArrayList<Soildata>();
		String jsonStr  =(String) request.getParameter("soildata");
		Map tMap = JSON.parseObject(jsonStr,Map.class);  
		logger.info("查询墒情数据参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
			param.put("datatime", "");
			param.put("strttime", null);
			param.put("endtime", null);
		}else {
			param.put("stationid", (String)tMap.get("stationid"));
			param.put("datatime", (String)tMap.get("datatime"));
			param.put("strttime", (String)tMap.get("strttime"));
			param.put("endtime", (String)tMap.get("endtime"));
		}
		soildataList = soildataService.getSoildataList(param);
		String result =JSON.toJSONString(soildataList);
		return result;
	}
	
	/**
	 * 根据参数查询墒情数据
	 * @param request
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings({"rawtypes" })
	@RequestMapping(value = "/soildata/getSoildataBS", method = RequestMethod.POST)
	@ResponseBody
	public String getSoilDataBS(HttpServletRequest request) throws ParseException {
		Map<String,Object> param = new HashMap<>();
		List<SoildataBS> soildataList = new ArrayList<SoildataBS>();
		String jsonStr  =(String) request.getParameter("soildata");
		Map tMap = JSON.parseObject(jsonStr,Map.class);  
		logger.info("查询墒情数据参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
			param.put("datatime", "");
			param.put("strttime", null);
			param.put("endtime", null);
		}else {
			param.put("stationid", (String)tMap.get("stationid"));
			param.put("datatime", (String)tMap.get("datatime"));
			param.put("strttime", (String)tMap.get("strttime"));
			param.put("endtime", (String)tMap.get("endtime"));
		}
		soildataList = soildataService.getSoildataListBS(param);
		String result =JSON.toJSONString(soildataList);
		return result;
	}
	
	
	/**
	 * 批量插入墒情数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/soildata/insertSoildata", method = RequestMethod.POST)
	@ResponseBody
	public int  insertSoilData(HttpServletRequest request) {
		int result = 0;
		List<Soildata> soildataList = new ArrayList<Soildata>();
		String jsonStr  =(String) request.getParameter("soildata");
		logger.info("插入墒情数据，参数为" + jsonStr);
		soildataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Soildata>>() {});
		result = soildataService.insertSoildata(soildataList);
		return result;
	}
	
	/**
	 * 批量更新墒情信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/soildata/updateSoildata", method = RequestMethod.POST)
	@ResponseBody
	public int  updateSoilData(HttpServletRequest request) {
		int result = 0;
		List<Soildata> soildataList = new ArrayList<Soildata>();
		String jsonStr  =(String) request.getParameter("soildata");
		logger.info("更新墒情信息，参数为" + jsonStr);
		soildataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Soildata>>() {});
		result = soildataService.updateSoildata(soildataList);
		return result;
	}
	/**
	 * 逐条删除墒情信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/soildata/deleteSoildata", method = RequestMethod.POST)
	@ResponseBody
	public int deleteSoilData(HttpServletRequest request) {
		int result = 0;
		List<Soildata> soildataList = new ArrayList<Soildata>();
		String jsonStr  =(String) request.getParameter("soildata");
		logger.info("删除墒情信息，参数为" + jsonStr);
		soildataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Soildata>>() {});
		result = soildataService.deleteSoildata(soildataList);
		return result;
	}
	
	
	

}
