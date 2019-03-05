package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * SOILSTATION
 * @author 
 */
public class Soilstation implements Serializable {
	@JSONField(name = "StationID")
    private String stationid;
	@JSONField(name = "SubCenterID")
    private Long subcenterid;
	@JSONField(name = "StationName")
    private String cname;
	@JSONField(name = "StationType")
    private String ctype;
	@JSONField(name="A10")
    private BigDecimal a10;
	@JSONField(name="B10")
    private BigDecimal b10;
	@JSONField(name="C10")
    private BigDecimal c10;
	@JSONField(name="D10")
    private BigDecimal d10;
	@JSONField(name="M10")
    private BigDecimal m10;
	@JSONField(name="N10")
    private BigDecimal n10;
	@JSONField(name="A20")
    private BigDecimal a20;
	@JSONField(name="B20")
    private BigDecimal b20;
	@JSONField(name="C20")
    private BigDecimal c20;
	@JSONField(name="D20")
    private BigDecimal d20;
	@JSONField(name="M20")
    private BigDecimal m20;
	@JSONField(name="N20")
    private BigDecimal n20;
	@JSONField(name="A30")
    private BigDecimal a30;
	@JSONField(name="B30")
    private BigDecimal b30;
	@JSONField(name="C30")
    private BigDecimal c30;
	@JSONField(name="D30")
    private BigDecimal d30;
	@JSONField(name="M30")
    private BigDecimal m30;
	@JSONField(name="N30")
    private BigDecimal n30;
	@JSONField(name="A40")
    private BigDecimal a40;
	@JSONField(name="B40")
    private BigDecimal b40;
	@JSONField(name="C40")
    private BigDecimal c40;
	@JSONField(name="D40")
    private BigDecimal d40;
	@JSONField(name="M40")
    private BigDecimal m40;
	@JSONField(name="N40")
    private BigDecimal n40;
	@JSONField(name="A60")
    private BigDecimal a60;
	@JSONField(name="B60")
    private BigDecimal b60;
	@JSONField(name="C60")
    private BigDecimal c60;
	@JSONField(name="D60")
    private BigDecimal d60;
	@JSONField(name="M60")
    private BigDecimal m60;
	@JSONField(name="N60")
    private BigDecimal n60;
	@JSONField(name="VoltageMin")
    private BigDecimal voltagemin;
	@JSONField(name="GSM")
    private String gsm;
	@JSONField(name="GPRS")
    private String gprs;
	@JSONField(name="BDSatellite")
    private String bdsatellite;
	@JSONField(name="BDMemberSatellite")
    private String bdmember;
	@JSONField(name="Maintran")
    private String maintran;
	@JSONField(name="Subtran")
    private String subtran;
	@JSONField(name="Datapotocol")
    private String dataprotocol;
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
	@JSONField(name="A10")
    public BigDecimal getA10() {
        return a10;
    }

    public void setA10(BigDecimal a10) {
        this.a10 = a10;
    }
	@JSONField(name = "B10")
    public BigDecimal getB10() {
        return b10;
    }

    public void setB10(BigDecimal b10) {
        this.b10 = b10;
    }
	@JSONField(name = "C10")
    public BigDecimal getC10() {
        return c10;
    }

    public void setC10(BigDecimal c10) {
        this.c10 = c10;
    }
	@JSONField(name = "D10")
    public BigDecimal getD10() {
        return d10;
    }

    public void setD10(BigDecimal d10) {
        this.d10 = d10;
    }
	@JSONField(name = "M10")
    public BigDecimal getM10() {
        return m10;
    }

    public void setM10(BigDecimal m10) {
        this.m10 = m10;
    }
	@JSONField(name = "N10")
    public BigDecimal getN10() {
        return n10;
    }

    public void setN10(BigDecimal n10) {
        this.n10 = n10;
    }
	@JSONField(name = "A20")
    public BigDecimal getA20() {
        return a20;
    }

    public void setA20(BigDecimal a20) {
        this.a20 = a20;
    }
	@JSONField(name = "B20")
    public BigDecimal getB20() {
        return b20;
    }

    public void setB20(BigDecimal b20) {
        this.b20 = b20;
    }
	@JSONField(name = "C20")
    public BigDecimal getC20() {
        return c20;
    }

    public void setC20(BigDecimal c20) {
        this.c20 = c20;
    }
	@JSONField(name = "D20")
    public BigDecimal getD20() {
        return d20;
    }

    public void setD20(BigDecimal d20) {
        this.d20 = d20;
    }
	@JSONField(name = "M20")
    public BigDecimal getM20() {
        return m20;
    }

