package com.itclj.database.entity;

import java.io.Serializable;

/**
 * REPORTSTATISTICS
 * @author 
 */
public class Reportstatistics extends ReportstatisticsKey implements Serializable {
    private Short avrwaterstage;

    private Short maxwaterstage;

    private Short minwaterstage;

    private Short totalrain;

    private Short sum;

    private static final long serialVersionUID = 1L;

    public Short getAvrwaterstage() {
        return avrwaterstage;
    }

    public void setAvrwaterstage(Short avrwaterstage) {
        this.avrwaterstage = avrwaterstage;
    }

    public Short getMaxwaterstage() {
        return maxwaterstage;
    }

    public void setMaxwaterstage(Short maxwaterstage) {
        this.maxwaterstage = maxwaterstage;
    }

    public Short getMinwaterstage() {
        return minwaterstage;
    }

    public void setMinwaterstage(Short minwaterstage) {
        this.minwaterstage = minwaterstage;
    }

    public Short getTotalrain() {
        return totalrain;
    }

    public void setTotalrain(Short totalrain) {
        this.totalrain = totalrain;
    }

    public Short getSum() {
        return sum;
    }

    public void setSum(Short sum) {
        this.sum = sum;
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
        Reportstatistics other = (Reportstatistics) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()))
            && (this.getAvrwaterstage() == null ? other.getAvrwaterstage() == null : this.getAvrwaterstage().equals(other.getAvrwaterstage()))
            && (this.getMaxwaterstage() == null ? other.getMaxwaterstage() == null : this.getMaxwaterstage().equals(other.getMaxwaterstage()))
            && (this.getMinwaterstage() == null ? other.getMinwaterstage() == null : this.getMinwaterstage().equals(other.getMinwaterstage()))
            && (this.getTotalrain() == null ? other.getTotalrain() == null : this.getTotalrain().equals(other.getTotalrain()))
            && (this.getSum() == null ? other.getSum() == null : this.getSum().equals(other.getSum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getDatatime() == null) ? 0 : getDatatime().hashCode());
        result = prime * result + ((getAvrwaterstage() == null) ? 0 : getAvrwaterstage().hashCode());
        result = prime * result + ((getMaxwaterstage() == null) ? 0 : getMaxwaterstage().hashCode());
        result = prime * result + ((getMinwaterstage() == null) ? 0 : getMinwaterstage().hashCode());
        result = prime * result + ((getTotalrain() == null) ? 0 : getTotalrain().hashCode());
        result = prime * result + ((getSum() == null) ? 0 : getSum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", avrwaterstage=").append(avrwaterstage);
        sb.append(", maxwaterstage=").append(maxwaterstage);
        sb.append(", minwaterstage=").append(minwaterstage);
        sb.append(", totalrain=").append(totalrain);
        sb.append(", sum=").append(sum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}