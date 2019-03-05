package com.itclj.database.entity;

import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * HYDLSTATION
 * @author 
 */
public class HydlStation  {
	@JSONField(name="StationID")
    private String stationid;
	@JSONField(name="SubCenterID")
    private Long subcenterid;
	@JSONField(name="StationName")
    private String cname;
	@JSONField(name="StationType")
    private String ctype;
	@JSONField(name="DWaterBase")
    private BigDecimal wbase;
	@JSONField(name="DWaterMax")
    private BigDecimal wmax;
	@JSONField(name="DWaterMin")
    private BigDecimal wmin;
	@JSONField(name="DWaterChange")
    private BigDecimal wchange;
	@JSONField(name="DRainAccuracy")
    private BigDecimal raccuracy;
	@JSONField(name="DRainChange")
    private BigDecimal rchange;
	@JSONField(name="GSM")
    private String gsm;
	@JSONField(name="GPRS")
    private String gprs;
	@JSONField(name="BDSatellite")
    private String bdsatellite;
	@JSONField(name="BDMemberSatellite")
    private String bdmember;
	@JSONField(name="DVoltageMin")
    private BigDecimal voltagemin;
	@JSONField(name="Maintran")
    private String maintran;
	@JSONField(name="Subtran")
    private String subtran;
	@JSONField(name="Datapotocol")
    private String dataprotocol;
	@JSONField(name="Watersensor")
    private String watersensor;
	@JSONField(name="Rainsensor")
    private String rainsensor;
	@JSONField(name="Reportinterval")
    private String reportinterval;

    private static final long serialVersionUID = 1L;

