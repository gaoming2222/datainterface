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
import com.itclj.database.entity.Voltage;
import com.itclj.database.service.VoltageService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class VoltageDataController {
	
	private static Logger logger = Logger.getLogger(SubcenterController.class);
	
	@Autowired
	private VoltageService voltageService;
	
	/**
	 * 查询电压信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/voltage/getVoltage", method = RequestMethod.POST)
	@ResponseBody
	public List<Voltage> getVoltageData(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<>();
		List<Voltage> voltageList = new ArrayList<Voltage>();
		String jsonStr  =(String) request.getParameter("voltage");
		logger.info("查询电压数据参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("stationid", "");
			param.put("datatime", "");
			param.put("strttime", null);
			param.put("endtime", null);
		}else {
			//List<Subcenter> subcenter = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
			Voltage voltage = JSON.parseObject(jsonStr, new TypeReference<Voltage>() {});
			param.put("stationid", voltage.getStationid());
			param.put("datatime", voltage.getDatatime());
			param.put("strttime", null);
			param.put("endtime", null);
		}
		voltageList = voltageService.getVoltageList(param);
		return voltageList;
	}
	/**
	 * 批量插入电压数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/voltage/insertVoltage", method = RequestMethod.POST)
	@ResponseBody
	public int  insertVoltageData(HttpServletRequest request) {
		int result = 0;
		List<Voltage> voltageList = new ArrayList<Voltage>();
		String jsonStr  =(String) request.getParameter("voltage");
		logger.info("插入电压数据，参数为" + jsonStr);
		voltageList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Voltage>>() {});
		result = voltageService.insertVoltage(voltageList);
		return result;
	}
	/**
	 * 批量删除电压信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/voltage/deleteVoltage", method = RequestMethod.POST)
	@ResponseBody
	public int deleteVoltageData(HttpServletRequest request) {
		int result = 0;
		List<Voltage> voltageList = new ArrayList<Voltage>();
		String jsonStr  =(String) request.getParameter("voltage");
		logger.info("删除电压信息，参数为" + jsonStr);
		voltageList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Voltage>>() {});
		result = voltageService.deleteVoltage(voltageList);
		return result;
	}
	
	/**
	 * 删除电压信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/voltage/updateVoltage", method = RequestMethod.POST)
	@ResponseBody
	public int  updateVoltageData(HttpServletRequest request) {
		int result = 0;
		List<Voltage> voltageList = new ArrayList<Voltage>();
		String jsonStr  =(String) request.getParameter("voltage");
		logger.info("更新电压信息，参数为" + jsonStr);
		voltageList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Voltage>>() {});
		result = voltageService.updateVoltage(voltageList);
		return result;
	}

}