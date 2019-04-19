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
import com.itclj.database.entity.Errorlog;
import com.itclj.database.service.ErrorlogService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class ErrorLogController {

	private static Logger logger = Logger.getLogger(CurrentDataController.class);
	
	@Autowired
	private ErrorlogService errorlogService;
	
	/**
	 * 查询错误日志信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/errorlog/getErrorlog", method = RequestMethod.POST)
	@ResponseBody
	public List<Errorlog> getErrorlogData(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Errorlog> errorlogList = new ArrayList<Errorlog>();
		String jsonStr  =(String) request.getParameter("errorlog");
		logger.info("查询错误日志信息，接收参数为：" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("strtTime", "");
		}else {
			//List<Subcenter> subcenter = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
			Errorlog errorlog = JSON.parseObject(jsonStr, new TypeReference<Errorlog>() {});
			param.put("strtTime", errorlog.getElOperatetime());
		}
		errorlogList = errorlogService.getErrorlogList(param);
		return errorlogList;
	}
	/**
	 * 逐条插入错误日志数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/errorlog/insertErrorlog", method = RequestMethod.POST)
	@ResponseBody
	public int insertErrorlog(HttpServletRequest request) {
		int result = 0;
		Errorlog errorlog = null;
		String jsonStr =(String) request.getParameter("errorlog");
		logger.info("插入错误日志数据,参数为" + jsonStr);
		errorlog = JSON.parseObject(jsonStr, new TypeReference<Errorlog>() {});
		result = errorlogService.insertErrorlog(errorlog);
		return result;
	}
	
//	@RequestMapping(value = "/errorlog/updateErrorlog", method = RequestMethod.POST)
//	@ResponseBody
//	public int updateErrorlog(HttpServletRequest request) {
//		
//		return -1;
//	}
//	
//	@RequestMapping(value = "/errorlog/deleteErrorlog", method = RequestMethod.POST)
//	@ResponseBody
//	public int deleteErrorlog(HttpServletRequest request) {
//		
//		return -1;
//	}

}
