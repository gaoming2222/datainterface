package com.itclj.database.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ERRORLOG
 * @author 
 */
public class Errorlog implements Serializable {
    private String elProcedure;

    private Date elOperatetime;

    private static final long serialVersionUID = 1L;

    public String getElProcedure() {
        return elProcedure;
    }

    public void setElProcedure(String elProcedure) {
        this.elProcedure = elProcedure;
    }

    public Date getElOperatetime() {
        return elOperatetime;
    }

    public void setElOperatetime(Date elOperatetime) {
        this.elOperatetime = elOperatetime;
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
        Errorlog other = (Errorlog) that;
        return (this.getElProcedure() == null ? other.getElProcedure() == null : this.getElProcedure().equals(other.getElProcedure()))
            && (this.getElOperatetime() == null ? other.getElOperatetime() == null : this.getElOperatetime().equals(other.getElOperatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElProcedure() == null) ? 0 : getElProcedure().hashCode());
        result = prime * result + ((getElOperatetime() == null) ? 0 : getElOperatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elProcedure=").append(elProcedure);
        sb.append(", elOperatetime=").append(elOperatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}