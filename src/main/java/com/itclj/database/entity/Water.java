package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * WATER
 * @author 
 */
public class Water implements Serializable {
    private String stationid;

    private Date datatime;

    private BigDecimal waterstage;

    private BigDecimal waterflow;

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
        Water other = (Water) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()))
            && (this.getWaterstage() == null ? other.getWaterstage() == null : this.getWaterstage().equals(other.getWaterstage()))
            && (this.getWaterflow() == null ? other.getWaterflow() == null : this.getWaterflow().equals(other.getWaterflow()))
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
        result = prime * result + ((getWaterstage() == null) ? 0 : getWaterstage().hashCode());
        result = prime * result + ((getWaterflow() == null) ? 0 : getWaterflow().hashCode());
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
        sb.append(", waterstage=").append(waterstage);
        sb.append(", waterflow=").append(waterflow);
        sb.append(", transtype=").append(transtype);
        sb.append(", messagetype=").append(messagetype);
        sb.append(", recvdatatime=").append(recvdatatime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}