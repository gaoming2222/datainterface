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
import com.itclj.database.entity.Rain;

import com.itclj.database.service.RainService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class RainDataController {
	
	private static Logger logger = Logger.getLogger(RainDataController.class);
	
	@Autowired
	private RainService rainService;
	
	/**
	 * 根据参数查询雨量数据
	 * 站点ID 时间  雨量
	 * @param request
	 * @return
	 * @throws ParseException 
	 */
	@SuppressWarnings({"rawtypes" })
	@RequestMapping(value = "/rain/getRain", method = RequestMethod.POST)
	@ResponseBody
	public String getRainData(HttpServletRequest request) throws ParseException {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Rain> rainList = new ArrayList<Rain>();
		String jsonStr  =(String) request.getParameter("rain");
		Map tMap = JSON.parseObject(jsonStr,Map.class);  
		logger.info("查询雨量数据参数为" + jsonStr);
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
		rainList = rainService.getRainList(param);
		String result =JSON.toJSONString(rainList);
		return result;
	}
	
	/**
	 * 批量插入雨量数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/rain/insertRain", method = RequestMethod.POST)
	@ResponseBody
	public int  insertRainData(HttpServletRequest request) {
		int result = 0;
		List<Rain> rainList = new ArrayList<Rain>();
		String jsonStr  =(String) request.getParameter("rain");
		logger.info("插入雨量数据，参数为" + jsonStr);
		rainList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Rain>>() {});
		result = rainService.insertRain(rainList);
		return result;
	}
	
	/**
	 * 批量更新雨量信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/rain/updateRain", method = RequestMethod.POST)
	@ResponseBody
	public int  updateRainData(HttpServletRequest request) {
		int result = 0;
		List<Rain> rainList = new ArrayList<Rain>();
		String jsonStr  =(String) request.getParameter("rain");
		logger.info("更新雨量信息，参数为" + jsonStr);
		rainList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Rain>>() {});
		result = rainService.updateRain(rainList);
		return result;
	}
	/**
	 * 逐条删除雨量信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/rain/deleteRain", method = RequestMethod.POST)
	@ResponseBody
	public int deleteRainData(HttpServletRequest request) {
		int result = 0;
		List<Rain> rainList = new ArrayList<Rain>();
		String jsonStr  =(String) request.getParameter("rain");
		logger.info("删除雨量信息，参数为" + jsonStr);
		rainList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Rain>>() {});
		result = rainService.deleteRain(rainList);
		return result;
	}
	
	
	

}
