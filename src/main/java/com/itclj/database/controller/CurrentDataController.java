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
import com.itclj.database.entity.Currentdata;
import com.itclj.database.service.CurrentdataService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class CurrentDataController {
	
	private static Logger logger = Logger.getLogger(CurrentDataController.class);
	
	@Autowired
	private CurrentdataService currentdataService;
	
	@RequestMapping(value = "/currentdata/getCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public List<Currentdata> getCurrentdata(HttpServletRequest request) {
		
		return null;
	}
	
	@RequestMapping(value = "/currentdata/insertCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  insertCurrentdata(HttpServletRequest request) {
	
		return -1;
	}
	
	@RequestMapping(value = "/currentdata/updateCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  updateCurrentdata(HttpServletRequest request) {
	
		return -1;
	}
	
	@RequestMapping(value = "/currentdata/deleteCurrentdata", method = RequestMethod.POST)
	@ResponseBody
	public int  deleteCurrentdata(HttpServletRequest request) {
	
		return -1;
	}

}
