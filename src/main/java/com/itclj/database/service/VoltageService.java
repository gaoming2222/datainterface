package com.itclj.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itclj.database.entity.Voltage;
import com.itclj.database.entity.VoltageBS;
import com.itclj.database.mapper.VoltageDAO;

/**
 * 
 * @author gaoming
 *
 */
@Service
public class VoltageService {
	
	private static Logger logger = Logger.getLogger(VoltageService.class);
	
	@Autowired
	private VoltageDAO voltageDAO;
	
	/**
	 * 查询电压数据
	 * @param param
	 * @return
	 */
	public List<Voltage> getVoltageList(Map<String,Object> param) {
		List<Voltage> retList = new ArrayList<Voltage>();
		logger.info("开始查询电压信息" + param);
		try {
			retList = voltageDAO.getVoltageList(param);
		}catch (Exception e) {
			logger.error("查询电压信息出错" + e.getMessage());
			return null;
		}
		logger.info("查询电压信息完成");
		return retList;
	}
	
	/**
	 * 查询电压数据BS
	 * @param param
	 * @return
	 */
	public List<VoltageBS> getVoltageListBS(Map<String,Object> param) {
		List<VoltageBS> retList = new ArrayList<VoltageBS>();
		logger.info("开始查询电压信息" + param);
		try {
			retList = voltageDAO.getVoltageListBS(param);
		}catch (Exception e) {
			logger.error("查询电压信息出错" + e.getMessage());
			return null;
		}
		logger.info("查询电压信息完成");
		return retList;
	}
	
	
	/**
	 * 批量插入电压信息
	 * @param voltagesList
	 * @return
	 */
	public int insertVoltage(List<Voltage> voltagesList) {
		logger.info("开始插入电压信息" + voltagesList.size());
		int result = 0;
		try {
			result = voltageDAO.insertVoltageList(voltagesList);
		}catch (Exception e) {
			logger.error("电压信息插入失败" + e.getMessage());
			return -1;
		}
		logger.info("插入电压信息完成" + result);
		return result;
	}
	/**
	 * 批量更新电压信息
	 * @param voltageList
	 * @return
	 */
	public int updateVoltage(List<Voltage> voltageList) {
		logger.info("开始更新电压信息" + voltageList.size());
		int result = 0;
		try {
			result = result + voltageDAO.updateVolatgeList(voltageList);
		}catch (Exception e) {
			logger.error("电压信息更新失败" + e.getMessage());
			return -1;
		}
		logger.info("更新电压信息完成" + result);
		return result;
	}
	/**
	 * 逐条删除电压数据
	 * @param voltageList
	 * @return
	 */
	public int deleteVoltage(List<Voltage> voltageList) {
		logger.info("开始删除电压数据" + voltageList.size());
		int result = 0;
		try {
			for (Voltage voltage : voltageList) {
				result = result + voltageDAO.deleteVoltage(voltage);
			}
		}catch (Exception e) {
			logger.error("删除电压数据失败" + e.getMessage());
			return -1;
		}
		
		logger.info("删除电压数据完成" + result);
		return result;
	}

}
