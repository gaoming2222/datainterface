package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * VOLTAGE
 * @author 
 */
public class Voltage implements Serializable {
	@JSONField(name="StationID")
    private String stationid;

	@JSONField(name="TimeCollect")
    private String datatime;

	@JSONField(name="Voltage")
    private BigDecimal data;

	@JSONField(name="TimeRecieved")
    private String recvdatatime;

	@JSONField(name="MessageType")
    private String messagetype;
	
	@JSONField(name="ChannelType")
    private String transtype;

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

	@JSONField(name="TimeCollect")
    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

	@JSONField(name="Voltage")
    public BigDecimal getData() {
        return data;
    }

    public void setData(BigDecimal data) {
        this.data = data;
    }
    
	@JSONField(name="TimeRecieved")
    public String getRecvdatatime() {
        return recvdatatime;
    }

    public void setRecvdatatime(String recvdatatime) {
        this.recvdatatime = recvdatatime;
    }

	@JSONField(name="MessageType")
    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

	@JSONField(name="ChannelType")
    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
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
        Voltage other = (Voltage) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()))
            && (this.getData() == null ? other.getData() == null : this.getData().equals(other.getData()))
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
//        result = prime * result + ((getData() == null) ? 0 : getData().hashCode());
//        result = prime * result + ((getTranstype() == null) ? 0 : getTranstype().hashCode());
//        result = prime * result + ((getMessagetype() == null) ? 0 : getMessagetype().hashCode());
//        result = prime * result + ((getRecvdatatime() == null) ? 0 : getRecvdatatime().hashCode());
//        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
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
        sb.append(", data=").append(data);
        sb.append(", transtype=").append(transtype);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", recvdatatime=").append(recvdatatime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}