package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ST_ZQ_B
 * @author 
 */
public class StZqB implements Serializable {
    private String stationid;

    private Date bgtm;

    private Long ptno;

    private BigDecimal zr;

    private BigDecimal q1;

    private BigDecimal q2;

    private BigDecimal q3;

    private BigDecimal q4;

    private BigDecimal q5;

    private BigDecimal q6;

    private Long currq;

    private static final long serialVersionUID = 1L;

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public Date getBgtm() {
        return bgtm;
    }

    public void setBgtm(Date bgtm) {
        this.bgtm = bgtm;
    }

    public Long getPtno() {
        return ptno;
    }

    public void setPtno(Long ptno) {
        this.ptno = ptno;
    }

    public BigDecimal getZr() {
        return zr;
    }

    public void setZr(BigDecimal zr) {
        this.zr = zr;
    }

    public BigDecimal getQ1() {
        return q1;
    }

    public void setQ1(BigDecimal q1) {
        this.q1 = q1;
    }

    public BigDecimal getQ2() {
        return q2;
    }

    public void setQ2(BigDecimal q2) {
        this.q2 = q2;
    }

    public BigDecimal getQ3() {
        return q3;
    }

    public void setQ3(BigDecimal q3) {
        this.q3 = q3;
    }

    public BigDecimal getQ4() {
        return q4;
    }

    public void setQ4(BigDecimal q4) {
        this.q4 = q4;
    }

    public BigDecimal getQ5() {
        return q5;
    }

    public void setQ5(BigDecimal q5) {
        this.q5 = q5;
    }

    public BigDecimal getQ6() {
        return q6;
    }

    public void setQ6(BigDecimal q6) {
        this.q6 = q6;
    }

    public Long getCurrq() {
        return currq;
    }

    public void setCurrq(Long currq) {
        this.currq = currq;
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
        StZqB other = (StZqB) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getBgtm() == null ? other.getBgtm() == null : this.getBgtm().equals(other.getBgtm()))
            && (this.getPtno() == null ? other.getPtno() == null : this.getPtno().equals(other.getPtno()))
            && (this.getZr() == null ? other.getZr() == null : this.getZr().equals(other.getZr()))
            && (this.getQ1() == null ? other.getQ1() == null : this.getQ1().equals(other.getQ1()))
            && (this.getQ2() == null ? other.getQ2() == null : this.getQ2().equals(other.getQ2()))
            && (this.getQ3() == null ? other.getQ3() == null : this.getQ3().equals(other.getQ3()))
            && (this.getQ4() == null ? other.getQ4() == null : this.getQ4().equals(other.getQ4()))
            && (this.getQ5() == null ? other.getQ5() == null : this.getQ5().equals(other.getQ5()))
            && (this.getQ6() == null ? other.getQ6() == null : this.getQ6().equals(other.getQ6()))
            && (this.getCurrq() == null ? other.getCurrq() == null : this.getCurrq().equals(other.getCurrq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getBgtm() == null) ? 0 : getBgtm().hashCode());
        result = prime * result + ((getPtno() == null) ? 0 : getPtno().hashCode());
        result = prime * result + ((getZr() == null) ? 0 : getZr().hashCode());
        result = prime * result + ((getQ1() == null) ? 0 : getQ1().hashCode());
        result = prime * result + ((getQ2() == null) ? 0 : getQ2().hashCode());
        result = prime * result + ((getQ3() == null) ? 0 : getQ3().hashCode());
        result = prime * result + ((getQ4() == null) ? 0 : getQ4().hashCode());
        result = prime * result + ((getQ5() == null) ? 0 : getQ5().hashCode());
        result = prime * result + ((getQ6() == null) ? 0 : getQ6().hashCode());
        result = prime * result + ((getCurrq() == null) ? 0 : getCurrq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationid=").append(stationid);
        sb.append(", bgtm=").append(bgtm);
        sb.append(", ptno=").append(ptno);
        sb.append(", zr=").append(zr);
        sb.append(", q1=").append(q1);
        sb.append(", q2=").append(q2);
        sb.append(", q3=").append(q3);
        sb.append(", q4=").append(q4);
        sb.append(", q5=").append(q5);
        sb.append(", q6=").append(q6);
        sb.append(", currq=").append(currq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}