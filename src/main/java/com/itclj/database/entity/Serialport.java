package com.itclj.database.entity;

import java.io.Serializable;

/**
 * SERIALPORT
 * @author 
 */
public class Serialport implements Serializable {
    private Long portnumber;

    private String transtype;

    private Long baudrate;

    private Long databit;

    private Long stopbit;

    private String parity;

    private Long stream;

    private Long break1;

    private Long open;

    private String dataprotocol;

    private static final long serialVersionUID = 1L;

    public Long getPortnumber() {
        return portnumber;
    }

    public void setPortnumber(Long portnumber) {
        this.portnumber = portnumber;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public Long getBaudrate() {
        return baudrate;
    }

    public void setBaudrate(Long baudrate) {
        this.baudrate = baudrate;
    }

    public Long getDatabit() {
        return databit;
    }

    public void setDatabit(Long databit) {
        this.databit = databit;
    }

    public Long getStopbit() {
        return stopbit;
    }

    public void setStopbit(Long stopbit) {
        this.stopbit = stopbit;
    }

    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    public Long getStream() {
        return stream;
    }

    public void setStream(Long stream) {
        this.stream = stream;
    }

    public Long getBreak() {
        return break1;
    }

    public void setBreak(Long break1) {
        this.break1 = break1;
    }

    public Long getOpen() {
        return open;
    }

    public void setOpen(Long open) {
        this.open = open;
    }

    public String getDataprotocol() {
        return dataprotocol;
    }

    public void setDataprotocol(String dataprotocol) {
        this.dataprotocol = dataprotocol;
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
        Serialport other = (Serialport) that;
        return (this.getPortnumber() == null ? other.getPortnumber() == null : this.getPortnumber().equals(other.getPortnumber()))
            && (this.getTranstype() == null ? other.getTranstype() == null : this.getTranstype().equals(other.getTranstype()))
            && (this.getBaudrate() == null ? other.getBaudrate() == null : this.getBaudrate().equals(other.getBaudrate()))
            && (this.getDatabit() == null ? other.getDatabit() == null : this.getDatabit().equals(other.getDatabit()))
            && (this.getStopbit() == null ? other.getStopbit() == null : this.getStopbit().equals(other.getStopbit()))
            && (this.getParity() == null ? other.getParity() == null : this.getParity().equals(other.getParity()))
            && (this.getStream() == null ? other.getStream() == null : this.getStream().equals(other.getStream()))
            && (this.getBreak() == null ? other.getBreak() == null : this.getBreak().equals(other.getBreak()))
            && (this.getOpen() == null ? other.getOpen() == null : this.getOpen().equals(other.getOpen()))
            && (this.getDataprotocol() == null ? other.getDataprotocol() == null : this.getDataprotocol().equals(other.getDataprotocol()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPortnumber() == null) ? 0 : getPortnumber().hashCode());
        result = prime * result + ((getTranstype() == null) ? 0 : getTranstype().hashCode());
        result = prime * result + ((getBaudrate() == null) ? 0 : getBaudrate().hashCode());
        result = prime * result + ((getDatabit() == null) ? 0 : getDatabit().hashCode());
        result = prime * result + ((getStopbit() == null) ? 0 : getStopbit().hashCode());
        result = prime * result + ((getParity() == null) ? 0 : getParity().hashCode());
        result = prime * result + ((getStream() == null) ? 0 : getStream().hashCode());
        result = prime * result + ((getBreak() == null) ? 0 : getBreak().hashCode());
        result = prime * result + ((getOpen() == null) ? 0 : getOpen().hashCode());
        result = prime * result + ((getDataprotocol() == null) ? 0 : getDataprotocol().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", portnumber=").append(portnumber);
        sb.append(", transtype=").append(transtype);
        sb.append(", baudrate=").append(baudrate);
        sb.append(", databit=").append(databit);
        sb.append(", stopbit=").append(stopbit);
        sb.append(", parity=").append(parity);
        sb.append(", stream=").append(stream);
        sb.append(", break=").append(break1);
        sb.append(", open=").append(open);
        sb.append(", dataprotocol=").append(dataprotocol);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}