package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * CURRENTDATA
 * @author 
 */
public class Currentdata implements Serializable {
    private String stationid;

    private String cname;

    private String ctype;

    private BigDecimal yesterdayrain;

    private BigDecimal todayrain;

    private BigDecimal periodrain;

    private BigDecimal waterstage;

    private BigDecimal waterflow;

    private BigDecimal voltage;

    private String currentstate;

    private String reporttype;

    private String gprstype;

    private Date datatime;

    private static final long serialVersionUID = 1L;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public BigDecimal getYesterdayrain() {
        return yesterdayrain;
    }

    public void setYesterdayrain(BigDecimal yesterdayrain) {
        this.yesterdayrain = yesterdayrain;
    }

    public BigDecimal getTodayrain() {
        return todayrain;
    }

    public void setTodayrain(BigDecimal todayrain) {
        this.todayrain = todayrain;
    }

    public BigDecimal getPeriodrain() {
        return periodrain;
    }

    public void setPeriodrain(BigDecimal periodrain) {
        this.periodrain = periodrain;
    }

    public BigDecimal getWaterstage() {
        return waterstage;
    }

    public void setWaterstage(BigDecimal waterstage) {
        this.waterstage = waterstage;
    }

    public BigDecimal getWaterflow() {
        return waterflow;
    }

    public void setWaterflow(BigDecimal waterflow) {
        this.waterflow = waterflow;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    public String getCurrentstate() {
        return currentstate;
    }

    public void setCurrentstate(String currentstate) {
        this.currentstate = currentstate;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getGprstype() {
        return gprstype;
    }

    public void setGprstype(String gprstype) {
        this.gprstype = gprstype;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
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
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getCtype() == null ? other.getCtype() == null : this.getCtype().equals(other.getCtype()))
            && (this.getYesterdayrain() == null ? other.getYesterdayrain() == null : this.getYesterdayrain().equals(other.getYesterdayrain()))
            && (this.getTodayrain() == null ? other.getTodayrain() == null : this.getTodayrain().equals(other.getTodayrain()))
            && (this.getPeriodrain() == null ? other.getPeriodrain() == null : this.getPeriodrain().equals(other.getPeriodrain()))
            && (this.getWaterstage() == null ? other.getWaterstage() == null : this.getWaterstage().equals(other.getWaterstage()))
            && (this.getWaterflow() == null ? other.getWaterflow() == null : this.getWaterflow().equals(other.getWaterflow()))
            && (this.getVoltage() == null ? other.getVoltage() == null : this.getVoltage().equals(other.getVoltage()))
            && (this.getCurrentstate() == null ? other.getCurrentstate() == null : this.getCurrentstate().equals(other.getCurrentstate()))
            && (this.getReporttype() == null ? other.getReporttype() == null : this.getReporttype().equals(other.getReporttype()))
            && (this.getGprstype() == null ? other.getGprstype() == null : this.getGprstype().equals(other.getGprstype()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getCtype() == null) ? 0 : getCtype().hashCode());
        result = prime * result + ((getYesterdayrain() == null) ? 0 : getYesterdayrain().hashCode());
        result = prime * result + ((getTodayrain() == null) ? 0 : getTodayrain().hashCode());
        result = prime * result + ((getPeriodrain() == null) ? 0 : getPeriodrain().hashCode());
        result = prime * result + ((getWaterstage() == null) ? 0 : getWaterstage().hashCode());
        result = prime * result + ((getWaterflow() == null) ? 0 : getWaterflow().hashCode());
        result = prime * result + ((getVoltage() == null) ? 0 : getVoltage().hashCode());
        result = prime * result + ((getCurrentstate() == null) ? 0 : getCurrentstate().hashCode());
        result = prime * result + ((getReporttype() == null) ? 0 : getReporttype().hashCode());
        result = prime * result + ((getGprstype() == null) ? 0 : getGprstype().hashCode());
        result = prime * result + ((getDatatime() == null) ? 0 : getDatatime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationid=").append(stationid);
        sb.append(", cname=").append(cname);
        sb.append(", ctype=").append(ctype);
        sb.append(", yesterdayrain=").append(yesterdayrain);
        sb.append(", todayrain=").append(todayrain);
        sb.append(", periodrain=").append(periodrain);
        sb.append(", waterstage=").append(waterstage);
        sb.append(", waterflow=").append(waterflow);
        sb.append(", voltage=").append(voltage);
        sb.append(", currentstate=").append(currentstate);
        sb.append(", reporttype=").append(reporttype);
        sb.append(", gprstype=").append(gprstype);
        sb.append(", datatime=").append(datatime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}