    public void setM20(BigDecimal m20) {
        this.m20 = m20;
    }
	@JSONField(name = "N20")
    public BigDecimal getN20() {
        return n20;
    }

    public void setN20(BigDecimal n20) {
        this.n20 = n20;
    }
	@JSONField(name = "A30")
    public BigDecimal getA30() {
        return a30;
    }

    public void setA30(BigDecimal a30) {
        this.a30 = a30;
    }
	@JSONField(name = "B30")
    public BigDecimal getB30() {
        return b30;
    }

    public void setB30(BigDecimal b30) {
        this.b30 = b30;
    }
	@JSONField(name = "C30")
    public BigDecimal getC30() {
        return c30;
    }

    public void setC30(BigDecimal c30) {
        this.c30 = c30;
    }
	@JSONField(name = "D30")
    public BigDecimal getD30() {
        return d30;
    }

    public void setD30(BigDecimal d30) {
        this.d30 = d30;
    }
	@JSONField(name = "M30")
    public BigDecimal getM30() {
        return m30;
    }

    public void setM30(BigDecimal m30) {
        this.m30 = m30;
    }
	@JSONField(name = "N30")
    public BigDecimal getN30() {
        return n30;
    }

    public void setN30(BigDecimal n30) {
        this.n30 = n30;
    }
	@JSONField(name = "A40")
    public BigDecimal getA40() {
        return a40;
    }

    public void setA40(BigDecimal a40) {
        this.a40 = a40;
    }
	@JSONField(name = "B40")
    public BigDecimal getB40() {
        return b40;
    }

    public void setB40(BigDecimal b40) {
        this.b40 = b40;
    }
	@JSONField(name = "C40")
    public BigDecimal getC40() {
        return c40;
    }

    public void setC40(BigDecimal c40) {
        this.c40 = c40;
    }
	@JSONField(name = "D40")
    public BigDecimal getD40() {
        return d40;
    }

    public void setD40(BigDecimal d40) {
        this.d40 = d40;
    }
	@JSONField(name = "M40")
    public BigDecimal getM40() {
        return m40;
    }

    public void setM40(BigDecimal m40) {
        this.m40 = m40;
    }
	@JSONField(name = "N40")
    public BigDecimal getN40() {
        return n40;
    }

    public void setN40(BigDecimal n40) {
        this.n40 = n40;
    }
	@JSONField(name = "A60")
    public BigDecimal getA60() {
        return a60;
    }

    public void setA60(BigDecimal a60) {
        this.a60 = a60;
    }
	@JSONField(name = "B60")
    public BigDecimal getB60() {
        return b60;
    }

    public void setB60(BigDecimal b60) {
        this.b60 = b60;
    }
	@JSONField(name = "C60")
    public BigDecimal getC60() {
        return c60;
    }

    public void setC60(BigDecimal c60) {
        this.c60 = c60;
    }
	@JSONField(name = "D60")
    public BigDecimal getD60() {
        return d60;
    }

    public void setD60(BigDecimal d60) {
        this.d60 = d60;
    }
	@JSONField(name = "M60")
    public BigDecimal getM60() {
        return m60;
    }

    public void setM60(BigDecimal m60) {
        this.m60 = m60;
    }
    @JSONField(name = "N60")
    public BigDecimal getN60() {
        return n60;
    }

    public void setN60(BigDecimal n60) {
        this.n60 = n60;
    }
	@JSONField(name = "VoltageMin")
    public BigDecimal getVoltagemin() {
        return voltagemin;
    }

