package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * SOILDATA
 * @author 
 */
public class Soildata implements Serializable {
	@JSONField(name="StationID")
    private String stationid;

	@JSONField(name="DataTime")
    private String datatime;

	@JSONField(name="DVoltage")
    private BigDecimal voltage;

	@JSONField(name="Voltage10")
    private BigDecimal voltage10;

	@JSONField(name="Moisture10")
    private BigDecimal moisture10;

	@JSONField(name="Voltage20")
    private BigDecimal voltage20;

	@JSONField(name="Moisture20")
    private BigDecimal moisture20;

	@JSONField(name="Voltage30")
    private BigDecimal voltage30;

	@JSONField(name="Moisture30")
    private BigDecimal moisture30;

	@JSONField(name="Voltage40")
    private BigDecimal voltage40;

	@JSONField(name="Moisture40")
    private BigDecimal moisture40;

	@JSONField(name="Voltage60")
    private BigDecimal voltage60;

	@JSONField(name="Moisture60")
    private BigDecimal moisture60;

	@JSONField(name="ChannelType")
    private String transtype;

	@JSONField(name="MessageType")
    private String messagetype;

	@JSONField(name="reciveTime")
    private String recvdatatime;

	@JSONField(name="state")
    private Long state;

    private static final long serialVersionUID = 1L;

	@JSONField(name="StationID")
    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

	@JSONField(name="DataTime")
    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

	@JSONField(name="DVoltage")
    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

	@JSONField(name="Voltage10")
    public BigDecimal getVoltage10() {
        return voltage10;
    }

    public void setVoltage10(BigDecimal voltage10) {
        this.voltage10 = voltage10;
    }

	@JSONField(name="Moisture10")
    public BigDecimal getMoisture10() {
        return moisture10;
    }

    public void setMoisture10(BigDecimal moisture10) {
        this.moisture10 = moisture10;
    }

	@JSONField(name="Voltage20")
    public BigDecimal getVoltage20() {
        return voltage20;
    }

    public void setVoltage20(BigDecimal voltage20) {
        this.voltage20 = voltage20;
    }

	@JSONField(name="Moisture20")
    public BigDecimal getMoisture20() {
        return moisture20;
    }

    public void setMoisture20(BigDecimal moisture20) {
        this.moisture20 = moisture20;
    }

	@JSONField(name="Voltage30")
    public BigDecimal getVoltage30() {
        return voltage30;
    }

    public void setVoltage30(BigDecimal voltage30) {
        this.voltage30 = voltage30;
    }

	@JSONField(name="Moisture30")
    public BigDecimal getMoisture30() {
        return moisture30;
    }

    public void setMoisture30(BigDecimal moisture30) {
        this.moisture30 = moisture30;
    }

	@JSONField(name="Voltage40")
    public BigDecimal getVoltage40() {
        return voltage40;
    }

    public void setVoltage40(BigDecimal voltage40) {
        this.voltage40 = voltage40;
    }

	@JSONField(name="Moisture40")
    public BigDecimal getMoisture40() {
        return moisture40;
    }

    public void setMoisture40(BigDecimal moisture40) {
        this.moisture40 = moisture40;
    }

	@JSONField(name="Voltage60")
    public BigDecimal getVoltage60() {
        return voltage60;
    }

    public void setVoltage60(BigDecimal voltage60) {
        this.voltage60 = voltage60;
    }

	@JSONField(name="Moisture60")
    public BigDecimal getMoisture60() {
        return moisture60;
    }

    public void setMoisture60(BigDecimal moisture60) {
        this.moisture60 = moisture60;
    }

	@JSONField(name="ChannelType")
    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

	@JSONField(name="MessageType")
    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

	@JSONField(name="reciveTime")
    public String getRecvdatatime() {
        return recvdatatime;
    }

    public void setRecvdatatime(String recvdatatime) {
        this.recvdatatime = recvdatatime;
    }

	@JSONField(name="state")
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
            && (this.getMoisture30() == null ? other.getMoisture30() == null : this.getMoisture30().equals(other.getMoisture30()))
            && (this.getVoltage40() == null ? other.getVoltage40() == null : this.getVoltage40().equals(other.getVoltage40()))
            && (this.getMoisture40() == null ? other.getMoisture40() == null : this.getMoisture40().equals(other.getMoisture40()))
            && (this.getVoltage60() == null ? other.getVoltage60() == null : this.getVoltage60().equals(other.getVoltage60()))
            && (this.getMoisture60() == null ? other.getMoisture60() == null : this.getMoisture60().equals(other.getMoisture60()))
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
        result = prime * result + ((getMoisture30() == null) ? 0 : getMoisture30().hashCode());
        result = prime * result + ((getVoltage40() == null) ? 0 : getVoltage40().hashCode());
        result = prime * result + ((getMoisture40() == null) ? 0 : getMoisture40().hashCode());
        result = prime * result + ((getVoltage60() == null) ? 0 : getVoltage60().hashCode());
        result = prime * result + ((getMoisture60() == null) ? 0 : getMoisture60().hashCode());
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
        sb.append(", moistrue30=").append(moisture30);
        sb.append(", voltage40=").append(voltage40);
        sb.append(", moistrue40=").append(moisture40);
        sb.append(", voltage60=").append(voltage60);
        sb.append(", moistrue60=").append(moisture60);
        sb.append(", transtype=").append(transtype);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", recvdatatime=").append(recvdatatime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}