	@JSONField(name="StationID")
    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }
	@JSONField(name="SubCenterID")
    public Long getSubcenterid() {
        return subcenterid;
    }

    public void setSubcenterid(Long subcenterid) {
        this.subcenterid = subcenterid;
    }
	@JSONField(name="StationName")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
	@JSONField(name="StationType")
    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
	@JSONField(name="DWaterBase")
    public BigDecimal getWbase() {
        return wbase;
    }

    public void setWbase(BigDecimal wbase) {
        this.wbase = wbase;
    }
	@JSONField(name="DWaterMax")
    public BigDecimal getWmax() {
        return wmax;
    }

    public void setWmax(BigDecimal wmax) {
        this.wmax = wmax;
    }
	@JSONField(name="DWaterMin")
    public BigDecimal getWmin() {
        return wmin;
    }

    public void setWmin(BigDecimal wmin) {
        this.wmin = wmin;
    }
	@JSONField(name="DWaterChange")
    public BigDecimal getWchange() {
        return wchange;
    }

    public void setWchange(BigDecimal wchange) {
        this.wchange = wchange;
    }
	@JSONField(name="DRainAccuracy")
    public BigDecimal getRaccuracy() {
        return raccuracy;
    }

    public void setRaccuracy(BigDecimal raccuracy) {
        this.raccuracy = raccuracy;
    }
	@JSONField(name="DRainChange")
    public BigDecimal getRchange() {
        return rchange;
    }

    public void setRchange(BigDecimal rchange) {
        this.rchange = rchange;
    }
	@JSONField(name="GSM")
    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }
	@JSONField(name="GPRS")
    public String getGprs() {
        return gprs;
    }

    public void setGprs(String gprs) {
        this.gprs = gprs;
    }
	@JSONField(name="BDSatellite")
    public String getBdsatellite() {
        return bdsatellite;
    }

    public void setBdsatellite(String bdsatellite) {
        this.bdsatellite = bdsatellite;
    }
	@JSONField(name="BDMemberSatellite")
    public String getBdmember() {
        return bdmember;
    }

    public void setBdmember(String bdmember) {
        this.bdmember = bdmember;
    }
	@JSONField(name="DVoltageMin")
    public BigDecimal getVoltagemin() {
        return voltagemin;
    }

    public void setVoltagemin(BigDecimal voltagemin) {
        this.voltagemin = voltagemin;
    }
	@JSONField(name="Maintran")
    public String getMaintran() {
        return maintran;
    }

    public void setMaintran(String maintran) {
        this.maintran = maintran;
    }
	@JSONField(name="Subtran")
    public String getSubtran() {
        return subtran;
    }

    public void setSubtran(String subtran) {
        this.subtran = subtran;
    }
	@JSONField(name="Datapotocol")
    public String getDataprotocol() {
        return dataprotocol;
    }

    public void setDataprotocol(String dataprotocol) {
        this.dataprotocol = dataprotocol;
    }
	@JSONField(name="Watersensor")
    public String getWatersensor() {
        return watersensor;
    }

    public void setWatersensor(String watersensor) {
        this.watersensor = watersensor;
    }
	@JSONField(name="Rainsensor")
    public String getRainsensor() {
        return rainsensor;
    }

    public void setRainsensor(String rainsensor) {
        this.rainsensor = rainsensor;
    }
	@JSONField(name="Reportinterval")
    public String getReportinterval() {
        return reportinterval;
    }

    public void setReportinterval(String reportinterval) {
        this.reportinterval = reportinterval;
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
        HydlStation other = (HydlStation) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getSubcenterid() == null ? other.getSubcenterid() == null : this.getSubcenterid().equals(other.getSubcenterid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getCtype() == null ? other.getCtype() == null : this.getCtype().equals(other.getCtype()))
            && (this.getWbase() == null ? other.getWbase() == null : this.getWbase().equals(other.getWbase()))
            && (this.getWmax() == null ? other.getWmax() == null : this.getWmax().equals(other.getWmax()))
            && (this.getWmin() == null ? other.getWmin() == null : this.getWmin().equals(other.getWmin()))
            && (this.getWchange() == null ? other.getWchange() == null : this.getWchange().equals(other.getWchange()))
            && (this.getRaccuracy() == null ? other.getRaccuracy() == null : this.getRaccuracy().equals(other.getRaccuracy()))
            && (this.getRchange() == null ? other.getRchange() == null : this.getRchange().equals(other.getRchange()))
            && (this.getGsm() == null ? other.getGsm() == null : this.getGsm().equals(other.getGsm()))
            && (this.getGprs() == null ? other.getGprs() == null : this.getGprs().equals(other.getGprs()))
            && (this.getBdsatellite() == null ? other.getBdsatellite() == null : this.getBdsatellite().equals(other.getBdsatellite()))
            && (this.getBdmember() == null ? other.getBdmember() == null : this.getBdmember().equals(other.getBdmember()))
            && (this.getVoltagemin() == null ? other.getVoltagemin() == null : this.getVoltagemin().equals(other.getVoltagemin()))
            && (this.getMaintran() == null ? other.getMaintran() == null : this.getMaintran().equals(other.getMaintran()))
            && (this.getSubtran() == null ? other.getSubtran() == null : this.getSubtran().equals(other.getSubtran()))
            && (this.getDataprotocol() == null ? other.getDataprotocol() == null : this.getDataprotocol().equals(other.getDataprotocol()))
            && (this.getWatersensor() == null ? other.getWatersensor() == null : this.getWatersensor().equals(other.getWatersensor()))
            && (this.getRainsensor() == null ? other.getRainsensor() == null : this.getRainsensor().equals(other.getRainsensor()))
            && (this.getReportinterval() == null ? other.getReportinterval() == null : this.getReportinterval().equals(other.getReportinterval()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getSubcenterid() == null) ? 0 : getSubcenterid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getCtype() == null) ? 0 : getCtype().hashCode());
        result = prime * result + ((getWbase() == null) ? 0 : getWbase().hashCode());
        result = prime * result + ((getWmax() == null) ? 0 : getWmax().hashCode());
        result = prime * result + ((getWmin() == null) ? 0 : getWmin().hashCode());
        result = prime * result + ((getWchange() == null) ? 0 : getWchange().hashCode());
        result = prime * result + ((getRaccuracy() == null) ? 0 : getRaccuracy().hashCode());
        result = prime * result + ((getRchange() == null) ? 0 : getRchange().hashCode());
        result = prime * result + ((getGsm() == null) ? 0 : getGsm().hashCode());
        result = prime * result + ((getGprs() == null) ? 0 : getGprs().hashCode());
        result = prime * result + ((getBdsatellite() == null) ? 0 : getBdsatellite().hashCode());
        result = prime * result + ((getBdmember() == null) ? 0 : getBdmember().hashCode());
        result = prime * result + ((getVoltagemin() == null) ? 0 : getVoltagemin().hashCode());
        result = prime * result + ((getMaintran() == null) ? 0 : getMaintran().hashCode());
        result = prime * result + ((getSubtran() == null) ? 0 : getSubtran().hashCode());
        result = prime * result + ((getDataprotocol() == null) ? 0 : getDataprotocol().hashCode());
        result = prime * result + ((getWatersensor() == null) ? 0 : getWatersensor().hashCode());
        result = prime * result + ((getRainsensor() == null) ? 0 : getRainsensor().hashCode());
        result = prime * result + ((getReportinterval() == null) ? 0 : getReportinterval().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationid=").append(stationid);
        sb.append(", subcenterid=").append(subcenterid);
        sb.append(", cname=").append(cname);
        sb.append(", ctype=").append(ctype);
        sb.append(", wbase=").append(wbase);
        sb.append(", wmax=").append(wmax);
        sb.append(", wmin=").append(wmin);
        sb.append(", wchange=").append(wchange);
        sb.append(", raccuracy=").append(raccuracy);
        sb.append(", rchange=").append(rchange);
        sb.append(", gsm=").append(gsm);
        sb.append(", gprs=").append(gprs);
        sb.append(", bdsatellite=").append(bdsatellite);
        sb.append(", bdmember=").append(bdmember);
        sb.append(", voltagemin=").append(voltagemin);
        sb.append(", maintran=").append(maintran);
        sb.append(", subtran=").append(subtran);
        sb.append(", dataprotocol=").append(dataprotocol);
        sb.append(", watersensor=").append(watersensor);
        sb.append(", rainsensor=").append(rainsensor);
        sb.append(", reportinterval=").append(reportinterval);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}