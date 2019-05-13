package com.itclj.database.entity;

import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * HYDLSTATION B/S
 * @author 
 */
public class HydlStationBS  {
	@JSONField(name="StationID")
    private String StationID;
	@JSONField(name="SubCenterID")
    private Long SubCenterID;
	@JSONField(name="CName")
    private String CName;
	@JSONField(name="CType")
    private String CType;
	@JSONField(name="WBase")
    private BigDecimal WBase;
	@JSONField(name="WMax")
    private BigDecimal WMax;
	@JSONField(name="WMin")
    private BigDecimal WMin;
	@JSONField(name="WChange")
    private BigDecimal WChange;
	@JSONField(name="RAccuracy")
    private BigDecimal RAccuracy;
	@JSONField(name="RChange")
    private BigDecimal RChange;
	@JSONField(name="Gsm")
    private String Gsm;
	@JSONField(name="Gprs")
    private String Gprs;
	@JSONField(name="BDSatellite")
    private String BDSatellite;
	@JSONField(name="BDmember")
    private String BDmember;
	@JSONField(name="VoltageMin")
    private BigDecimal VoltageMin;
	@JSONField(name="maintran")
    private String maintran;
	@JSONField(name="subtran")
    private String subtran;
	@JSONField(name="dataprotocol")
    private String dataprotocol;
	@JSONField(name="watersensor")
    private String watersensor;
	@JSONField(name="rainsensor")
    private String rainsensor;
	@JSONField(name="reportinterval")
    private String reportinterval;

    private static final long serialVersionUID = 1L;

	@JSONField(name="StationID")
    public String getStationid() {
        return StationID;
    }

    public void setStationid(String stationid) {
        this.StationID = stationid;
    }
	@JSONField(name="SubCenterID")
    public Long getSubcenterid() {
        return SubCenterID;
    }

    public void setSubcenterid(Long subcenterid) {
        this.SubCenterID = subcenterid;
    }
	@JSONField(name="CName")
    public String getCname() {
        return CName;
    }

    public void setCname(String cname) {
        this.CName = cname;
    }
	@JSONField(name="CType")
    public String getCtype() {
        return CType;
    }

    public void setCtype(String ctype) {
        this.CType = ctype;
    }
	@JSONField(name="WBase")
    public BigDecimal getWbase() {
        return WBase;
    }

    public void setWbase(BigDecimal wbase) {
        this.WBase = wbase;
    }
	@JSONField(name="WMax")
    public BigDecimal getWmax() {
        return WMax;
    }

    public void setWmax(BigDecimal wmax) {
        this.WMax = wmax;
    }
	@JSONField(name="WMin")
    public BigDecimal getWmin() {
        return WMin;
    }

    public void setWmin(BigDecimal wmin) {
        this.WMin = wmin;
    }
	@JSONField(name="WChange")
    public BigDecimal getWchange() {
        return WChange;
    }

    public void setWchange(BigDecimal wchange) {
        this.WChange = wchange;
    }
	@JSONField(name="RAccuracy")
    public BigDecimal getRaccuracy() {
        return RAccuracy;
    }

    public void setRaccuracy(BigDecimal raccuracy) {
        this.RAccuracy = raccuracy;
    }
	@JSONField(name="RChange")
    public BigDecimal getRchange() {
        return RChange;
    }

    public void setRchange(BigDecimal rchange) {
        this.RChange = rchange;
    }
	@JSONField(name="Gsm")
    public String getGsm() {
        return Gsm;
    }

    public void setGsm(String gsm) {
        this.Gsm = gsm;
    }
	@JSONField(name="Gprs")
    public String getGprs() {
        return Gprs;
    }

    public void setGprs(String gprs) {
        this.Gprs = gprs;
    }
	@JSONField(name="BDSatellite")
    public String getBdsatellite() {
        return BDSatellite;
    }

    public void setBdsatellite(String bdsatellite) {
        this.BDSatellite = bdsatellite;
    }
	@JSONField(name="BDmember")
    public String getBdmember() {
        return BDmember;
    }

    public void setBdmember(String bdmember) {
        this.BDmember = bdmember;
    }
	@JSONField(name="VoltageMin")
    public BigDecimal getVoltagemin() {
        return VoltageMin;
    }

    public void setVoltagemin(BigDecimal voltagemin) {
        this.VoltageMin = voltagemin;
    }
	@JSONField(name="maintran")
    public String getMaintran() {
        return maintran;
    }

    public void setMaintran(String maintran) {
        this.maintran = maintran;
    }
	@JSONField(name="subtran")
    public String getSubtran() {
        return subtran;
    }

    public void setSubtran(String subtran) {
        this.subtran = subtran;
    }
	@JSONField(name="dataprotocol")
    public String getDataprotocol() {
        return dataprotocol;
    }

    public void setDataprotocol(String dataprotocol) {
        this.dataprotocol = dataprotocol;
    }
	@JSONField(name="watersensor")
    public String getWatersensor() {
        return watersensor;
    }

    public void setWatersensor(String watersensor) {
        this.watersensor = watersensor;
    }
	@JSONField(name="rainsensor")
    public String getRainsensor() {
        return rainsensor;
    }

    public void setRainsensor(String rainsensor) {
        this.rainsensor = rainsensor;
    }
	@JSONField(name="reportinterval")
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
        sb.append(", StationID=").append(StationID);
        sb.append(", SubCenterID=").append(SubCenterID);
        sb.append(", CName=").append(CName);
        sb.append(", CType=").append(CType);
        sb.append(", WBase=").append(WBase);
        sb.append(", WMax=").append(WMax);
        sb.append(", WMin=").append(WMin);
        sb.append(", WChange=").append(WChange);
        sb.append(", RAccuracy=").append(RAccuracy);
        sb.append(", RChange=").append(RChange);
        sb.append(", Gsm=").append(Gsm);
        sb.append(", Gprs=").append(Gprs);
        sb.append(", BDSatellite=").append(BDSatellite);
        sb.append(", BDmember=").append(BDmember);
        sb.append(", VoltageMin=").append(VoltageMin);
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