    public void setVoltagemin(BigDecimal voltagemin) {
        this.voltagemin = voltagemin;
    }
	@JSONField(name = "GSM")
    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }
	@JSONField(name = "GPRS")
    public String getGprs() {
        return gprs;
    }

    public void setGprs(String gprs) {
        this.gprs = gprs;
    }
	@JSONField(name = "BDSatellite")
    public String getBdsatellite() {
        return bdsatellite;
    }

    public void setBdsatellite(String bdsatellite) {
        this.bdsatellite = bdsatellite;
    }
	@JSONField(name = "BDMemberSatellite")
    public String getBdmember() {
        return bdmember;
    }

    public void setBdmember(String bdmember) {
        this.bdmember = bdmember;
    }
	@JSONField(name = "Maintran")
    public String getMaintran() {
        return maintran;
    }

    public void setMaintran(String maintran) {
        this.maintran = maintran;
    }
	@JSONField(name = "Subtran")
    public String getSubtran() {
        return subtran;
    }

    public void setSubtran(String subtran) {
        this.subtran = subtran;
    }
	@JSONField(name = "Datapotocol")
    public String getDataprotocol() {
        return dataprotocol;
    }

    public void setDataprotocol(String dataprotocol) {
        this.dataprotocol = dataprotocol;
    }
	@JSONField(name = "Reportinterval")
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
        Soilstation other = (Soilstation) that;
        return (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getSubcenterid() == null ? other.getSubcenterid() == null : this.getSubcenterid().equals(other.getSubcenterid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getCtype() == null ? other.getCtype() == null : this.getCtype().equals(other.getCtype()))
            && (this.getA10() == null ? other.getA10() == null : this.getA10().equals(other.getA10()))
            && (this.getB10() == null ? other.getB10() == null : this.getB10().equals(other.getB10()))
            && (this.getC10() == null ? other.getC10() == null : this.getC10().equals(other.getC10()))
            && (this.getD10() == null ? other.getD10() == null : this.getD10().equals(other.getD10()))
            && (this.getM10() == null ? other.getM10() == null : this.getM10().equals(other.getM10()))
            && (this.getN10() == null ? other.getN10() == null : this.getN10().equals(other.getN10()))
            && (this.getA20() == null ? other.getA20() == null : this.getA20().equals(other.getA20()))
            && (this.getB20() == null ? other.getB20() == null : this.getB20().equals(other.getB20()))
            && (this.getC20() == null ? other.getC20() == null : this.getC20().equals(other.getC20()))
            && (this.getD20() == null ? other.getD20() == null : this.getD20().equals(other.getD20()))
            && (this.getM20() == null ? other.getM20() == null : this.getM20().equals(other.getM20()))
            && (this.getN20() == null ? other.getN20() == null : this.getN20().equals(other.getN20()))
            && (this.getA30() == null ? other.getA30() == null : this.getA30().equals(other.getA30()))
            && (this.getB30() == null ? other.getB30() == null : this.getB30().equals(other.getB30()))
            && (this.getC30() == null ? other.getC30() == null : this.getC30().equals(other.getC30()))
            && (this.getD30() == null ? other.getD30() == null : this.getD30().equals(other.getD30()))
            && (this.getM30() == null ? other.getM30() == null : this.getM30().equals(other.getM30()))
            && (this.getN30() == null ? other.getN30() == null : this.getN30().equals(other.getN30()))
            && (this.getA40() == null ? other.getA40() == null : this.getA40().equals(other.getA40()))
            && (this.getB40() == null ? other.getB40() == null : this.getB40().equals(other.getB40()))
            && (this.getC40() == null ? other.getC40() == null : this.getC40().equals(other.getC40()))
            && (this.getD40() == null ? other.getD40() == null : this.getD40().equals(other.getD40()))
            && (this.getM40() == null ? other.getM40() == null : this.getM40().equals(other.getM40()))
            && (this.getN40() == null ? other.getN40() == null : this.getN40().equals(other.getN40()))
            && (this.getA60() == null ? other.getA60() == null : this.getA60().equals(other.getA60()))
            && (this.getB60() == null ? other.getB60() == null : this.getB60().equals(other.getB60()))
            && (this.getC60() == null ? other.getC60() == null : this.getC60().equals(other.getC60()))
            && (this.getD60() == null ? other.getD60() == null : this.getD60().equals(other.getD60()))
            && (this.getM60() == null ? other.getM60() == null : this.getM60().equals(other.getM60()))
            && (this.getN60() == null ? other.getN60() == null : this.getN60().equals(other.getN60()))
            && (this.getVoltagemin() == null ? other.getVoltagemin() == null : this.getVoltagemin().equals(other.getVoltagemin()))
            && (this.getGsm() == null ? other.getGsm() == null : this.getGsm().equals(other.getGsm()))
            && (this.getGprs() == null ? other.getGprs() == null : this.getGprs().equals(other.getGprs()))
            && (this.getBdsatellite() == null ? other.getBdsatellite() == null : this.getBdsatellite().equals(other.getBdsatellite()))
            && (this.getBdmember() == null ? other.getBdmember() == null : this.getBdmember().equals(other.getBdmember()))
            && (this.getMaintran() == null ? other.getMaintran() == null : this.getMaintran().equals(other.getMaintran()))
            && (this.getSubtran() == null ? other.getSubtran() == null : this.getSubtran().equals(other.getSubtran()))
            && (this.getDataprotocol() == null ? other.getDataprotocol() == null : this.getDataprotocol().equals(other.getDataprotocol()))
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
        result = prime * result + ((getA10() == null) ? 0 : getA10().hashCode());
        result = prime * result + ((getB10() == null) ? 0 : getB10().hashCode());
        result = prime * result + ((getC10() == null) ? 0 : getC10().hashCode());
        result = prime * result + ((getD10() == null) ? 0 : getD10().hashCode());
        result = prime * result + ((getM10() == null) ? 0 : getM10().hashCode());
        result = prime * result + ((getN10() == null) ? 0 : getN10().hashCode());
        result = prime * result + ((getA20() == null) ? 0 : getA20().hashCode());
        result = prime * result + ((getB20() == null) ? 0 : getB20().hashCode());
        result = prime * result + ((getC20() == null) ? 0 : getC20().hashCode());
        result = prime * result + ((getD20() == null) ? 0 : getD20().hashCode());
        result = prime * result + ((getM20() == null) ? 0 : getM20().hashCode());
        result = prime * result + ((getN20() == null) ? 0 : getN20().hashCode());
        result = prime * result + ((getA30() == null) ? 0 : getA30().hashCode());
        result = prime * result + ((getB30() == null) ? 0 : getB30().hashCode());
        result = prime * result + ((getC30() == null) ? 0 : getC30().hashCode());
        result = prime * result + ((getD30() == null) ? 0 : getD30().hashCode());
        result = prime * result + ((getM30() == null) ? 0 : getM30().hashCode());
        result = prime * result + ((getN30() == null) ? 0 : getN30().hashCode());
        result = prime * result + ((getA40() == null) ? 0 : getA40().hashCode());
        result = prime * result + ((getB40() == null) ? 0 : getB40().hashCode());
        result = prime * result + ((getC40() == null) ? 0 : getC40().hashCode());
        result = prime * result + ((getD40() == null) ? 0 : getD40().hashCode());
        result = prime * result + ((getM40() == null) ? 0 : getM40().hashCode());
        result = prime * result + ((getN40() == null) ? 0 : getN40().hashCode());
        result = prime * result + ((getA60() == null) ? 0 : getA60().hashCode());
        result = prime * result + ((getB60() == null) ? 0 : getB60().hashCode());
        result = prime * result + ((getC60() == null) ? 0 : getC60().hashCode());
        result = prime * result + ((getD60() == null) ? 0 : getD60().hashCode());
        result = prime * result + ((getM60() == null) ? 0 : getM60().hashCode());
        result = prime * result + ((getN60() == null) ? 0 : getN60().hashCode());
        result = prime * result + ((getVoltagemin() == null) ? 0 : getVoltagemin().hashCode());
        result = prime * result + ((getGsm() == null) ? 0 : getGsm().hashCode());
        result = prime * result + ((getGprs() == null) ? 0 : getGprs().hashCode());
        result = prime * result + ((getBdsatellite() == null) ? 0 : getBdsatellite().hashCode());
        result = prime * result + ((getBdmember() == null) ? 0 : getBdmember().hashCode());
        result = prime * result + ((getMaintran() == null) ? 0 : getMaintran().hashCode());
        result = prime * result + ((getSubtran() == null) ? 0 : getSubtran().hashCode());
        result = prime * result + ((getDataprotocol() == null) ? 0 : getDataprotocol().hashCode());
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
        sb.append(", a10=").append(a10);
        sb.append(", b10=").append(b10);
        sb.append(", c10=").append(c10);
        sb.append(", d10=").append(d10);
        sb.append(", m10=").append(m10);
        sb.append(", n10=").append(n10);
        sb.append(", a20=").append(a20);
        sb.append(", b20=").append(b20);
        sb.append(", c20=").append(c20);
        sb.append(", d20=").append(d20);
        sb.append(", m20=").append(m20);
        sb.append(", n20=").append(n20);
        sb.append(", a30=").append(a30);
        sb.append(", b30=").append(b30);
        sb.append(", c30=").append(c30);
        sb.append(", d30=").append(d30);
        sb.append(", m30=").append(m30);
        sb.append(", n30=").append(n30);
        sb.append(", a40=").append(a40);
        sb.append(", b40=").append(b40);
        sb.append(", c40=").append(c40);
        sb.append(", d40=").append(d40);
        sb.append(", m40=").append(m40);
        sb.append(", n40=").append(n40);
        sb.append(", a60=").append(a60);
        sb.append(", b60=").append(b60);
        sb.append(", c60=").append(c60);
        sb.append(", d60=").append(d60);
        sb.append(", m60=").append(m60);
        sb.append(", n60=").append(n60);
        sb.append(", voltagemin=").append(voltagemin);
        sb.append(", gsm=").append(gsm);
        sb.append(", gprs=").append(gprs);
        sb.append(", bdsatellite=").append(bdsatellite);
        sb.append(", bdmember=").append(bdmember);
        sb.append(", maintran=").append(maintran);
        sb.append(", subtran=").append(subtran);
        sb.append(", dataprotocol=").append(dataprotocol);
        sb.append(", reportinterval=").append(reportinterval);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}