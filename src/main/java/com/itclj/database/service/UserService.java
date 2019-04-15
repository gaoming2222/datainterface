package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.User;
import com.itclj.database.entity.UserBS;
import com.itclj.database.mapper.UserDAO;

@Service
public class UserService {
	
	private static Logger logger = Logger.getLogger(UserService.class);
	
	@Autowired
	private UserDAO userDAO;
	
	/**
	 * 查询用户数据
	 * @param param
	 * @return
	 */
	public List<User> getUserList(Map<String,Object> param) {
		List<User> retList = new ArrayList<User>();
		logger.info("开始查询用户信息" + param);
		try {
			retList = userDAO.getUserList(param);
		}catch (Exception e) {
			logger.error("查询用户信息出错" + e.getMessage());
			return null;
		}
		logger.info("查询用户信息完成");
		return retList;
	}
	
	/**
	 * 查询用户数据B/S
	 * @param param
	 * @return
	 */
	public List<UserBS> getUserListBS(Map<String,Object> param) {
		List<UserBS> retList = new ArrayList<UserBS>();
		logger.info("开始查询用户信息" + param);
		try {
			retList = userDAO.getUserListBS(param);
		}catch (Exception e) {
			logger.error("查询用户信息出错" + e.getMessage());
			return null;
		}
		logger.info("查询用户信息完成");
		return retList;
	}
	
	/**
	 * 插入用户信息
	 * @param userList
	 * @return
	 */
	public int insertUser(List<User> userList) {
		logger.info("开始插入用户信息" + userList);
		int result = 0;
		try {
			for (User user : userList) {
				result = result + userDAO.insert(user);
			}
		}catch (Exception e) {
			logger.error("用户信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入用户信息完成" + result);
		return result;
	}
	
	/**
	 * 插入用户信息B/S
	 * @param userList
	 * @return
	 */
	public int insertUserBS(List<UserBS> userList) {
		logger.info("开始插入用户信息" + userList);
		int result = 0;
		try {
			for (UserBS user : userList) {
				result = result + userDAO.insertBS(user);
			}
		}catch (Exception e) {
			logger.error("用户信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入用户信息完成" + result);
		return result;
	}
	
	
	/**
	 * 更新用户信息
	 * @param userList
	 * @return
	 */
	public int updateUser(List<User> userList) {
		logger.info("开始更新用户数据" + userList.size());
		int result = 0;
		try {
			for (User user : userList) {
				result = result + userDAO.updateUser(user);
			}
		}catch (Exception e) {
			logger.error("更新用户数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("更新用户数据完成" + result);
		return result;
	}
	
	/**
	 * 更新用户信息B/S
	 * @param userList
	 * @return
	 */
	public int updateUserBS(List<UserBS> userList) {
		logger.info("开始更新用户数据" + userList.size());
		int result = 0;
		try {
			for (UserBS user : userList) {
				result = result + userDAO.updateUserBS(user);
			}
		}catch (Exception e) {
			logger.error("更新用户数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("更新用户数据完成" + result);
		return result;
	}
	
	/**
	 * 逐条删除用户数据
	 * @param userList
	 * @return
	 */
	public int deleteUser(List<User> userList) {
		logger.info("开始删除用户数据" + userList.size());
		int result = 0;
		try {
			for (User user : userList) {
				result = result + userDAO.deleteUser(user);
			}
		}catch (Exception e) {
			logger.error("删除用户数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除用户数据完成" + result);
		return result;
	}
	
	/**
	 * 逐条删除用户数据
	 * @param userList
	 * @return
	 */
	public int deleteUserBS(List<UserBS> userList) {
		logger.info("开始删除用户数据" + userList.size());
		int result = 0;
		try {
			for (UserBS user : userList) {
				result = result + userDAO.deleteUserBS(user);
			}
		}catch (Exception e) {
			logger.error("删除用户数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除用户数据完成" + result);
		return result;
	}
	
	
}
