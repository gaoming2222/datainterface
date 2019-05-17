package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * SPLASHMAPDATA
 * @author 
 */
public class Splashmapdata implements Serializable {
    /**
     * 站点ID
     */
    private String stationid;

    private BigDecimal rain1h;

    private BigDecimal rain2h;

    private BigDecimal rain6h;

    private BigDecimal rain12h;

    private BigDecimal rain24h;

    private BigDecimal rain48h;

    private static final long serialVersionUID = 1L;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public BigDecimal getRain1h() {
        return rain1h;
    }

    public void setRain1h(BigDecimal rain1h) {
        this.rain1h = rain1h;
    }

    public BigDecimal getRain2h() {
        return rain2h;
    }

    public void setRain2h(BigDecimal rain2h) {
        this.rain2h = rain2h;
    }

    public BigDecimal getRain6h() {
        return rain6h;
    }

    public void setRain6h(BigDecimal rain6h) {
        this.rain6h = rain6h;
    }

    public BigDecimal getRain12h() {
        return rain12h;
    }

    public void setRain12h(BigDecimal rain12h) {
        this.rain12h = rain12h;
    }

    public BigDecimal getRain24h() {
        return rain24h;
    }

    public void setRain24h(BigDecimal rain24h) {
        this.rain24h = rain24h;
    }

    public BigDecimal getRain48h() {
        return rain48h;
    }

    public void setRain48h(BigDecimal rain48h) {
        this.rain48h = rain48h;
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
        Splashmapdata other = (Splashmapdata) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getRain1h() == null ? other.getRain1h() == null : this.getRain1h().equals(other.getRain1h()))
            && (this.getRain2h() == null ? other.getRain2h() == null : this.getRain2h().equals(other.getRain2h()))
            && (this.getRain6h() == null ? other.getRain6h() == null : this.getRain6h().equals(other.getRain6h()))
            && (this.getRain12h() == null ? other.getRain12h() == null : this.getRain12h().equals(other.getRain12h()))
            && (this.getRain24h() == null ? other.getRain24h() == null : this.getRain24h().equals(other.getRain24h()))
            && (this.getRain48h() == null ? other.getRain48h() == null : this.getRain48h().equals(other.getRain48h()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getRain1h() == null) ? 0 : getRain1h().hashCode());
        result = prime * result + ((getRain2h() == null) ? 0 : getRain2h().hashCode());
        result = prime * result + ((getRain6h() == null) ? 0 : getRain6h().hashCode());
        result = prime * result + ((getRain12h() == null) ? 0 : getRain12h().hashCode());
        result = prime * result + ((getRain24h() == null) ? 0 : getRain24h().hashCode());
        result = prime * result + ((getRain48h() == null) ? 0 : getRain48h().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationid=").append(stationid);
        sb.append(", rain1h=").append(rain1h);
        sb.append(", rain2h=").append(rain2h);
        sb.append(", rain6h=").append(rain6h);
        sb.append(", rain12h=").append(rain12h);
        sb.append(", rain24h=").append(rain24h);
        sb.append(", rain48h=").append(rain48h);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}