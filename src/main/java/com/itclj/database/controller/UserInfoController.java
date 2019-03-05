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
import com.itclj.database.entity.User;
import com.itclj.database.service.UserService;

@Controller
@EnableAutoConfiguration
@MapperScan("com.itclj.database.mapper")
public class UserInfoController {
	private static Logger logger = Logger.getLogger(UserInfoController.class);
	
	@Autowired
    private UserService userService;
	
	/**
	 * 查询用户信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/user/getUser", method = RequestMethod.POST)
	@ResponseBody
	public List<User> getUserInfo(HttpServletRequest request) {
		Map<String,Object> param = new HashMap<>();
		List<User> userList = new ArrayList<User>();
		String jsonStr  =(String) request.getParameter("user");
		logger.info("查询用户数据参数为" + jsonStr);
		if(jsonStr == null || jsonStr.trim() == "") {
			param.put("uid", "");
			param.put("name", "");
			param.put("password", "");
			param.put("administrator", "");
		}else {
			//List<Subcenter> subcenter = JSON.parseObject(jsonStr, new TypeReference<ArrayList<Subcenter>>() {});
			User user = JSON.parseObject(jsonStr, new TypeReference<User>() {});
			param.put("uid", user.getUser());
			param.put("name", user.getName());
			param.put("password", user.getPassword());
			param.put("administrator", null);
		}
		userList = userService.getUserList(param);
		return userList;
	}
	/**
	 * 批量插入用户数据
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/user/insertUser", method = RequestMethod.POST)
	@ResponseBody
	public int  insertUserInfo(HttpServletRequest request) {
		int result = 0;
		List<User> userList = new ArrayList<User>();
		String jsonStr  =(String) request.getParameter("user");
		logger.info("插入用户数据，参数为" + jsonStr);
		userList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<User>>() {});
		result = userService.insertUser(userList);
		return result;
	}
	/**
	 * 批量删除用户信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/user/deleteUser", method = RequestMethod.POST)
	@ResponseBody
	public int deleteUserInfo(HttpServletRequest request) {
		int result = 0;
		List<User> userList = new ArrayList<User>();
		String jsonStr  =(String) request.getParameter("user");
		logger.info("删除用户信息，参数为" + jsonStr);
		userList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<User>>() {});
		result = userService.deleteUser(userList);
		return result;
	}
	
	/**
	 * 更新用户信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/user/updateUser", method = RequestMethod.POST)
	@ResponseBody
	public int  updateUserInfo(HttpServletRequest request) {
		int result = 0;
		List<User> userList = new ArrayList<User>();
		String jsonStr  =(String) request.getParameter("user");
		logger.info("更新用户信息，参数为" + jsonStr);
		userList = JSON.parseObject(jsonStr, new TypeReference<ArrayList<User>>() {});
		result = userService.updateUser(userList);
		return result;
	}
}
