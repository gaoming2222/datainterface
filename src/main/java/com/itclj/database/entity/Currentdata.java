package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * CURRENTDATA
 * @author 
 */
public class Currentdata implements Serializable {
	@JSONField(name="CName")
    private String CName;

	@JSONField(name="StationID")
    private String StationID;

	@JSONField(name="CType")
    private String CType;

	@JSONField(name="YesterdayRain")
    private BigDecimal YesterdayRain;

	@JSONField(name="TodayRain")
    private BigDecimal TodayRain;

	@JSONField(name="PeriodRain")
    private BigDecimal PeriodRain;

	@JSONField(name="WaterStage")
    private BigDecimal WaterStage;

	@JSONField(name="WaterFlow")
    private BigDecimal WaterFlow;

	@JSONField(name="Voltage")
    private BigDecimal Voltage;

	@JSONField(name="CurrentState")
    private String CurrentState;

	@JSONField(name="ReportType")
    private String ReportType;

	@JSONField(name="GPRSType")
    private String GPRSType;

	@JSONField(name="DataTime")
    private String DataTime;

    private static final long serialVersionUID = 1L;

	@JSONField(name="CName")
    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }
    
	@JSONField(name="StationID")
    public String getStationID() {
        return StationID;
    }

    public void setStationID(String StationID) {
        this.StationID = StationID;
    }

	@JSONField(name="CType")
    public String getCType() {
        return CType;
    }

    public void setCType(String CType) {
        this.CType = CType;
    }

	@JSONField(name="YesterdayRain")
    public BigDecimal getYesterdayRain() {
        return YesterdayRain;
    }

    public void setYesterdayRain(BigDecimal YesterdayRain) {
        this.YesterdayRain = YesterdayRain;
    }

	@JSONField(name="TodayRain")
    public BigDecimal getTodayRain() {
        return TodayRain;
    }

    public void setTodayRain(BigDecimal TodayRain) {
        this.TodayRain = TodayRain;
    }

	@JSONField(name="PeriodRain")
    public BigDecimal getPeriodRain() {
        return PeriodRain;
    }

    public void setPeriodRain(BigDecimal PeriodRain) {
        this.PeriodRain = PeriodRain;
    }

	@JSONField(name="WaterStage")
    public BigDecimal getWaterStage() {
        return WaterStage;
    }

    public void setWaterStage(BigDecimal WaterStage) {
        this.WaterStage = WaterStage;
    }

	@JSONField(name="WaterFlow")
    public BigDecimal getWaterFlow() {
        return WaterFlow;
    }

    public void setWaterFlow(BigDecimal WaterFlow) {
        this.WaterFlow = WaterFlow;
    }

	@JSONField(name="Voltage")
    public BigDecimal getVoltage() {
        return Voltage;
    }

    public void setVoltage(BigDecimal Voltage) {
        this.Voltage = Voltage;
    }

	@JSONField(name="CurrentState")
    public String getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(String CurrentState) {
        this.CurrentState = CurrentState;
    }

	@JSONField(name="ReportType")
    public String getReportType() {
        return ReportType;
    }

    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

	@JSONField(name="GPRSType")
    public String getGPRSType() {
        return GPRSType;
    }

    public void setGPRSType(String GPRSType) {
        this.GPRSType = GPRSType;
    }

	@JSONField(name="DataTime")
    public String getDataTime() {
        return DataTime;
    }

    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Currentdata other = (Currentdata) that;
        return (this.getCName() == null ? other.getCName() == null : this.getCName().equals(other.getCName()))
            && (this.getStationID() == null ? other.getStationID() == null : this.getStationID().equals(other.getStationID()))
            && (this.getCType() == null ? other.getCType() == null : this.getCType().equals(other.getCType()))
            && (this.getYesterdayRain() == null ? other.getYesterdayRain() == null : this.getYesterdayRain().equals(other.getYesterdayRain()))
            && (this.getTodayRain() == null ? other.getTodayRain() == null : this.getTodayRain().equals(other.getTodayRain()))
            && (this.getPeriodRain() == null ? other.getPeriodRain() == null : this.getPeriodRain().equals(other.getPeriodRain()))
            && (this.getWaterStage() == null ? other.getWaterStage() == null : this.getWaterStage().equals(other.getWaterStage()))
            && (this.getWaterFlow() == null ? other.getWaterFlow() == null : this.getWaterFlow().equals(other.getWaterFlow()))
            && (this.getVoltage() == null ? other.getVoltage() == null : this.getVoltage().equals(other.getVoltage()))
            && (this.getCurrentState() == null ? other.getCurrentState() == null : this.getCurrentState().equals(other.getCurrentState()))
            && (this.getReportType() == null ? other.getReportType() == null : this.getReportType().equals(other.getReportType()))
            && (this.getGPRSType() == null ? other.getGPRSType() == null : this.getGPRSType().equals(other.getGPRSType()))
            && (this.getDataTime() == null ? other.getDataTime() == null : this.getDataTime().equals(other.getDataTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationID() == null) ? 0 : getStationID().hashCode());
        result = prime * result + ((getCName() == null) ? 0 : getCName().hashCode());
        result = prime * result + ((getCType() == null) ? 0 : getCType().hashCode());
        result = prime * result + ((getYesterdayRain() == null) ? 0 : getYesterdayRain().hashCode());
        result = prime * result + ((getTodayRain() == null) ? 0 : getTodayRain().hashCode());
        result = prime * result + ((getPeriodRain() == null) ? 0 : getPeriodRain().hashCode());
        result = prime * result + ((getWaterStage() == null) ? 0 : getWaterStage().hashCode());
        result = prime * result + ((getWaterFlow() == null) ? 0 : getWaterFlow().hashCode());
        result = prime * result + ((getVoltage() == null) ? 0 : getVoltage().hashCode());
        result = prime * result + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        result = prime * result + ((getReportType() == null) ? 0 : getReportType().hashCode());
        result = prime * result + ((getGPRSType() == null) ? 0 : getGPRSType().hashCode());
        result = prime * result + ((getDataTime() == null) ? 0 : getDataTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CName=").append(CName);
        sb.append(", StationID=").append(StationID);
        sb.append(", CType=").append(CType);
        sb.append(", YesterdayRain=").append(YesterdayRain);
        sb.append(", TodayRain=").append(TodayRain);
        sb.append(", PeriodRain=").append(PeriodRain);
        sb.append(", WaterStage=").append(WaterStage);
        sb.append(", WaterFlow=").append(WaterFlow);
        sb.append(", Voltage=").append(Voltage);
        sb.append(", CurrentState=").append(CurrentState);
        sb.append(", ReportType=").append(ReportType);
        sb.append(", GPRSType=").append(GPRSType);
        sb.append(", DataTime=").append(DataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}