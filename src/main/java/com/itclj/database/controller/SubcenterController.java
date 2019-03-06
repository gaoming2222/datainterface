package com.itclj.database.controller;


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
import com.itclj.database.entity.Subcenter;
import com.itclj.database.service.SubcenterService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;



@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class SubcenterController {
	
	private static Logger logger = Logger.getLogger(SubcenterController.class);
	
	@Autowired
	private  SubcenterService subcenterService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String getTest() {
		return "success";
	}
	/**
	     * 查询分中心信息
	 * @param param
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/subcenter/getSubcenter", method = RequestMethod.POST)
	@ResponseBody
	public String getSubcenterData(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<>();
		List<Subcenter> subcenterList = new ArrayList<Subcenter>();
		String jsonStr  =(String) request.getParameter("subcenter");
		Map tMap = JSON.parseObject(jsonStr,Map.class); 
		logger.info("查询分中心信息参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("subcenterId", "");
		}else {
			
			param.put("subcenterId",(String)tMap.get("subcenterId"));
		}
		subcenterList = subcenterService.getASubcenterList(param);
		//将结果返回成首字母大写的Json字符串
		String result = JSON.toJSONString(subcenterList);
		return result;
	}
	/**
	 * 批量插入分中心信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/subcenter/insertSubcenter", method = RequestMethod.POST)
	@ResponseBody
	public int  insertSubcenterData(HttpServletRequest request) {
		int result = 0;
		List<Subcenter> subcenterList = new ArrayList<Subcenter>();
		String jsonStr  =(String) request.getParameter("subcenter");
		logger.info("插入分中心信息，参数为" + jsonStr);
		subcenterList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
		result = subcenterService.insertSubcenter(subcenterList);
		return result;
		
	}
	/**
	 * 批量更新分中心信息 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/subcenter/updateSubcenter", method = RequestMethod.POST)
	@ResponseBody
	public int  updateSubcenterData(HttpServletRequest request) {
		int result = 0;
		List<Subcenter> subcenterList = new ArrayList<Subcenter>();
		String jsonStr  =(String) request.getParameter("subcenter");
		logger.info("更新分中心信息，参数为" + jsonStr);
		subcenterList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
		result = subcenterService.updateSubcenter(subcenterList);
		return result;
	}
	/**
	 * 批量删除分中心信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/subcenter/deleteSubcenter", method = RequestMethod.POST)
	@ResponseBody
	public int deleteSubcenterData(HttpServletRequest request) {
		int result = 0;
		List<Subcenter> subcenterList = new ArrayList<Subcenter>();
		String jsonStr  =(String) request.getParameter("subcenter");
		logger.info("删除分中心信息，参数为" + jsonStr);
		subcenterList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
		result = subcenterService.deleteSubcenter(subcenterList);
		return result;
	}

}
