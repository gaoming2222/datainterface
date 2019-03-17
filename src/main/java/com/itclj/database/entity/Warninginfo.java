package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * WARNINGINFO
 * @author 
 */
public class Warninginfo implements Serializable {
	@JSONField(name="WarningInfoID")
    private BigDecimal infoid;

	@JSONField(name="StrStationId")
    private String stationid;

	@JSONField(name="DataTime")
    private String datatime;

	@JSONField(name="InfoDetail")
    private String infodetail;

	@JSONField(name="WarningInfoCodeType")
    private String errocode;

    private static final long serialVersionUID = 1L;

	@JSONField(name="WarningInfoID")
    public BigDecimal getInfoid() {
        return infoid;
    }

    public void setInfoid(BigDecimal infoid) {
        this.infoid = infoid;
    }

	@JSONField(name="StrStationId")
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

	@JSONField(name="InfoDetail")
    public String getInfodetail() {
        return infodetail;
    }

    public void setInfodetail(String infodetail) {
        this.infodetail = infodetail;
    }

	@JSONField(name="WarningInfoCodeType")
    public String getErrocode() {
        return errocode;
    }

    public void setErrocode(String errocode) {
        this.errocode = errocode;
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
        Warninginfo other = (Warninginfo) that;
        return (this.getInfoid() == null ? other.getInfoid() == null : this.getInfoid().equals(other.getInfoid()))
            && (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getDatatime() == null ? other.getDatatime() == null : this.getDatatime().equals(other.getDatatime()))
            && (this.getInfodetail() == null ? other.getInfodetail() == null : this.getInfodetail().equals(other.getInfodetail()))
            && (this.getErrocode() == null ? other.getErrocode() == null : this.getErrocode().equals(other.getErrocode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInfoid() == null) ? 0 : getInfoid().hashCode());
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getDatatime() == null) ? 0 : getDatatime().hashCode());
        result = prime * result + ((getInfodetail() == null) ? 0 : getInfodetail().hashCode());
        result = prime * result + ((getErrocode() == null) ? 0 : getErrocode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", infoid=").append(infoid);
        sb.append(", stationid=").append(stationid);
        sb.append(", datatime=").append(datatime);
        sb.append(", infodetail=").append(infodetail);
        sb.append(", errocode=").append(errocode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}