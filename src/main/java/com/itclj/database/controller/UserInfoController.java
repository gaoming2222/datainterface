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

import com.itclj.database.entity.Soilstation;
import com.itclj.database.service.SoilstationService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class UserInfoController {
//	private static Logger logger = Logger.getLogger(UserInfoController.class);
//	
//	@Autowired
//    private UserInfoController userInfoController;
//	
//	@RequestMapping(value = "/soilstation/getSoilstation", method = RequestMethod.POST)
//	@ResponseBody
//	public List<Soilstation> getSoilstation(HttpServletRequest request) {
//		
//		return null;
//	}
//	
//	@RequestMapping(value = "/soilstation/insertSoilstation", method = RequestMethod.POST)
//	@ResponseBody
//	public int insertSoilstation(HttpServletRequest request) {
//		
//		return -1;
//	}
//	
//	@RequestMapping(value = "/soilstation/updateSoilstation", method = RequestMethod.POST)
//	@ResponseBody
//	public int updateErrorlog(HttpServletRequest request) {
//		
//		return -1;
//	}
//	
//	@RequestMapping(value = "/soilstation/deleteSoilstation", method = RequestMethod.POST)
//	@ResponseBody
//	public int deleteErrorlog(HttpServletRequest request) {
//		
//		return -1;
//	}
}
