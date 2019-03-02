package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SOILDATA
 * @author 
 */
public class Soildata implements Serializable {
    private String stationid;

    private Date datatime;

    private BigDecimal voltage;

    private BigDecimal voltage10;

    private BigDecimal moisture10;

    private BigDecimal voltage20;

    private BigDecimal moisture20;

    private BigDecimal voltage30;

    private BigDecimal moistrue30;

    private BigDecimal voltage40;

    private BigDecimal moistrue40;

    private BigDecimal voltage60;

    private BigDecimal moistrue60;

    private String transtype;

    private String messagetype;

    private Date recvdatatime;

    private Long state;

    private static final long serialVersionUID = 1L;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    public BigDecimal getVoltage10() {
        return voltage10;
    }

    public void setVoltage10(BigDecimal voltage10) {
        this.voltage10 = voltage10;
    }

    public BigDecimal getMoisture10() {
        return moisture10;
    }

    public void setMoisture10(BigDecimal moisture10) {
        this.moisture10 = moisture10;
    }

    public BigDecimal getVoltage20() {
        return voltage20;
    }

    public void setVoltage20(BigDecimal voltage20) {
        this.voltage20 = voltage20;
    }

    public BigDecimal getMoisture20() {
        return moisture20;
    }

    public void setMoisture20(BigDecimal moisture20) {
        this.moisture20 = moisture20;
    }

    public BigDecimal getVoltage30() {
        return voltage30;
    }

    public void setVoltage30(BigDecimal voltage30) {
        this.voltage30 = voltage30;
    }

    public BigDecimal getMoistrue30() {
        return moistrue30;
    }

    public void setMoistrue30(BigDecimal moistrue30) {
        this.moistrue30 = moistrue30;
    }

    public BigDecimal getVoltage40() {
        return voltage40;
    }

    public void setVoltage40(BigDecimal voltage40) {
        this.voltage40 = voltage40;
    }

    public BigDecimal getMoistrue40() {
        return moistrue40;
    }

    public void setMoistrue40(BigDecimal moistrue40) {
        this.moistrue40 = moistrue40;
    }

    public BigDecimal getVoltage60() {
        return voltage60;
    }

    public void setVoltage60(BigDecimal voltage60) {
        this.voltage60 = voltage60;
    }

    public BigDecimal getMoistrue60() {
        return moistrue60;
    }

    public void setMoistrue60(BigDecimal moistrue60) {
        this.moistrue60 = moistrue60;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    public Date getRecvdatatime() {
        return recvdatatime;
    }

    public void setRecvdatatime(Date recvdatatime) {
        this.recvdatatime = recvdatatime;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
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
        Soildata other = (Soildata) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()))
            && (this.getVoltage() == null ? other.getVoltage() == null : this.getVoltage().equals(other.getVoltage()))
            && (this.getVoltage10() == null ? other.getVoltage10() == null : this.getVoltage10().equals(other.getVoltage10()))
            && (this.getMoisture10() == null ? other.getMoisture10() == null : this.getMoisture10().equals(other.getMoisture10()))
            && (this.getVoltage20() == null ? other.getVoltage20() == null : this.getVoltage20().equals(other.getVoltage20()))
            && (this.getMoisture20() == null ? other.getMoisture20() == null : this.getMoisture20().equals(other.getMoisture20()))
            && (this.getVoltage30() == null ? other.getVoltage30() == null : this.getVoltage30().equals(other.getVoltage30()))
            && (this.getMoistrue30() == null ? other.getMoistrue30() == null : this.getMoistrue30().equals(other.getMoistrue30()))
            && (this.getVoltage40() == null ? other.getVoltage40() == null : this.getVoltage40().equals(other.getVoltage40()))
            && (this.getMoistrue40() == null ? other.getMoistrue40() == null : this.getMoistrue40().equals(other.getMoistrue40()))
            && (this.getVoltage60() == null ? other.getVoltage60() == null : this.getVoltage60().equals(other.getVoltage60()))
            && (this.getMoistrue60() == null ? other.getMoistrue60() == null : this.getMoistrue60().equals(other.getMoistrue60()))
            && (this.getTranstype() == null ? other.getTranstype() == null : this.getTranstype().equals(other.getTranstype()))
            && (this.getMessagetype() == null ? other.getMessagetype() == null : this.getMessagetype().equals(other.getMessagetype()))
            && (this.getRecvdatatime() == null ? other.getRecvdatatime() == null : this.getRecvdatatime().equals(other.getRecvdatatime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getDatatime() == null) ? 0 : getDatatime().hashCode());
        result = prime * result + ((getVoltage() == null) ? 0 : getVoltage().hashCode());
        result = prime * result + ((getVoltage10() == null) ? 0 : getVoltage10().hashCode());
        result = prime * result + ((getMoisture10() == null) ? 0 : getMoisture10().hashCode());
        result = prime * result + ((getVoltage20() == null) ? 0 : getVoltage20().hashCode());
        result = prime * result + ((getMoisture20() == null) ? 0 : getMoisture20().hashCode());
        result = prime * result + ((getVoltage30() == null) ? 0 : getVoltage30().hashCode());
        result = prime * result + ((getMoistrue30() == null) ? 0 : getMoistrue30().hashCode());
        result = prime * result + ((getVoltage40() == null) ? 0 : getVoltage40().hashCode());
        result = prime * result + ((getMoistrue40() == null) ? 0 : getMoistrue40().hashCode());
        result = prime * result + ((getVoltage60() == null) ? 0 : getVoltage60().hashCode());
        result = prime * result + ((getMoistrue60() == null) ? 0 : getMoistrue60().hashCode());
        result = prime * result + ((getTranstype() == null) ? 0 : getTranstype().hashCode());
        result = prime * result + ((getMessagetype() == null) ? 0 : getMessagetype().hashCode());
        result = prime * result + ((getRecvdatatime() == null) ? 0 : getRecvdatatime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationid=").append(stationid);
        sb.append(", datatime=").append(datatime);
        sb.append(", voltage=").append(voltage);
        sb.append(", voltage10=").append(voltage10);
        sb.append(", moisture10=").append(moisture10);
        sb.append(", voltage20=").append(voltage20);
        sb.append(", moisture20=").append(moisture20);
        sb.append(", voltage30=").append(voltage30);
        sb.append(", moistrue30=").append(moistrue30);
        sb.append(", voltage40=").append(voltage40);
        sb.append(", moistrue40=").append(moistrue40);
        sb.append(", voltage60=").append(voltage60);
        sb.append(", moistrue60=").append(moistrue60);
        sb.append(", transtype=").append(transtype);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", recvdatatime=").append(recvdatatime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}