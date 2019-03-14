package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * RAIN
 * @author 
 */
public class Rain implements Serializable {
	
	@JSONField(name="StationID")
    private String stationid;

	@JSONField(name="TimeCollect")
    private String datatime;

	@JSONField(name="PeriodRain")
    private BigDecimal periodrain;

	@JSONField(name="DifferneceRain")
    private BigDecimal differencerain;

	@JSONField(name="TotalRain")
    private BigDecimal totalrain;

	@JSONField(name="DayRain")
    private BigDecimal dayrain;

	@JSONField(name="ChannelType")
    private String transtype;

	@JSONField(name="MessageType")
    private String messagetype;

	@JSONField(name="TimeRecieved")
    private String recvdatatime;

	@JSONField(name="BState")
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

	@JSONField(name="PeriodRain")
    public BigDecimal getPeriodrain() {
        return periodrain;
    }

    public void setPeriodrain(BigDecimal periodrain) {
        this.periodrain = periodrain;
    }

	@JSONField(name="DifferneceRain")
    public BigDecimal getDifferencerain() {
        return differencerain;
    }

    public void setDifferencerain(BigDecimal differencerain) {
        this.differencerain = differencerain;
    }

	@JSONField(name="TotalRain")
    public BigDecimal getTotalrain() {
        return totalrain;
    }

    public void setTotalrain(BigDecimal totalrain) {
        this.totalrain = totalrain;
    }

	@JSONField(name="DayRain")
    public BigDecimal getDayrain() {
        return dayrain;
    }

    public void setDayrain(BigDecimal dayrain) {
        this.dayrain = dayrain;
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

	@JSONField(name="TimeRecieved")
    public String getRecvdatatime() {
        return recvdatatime;
    }

    public void setRecvdatatime(String recvdatatime) {
        this.recvdatatime = recvdatatime;
    }

	@JSONField(name="BState")
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
        Rain other = (Rain) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()))
            && (this.getPeriodrain() == null ? other.getPeriodrain() == null : this.getPeriodrain().equals(other.getPeriodrain()))
            && (this.getDifferencerain() == null ? other.getDifferencerain() == null : this.getDifferencerain().equals(other.getDifferencerain()))
            && (this.getTotalrain() == null ? other.getTotalrain() == null : this.getTotalrain().equals(other.getTotalrain()))
            && (this.getDayrain() == null ? other.getDayrain() == null : this.getDayrain().equals(other.getDayrain()))
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
        result = prime * result + ((getPeriodrain() == null) ? 0 : getPeriodrain().hashCode());
        result = prime * result + ((getDifferencerain() == null) ? 0 : getDifferencerain().hashCode());
        result = prime * result + ((getTotalrain() == null) ? 0 : getTotalrain().hashCode());
        result = prime * result + ((getDayrain() == null) ? 0 : getDayrain().hashCode());
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
        sb.append(", periodrain=").append(periodrain);
        sb.append(", differencerain=").append(differencerain);
        sb.append(", totalrain=").append(totalrain);
        sb.append(", dayrain=").append(dayrain);
        sb.append(", transtype=").append(transtype);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", recvdatatime=").append(recvdatatime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}