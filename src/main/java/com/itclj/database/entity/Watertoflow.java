package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * WATERTOFLOW
 * @author 
 */
public class Watertoflow implements Serializable {
    private String stationid;

    private BigDecimal water;

    private BigDecimal flow;

    private static final long serialVersionUID = 1L;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public BigDecimal getWater() {
        return water;
    }

    public void setWater(BigDecimal water) {
        this.water = water;
    }

    public BigDecimal getFlow() {
        return flow;
    }

    public void setFlow(BigDecimal flow) {
        this.flow = flow;
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
        Watertoflow other = (Watertoflow) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getWater() == null ? other.getWater() == null : this.getWater().equals(other.getWater()))
            && (this.getFlow() == null ? other.getFlow() == null : this.getFlow().equals(other.getFlow()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getWater() == null) ? 0 : getWater().hashCode());
        result = prime * result + ((getFlow() == null) ? 0 : getFlow().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationid=").append(stationid);
        sb.append(", water=").append(water);
        sb.append(", flow=").append(flow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}