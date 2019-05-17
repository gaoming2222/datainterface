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
import com.itclj.database.entity.Splashmapdata;
import com.itclj.database.service.SplashmapdataService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class SplashmapdataController {
	
	private static Logger logger = Logger.getLogger(SplashmapdataController.class);
	
	@Autowired
	private SplashmapdataService splashmapdataService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/splashmapdata/getSplashmapdata", method = RequestMethod.POST)
	@ResponseBody
	public String getSplashmapdata(HttpServletRequest request){
		Map<String, Object> param = new HashMap();
		List<Splashmapdata> resultList = new ArrayList<Splashmapdata>();
		String jsonStr = request.getParameter("splashmapdata");
		Map tMap = JSON.parseObject(jsonStr,Map.class);
		if(jsonStr == null || jsonStr.trim() ==""){
			param.put("stationid", "");
		}else{
			param.put("stationid", (String)tMap.get("stationid"));
		}
		logger.info("查询雨量色斑图，参数为" + jsonStr);
		resultList = splashmapdataService.getSplashmapdataList(param);
		String result = JSON.toJSONString(resultList);
		return result;
	}
	
	@RequestMapping(value = "/splashmapdata/insertSplashmapdata", method = RequestMethod.POST)
	@ResponseBody
	public int insertCurrentDataCS(HttpServletRequest request) {
		int result = -1;
		List<Splashmapdata> splashmapdataList = new ArrayList<Splashmapdata>();
		String jsonStr  =(String) request.getParameter("splashmapdata");
		logger.info("插入雨量色斑图数据，参数为" + jsonStr);
		splashmapdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Splashmapdata>>() {});
		result = splashmapdataService.insertSplashmapdata(splashmapdataList);
	    return result;
		
	}
	
	
	@RequestMapping(value = "/splashmapdata/updateSplashmapdata", method = RequestMethod.POST)
	@ResponseBody
	public int  updateSplashmapdata(HttpServletRequest request) {
		int result = 0;
		List<Splashmapdata> splashmapdataList = new ArrayList<Splashmapdata>();
		String jsonStr  =(String) request.getParameter("splashmapdata");
		logger.info("更新雨量色斑图数据信息，参数为" + jsonStr);
		splashmapdataList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Splashmapdata>>() {});
		result = splashmapdataService.updateSplashmapdata(splashmapdataList);
		return result;
	}
	
	
	

}
