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

import com.itclj.database.entity.Serialport;
import com.itclj.database.service.SerialportService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class SeriaoPortController {
	private static Logger logger = Logger.getLogger(CurrentDataController.class);
	
	@Autowired
	private SerialportService serialportService;
	
	/**
	 * 查询串口信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/serialport/getSerialport", method = RequestMethod.POST)
	@ResponseBody
	public List<Serialport> getSerialportData(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<String, Object>();
		List<Serialport> serialportList = new ArrayList<Serialport>();
		String jsonStr  =(String) request.getParameter("serialport");
		logger.info("查询串口信息，接收参数为：" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("portnumber", "");
		}else {
			
			Serialport serialport = JSON.parseObject(jsonStr, new TypeReference<Serialport>() {});
			param.put("portnumber", serialport.getPortnumber());
		}
		serialportList = serialportService.getSerialportList(param);
		return serialportList;
	}
	
	/**
	 * 插入串口信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/serialport/insertSerialport", method = RequestMethod.POST)
	@ResponseBody
	public int  insertSerialportData(HttpServletRequest request) {
		int result = 0;
		List<Serialport> serialportList = new ArrayList<Serialport>();
		String jsonStr  =(String) request.getParameter("serialport");
		logger.info("插入串口信息，参数为" + jsonStr);
		serialportList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Serialport>>() {});
		result = serialportService.insertSerialport(serialportList);
		return result;
		
	}
	
	/**
	 * 更新串口信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/serialport/updateSerialport", method = RequestMethod.POST)
	@ResponseBody
	public int  updateSerialportData(HttpServletRequest request) {
		int result = 0;
		List<Serialport> serialportList = new ArrayList<Serialport>();
		String jsonStr  =(String) request.getParameter("serialport");
		logger.info("更新串口信息，参数为" + jsonStr);
		serialportList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Serialport>>() {});
		result = serialportService.updateSerialport(serialportList);
		return result;
	}
	
	/**
	 * 删除串口信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/serialport/deleteSerialport", method = RequestMethod.POST)
	@ResponseBody
	public int deleteSerialportData(HttpServletRequest request) {
		int result = 0;
		List<Serialport> serialportList = new ArrayList<Serialport>();
		String jsonStr  =(String) request.getParameter("serialport");
		logger.info("删除串口信息，参数为" + jsonStr);
		serialportList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Serialport>>() {});
		result = serialportService.deleteSerialport(serialportList);
		return result;
	}

}
