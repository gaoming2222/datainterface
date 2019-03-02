package com.itclj.database.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itclj.database.entity.Errorlog;
import com.itclj.database.service.ErrorlogService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class SeriaoPortController {
//	private static Logger logger = Logger.getLogger(CurrentDataController.class);
//	
//	@Autowired
//	private ErrorlogService errorlogService;
//	
//	@RequestMapping(value = "/errorlog/getErrorlog", method = RequestMethod.POST)
//	@ResponseBody
//	public List<Errorlog> getErrorlog(HttpServletRequest request) {
//		
//		return null;
//	}
//	
//	@RequestMapping(value = "/errorlog/insertErrorlog", method = RequestMethod.POST)
//	@ResponseBody
//	public int insertErrorlog(HttpServletRequest request) {
//		
//		return -1;
//	}
//	
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
