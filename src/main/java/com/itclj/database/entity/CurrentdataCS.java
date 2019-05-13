package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * CURRENTDATA
 * @author 
 */
public class CurrentdataCS implements Serializable {
	public String getTimeDeviceGained() {
		return TimeDeviceGained;
	}

	public void setTimeDeviceGained(String timeDeviceGained) {
		TimeDeviceGained = timeDeviceGained;
	}

	@JSONField(name = "StrStationName")
	private String StrStationName;

	public String getStrStationName() {
		return StrStationName;
	}

	public void setStrStationName(String strStationName) {
		StrStationName = strStationName;
	}

	public String getStrStationID() {
		return StrStationID;
	}

	public void setStrStationID(String strStationID) {
		StrStationID = strStationID;
	}

	public String getEIStationType() {
		return EIStationType;
	}

	public void setEIStationType(String eIStationType) {
		EIStationType = eIStationType;
	}

	public BigDecimal getDDayRainFall() {
		return DDayRainFall;
	}

	public void setDDayRainFall(BigDecimal dDayRainFall) {
		DDayRainFall = dDayRainFall;
	}

	public BigDecimal getLastDayRainFall() {
		return LastDayRainFall;
	}

	public void setLastDayRainFall(BigDecimal lastDayRainFall) {
		LastDayRainFall = lastDayRainFall;
	}

	public BigDecimal getDDifferenceRain() {
		return DDifferenceRain;
	}

	public void setDDifferenceRain(BigDecimal dDifferenceRain) {
		DDifferenceRain = dDifferenceRain;
	}

	public BigDecimal getDPeriodRain() {
		return DPeriodRain;
	}

	public void setDPeriodRain(BigDecimal dPeriodRain) {
		DPeriodRain = dPeriodRain;
	}

	public BigDecimal getDWaterYield() {
		return DWaterYield;
	}

	public void setDWaterYield(BigDecimal dWaterYield) {
		DWaterYield = dWaterYield;
	}

	public BigDecimal getDvoltage() {
		return Dvoltage;
	}

	public void setDvoltage(BigDecimal dvoltage) {
		Dvoltage = dvoltage;
	}

	public String getERTDState() {
		return ERTDState;
	}

	public void setERTDState(String eRTDState) {
		ERTDState = eRTDState;
	}

	public String getEIMessageType() {
		return EIMessageType;
	}

	public void setEIMessageType(String eIMessageType) {
		EIMessageType = eIMessageType;
	}

	public String getEIChannelType() {
		return EIChannelType;
	}

	public void setEIChannelType(String eIChannelType) {
		EIChannelType = eIChannelType;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JSONField(name = "StrStationID")
	private String StrStationID;

	@JSONField(name = "EIStationType")
	private String EIStationType;

	@JSONField(name = "DDayRainFall")
	private BigDecimal DDayRainFall;

	@JSONField(name = "LastDayRainFall")
	private BigDecimal LastDayRainFall;

	@JSONField(name = "DDifferenceRain")
	private BigDecimal DDifferenceRain;

	@JSONField(name = "DPeriodRain")
	private BigDecimal DPeriodRain;

	@JSONField(name = "DWaterYield")
	private BigDecimal DWaterYield;

	@JSONField(name = "Dvoltage")
	private BigDecimal Dvoltage;

	@JSONField(name = "ERTDState")
	private String ERTDState;

	@JSONField(name = "EIMessageType")
	private String EIMessageType;

	@JSONField(name = "EIChannelType")
	private String EIChannelType;

	@JSONField(name = "TimeDeviceGained")
	private String TimeDeviceGained;

    private static final long serialVersionUID = 1L;

}