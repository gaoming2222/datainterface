package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itclj.database.entity.Serialport;
import com.itclj.database.mapper.SerialportDAO;
/**
 * 
 * @author 
 *	串口管理service
 */
@Service
public class SerialportService {
	private static Logger logger = Logger.getLogger(SerialportService.class);
	
	@Autowired
	private SerialportDAO serialportDAO;
	/**
	 * 查询串口信息
	 * @param param
	 * @return
	 */
	public List<Serialport> getSerialportList(Map<String,Object> param){
		List<Serialport> retList = new ArrayList<Serialport>();
		logger.info("开始查询串口信息" + param);
		try {
			retList = serialportDAO.getSerialPort(param);
		}catch(Exception e) {
			logger.error("查询串口信息失败" + e.getMessage());
			return null;
		}
		logger.info("查询串口信息完成" + retList.size());
		return retList;
	}
	/**
	 * 插入串口信息
	 * @param serialportList
	 * @return
	 */
	public int insertSerialport(List<Serialport> serialportList) {
		logger.info("开始插入串口信息" + serialportList.size());
		int result = 0;
		try {
			for (Serialport serialport : serialportList) {
				result = result + serialportDAO.insert(serialport);
			}
		}catch (Exception e) {
			logger.error("串口信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入串口信息完成" + result);
		return result;
	}
	/**
	 * 更新串口信息
	 * @param serialportList
	 * @return
	 */
	public int updateSerialport(List<Serialport> serialportList) {
		logger.info("开始更新串口信息" + serialportList.size());
		int result = 0;
		try {
			for (Serialport serialport : serialportList) {
				result = result + serialportDAO.updateByPrimaryKey(serialport);
			}
		}catch (Exception e) {
			logger.error("串口信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("更新串口信息完成" + result);
		return result;
	}
	/**
	 * 逐条删除串口数据
	 * @param serialportList
	 * @return
	 */
	public int deleteSerialport(List<Serialport> serialportList) {
		logger.info("开始删除串口数据" + serialportList.size());
		int result = 0;
		try {
			for (Serialport serialport : serialportList) {
				result = result + serialportDAO.deleteByPrimaryKey(serialport.getPortnumber());
			}
		}catch (Exception e) {
			logger.error("删除串口数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除串口数据完成" + result);
		return result;
	}
	
}
