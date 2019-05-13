package com.itclj.database.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * STATIONONLINE
 * @author 
 */
public class Stationonline implements Serializable {
    /**
     * 站点ID
     */
    private String stationid;

    /**
     * 站点名称
     */
    private String stationname;

    /**
     * 分中心
     */
    private String subcenter;

    /**
     * 站类
     */
    private String stationtype;

    /**
     * 连接时间
     */
    private Date connectime;

    /**
     * 刷新时间
     */
    private Date freshtime;

    /**
     * 状态
     */
    private String state;

    private static final long serialVersionUID = 1L;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getSubcenter() {
        return subcenter;
    }

    public void setSubcenter(String subcenter) {
        this.subcenter = subcenter;
    }

    public String getStationtype() {
        return stationtype;
    }

    public void setStationtype(String stationtype) {
        this.stationtype = stationtype;
    }

    public Date getConnectime() {
        return connectime;
    }

    public void setConnectime(Date connectime) {
        this.connectime = connectime;
    }

    public Date getFreshtime() {
        return freshtime;
    }

    public void setFreshtime(Date freshtime) {
        this.freshtime = freshtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
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
        Stationonline other = (Stationonline) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getStationname() == null ? other.getStationname() == null : this.getStationname().equals(other.getStationname()))
            && (this.getSubcenter() == null ? other.getSubcenter() == null : this.getSubcenter().equals(other.getSubcenter()))
            && (this.getStationtype() == null ? other.getStationtype() == null : this.getStationtype().equals(other.getStationtype()))
            && (this.getConnectime() == null ? other.getConnectime() == null : this.getConnectime().equals(other.getConnectime()))
            && (this.getFreshtime() == null ? other.getFreshtime() == null : this.getFreshtime().equals(other.getFreshtime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getStationname() == null) ? 0 : getStationname().hashCode());
        result = prime * result + ((getSubcenter() == null) ? 0 : getSubcenter().hashCode());
        result = prime * result + ((getStationtype() == null) ? 0 : getStationtype().hashCode());
        result = prime * result + ((getConnectime() == null) ? 0 : getConnectime().hashCode());
        result = prime * result + ((getFreshtime() == null) ? 0 : getFreshtime().hashCode());
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
        sb.append(", stationname=").append(stationname);
        sb.append(", subcenter=").append(subcenter);
        sb.append(", stationtype=").append(stationtype);
        sb.append(", connectime=").append(connectime);
        sb.append(", freshtime=").append(freshtime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}