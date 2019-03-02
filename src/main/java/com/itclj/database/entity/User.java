package com.itclj.database.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * USER$
 * @author 
 */
public class User implements Serializable {
    private Short user;

    private String name;

    private Short type;

    private String password;

    private Short datats;

    private Short tempts;

    private Date ctime;

    private Date ptime;

    private Date exptime;

    private Date ltime;

    private Short resource;

    private String audit;

    private Short defrole;

    private Short defgrp;

    private Short defgrpSeq;

    private Short astatus;

    private Short lcount;

    private String defschclass;

    private String extUsername;

    private Short spare1;

    private Short spare2;

    private Short spare3;

    private String spare4;

    private String spare5;

    private Date spare6;

    private static final long serialVersionUID = 1L;

    public Short getUser() {
        return user;
    }

    public void setUser(Short user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getDatats() {
        return datats;
    }

    public void setDatats(Short datats) {
        this.datats = datats;
    }

    public Short getTempts() {
        return tempts;
    }

    public void setTempts(Short tempts) {
        this.tempts = tempts;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public Date getExptime() {
        return exptime;
    }

    public void setExptime(Date exptime) {
        this.exptime = exptime;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public Short getResource() {
        return resource;
    }

    public void setResource(Short resource) {
        this.resource = resource;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public Short getDefrole() {
        return defrole;
    }

    public void setDefrole(Short defrole) {
        this.defrole = defrole;
    }

    public Short getDefgrp() {
        return defgrp;
    }

    public void setDefgrp(Short defgrp) {
        this.defgrp = defgrp;
    }

    public Short getDefgrpSeq() {
        return defgrpSeq;
    }

    public void setDefgrpSeq(Short defgrpSeq) {
        this.defgrpSeq = defgrpSeq;
    }

    public Short getAstatus() {
        return astatus;
    }

    public void setAstatus(Short astatus) {
        this.astatus = astatus;
    }

    public Short getLcount() {
        return lcount;
    }

    public void setLcount(Short lcount) {
        this.lcount = lcount;
    }

    public String getDefschclass() {
        return defschclass;
    }

    public void setDefschclass(String defschclass) {
        this.defschclass = defschclass;
    }

    public String getExtUsername() {
        return extUsername;
    }

    public void setExtUsername(String extUsername) {
        this.extUsername = extUsername;
    }

    public Short getSpare1() {
        return spare1;
    }

    public void setSpare1(Short spare1) {
        this.spare1 = spare1;
    }

    public Short getSpare2() {
        return spare2;
    }

    public void setSpare2(Short spare2) {
        this.spare2 = spare2;
    }

    public Short getSpare3() {
        return spare3;
    }

    public void setSpare3(Short spare3) {
        this.spare3 = spare3;
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }

    public String getSpare5() {
        return spare5;
    }

    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }

    public Date getSpare6() {
        return spare6;
    }

    public void setSpare6(Date spare6) {
        this.spare6 = spare6;
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
        User other = (User) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getDatats() == null ? other.getDatats() == null : this.getDatats().equals(other.getDatats()))
            && (this.getTempts() == null ? other.getTempts() == null : this.getTempts().equals(other.getTempts()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getPtime() == null ? other.getPtime() == null : this.getPtime().equals(other.getPtime()))
            && (this.getExptime() == null ? other.getExptime() == null : this.getExptime().equals(other.getExptime()))
            && (this.getLtime() == null ? other.getLtime() == null : this.getLtime().equals(other.getLtime()))
            && (this.getResource() == null ? other.getResource() == null : this.getResource().equals(other.getResource()))
            && (this.getAudit() == null ? other.getAudit() == null : this.getAudit().equals(other.getAudit()))
            && (this.getDefrole() == null ? other.getDefrole() == null : this.getDefrole().equals(other.getDefrole()))
            && (this.getDefgrp() == null ? other.getDefgrp() == null : this.getDefgrp().equals(other.getDefgrp()))
            && (this.getDefgrpSeq() == null ? other.getDefgrpSeq() == null : this.getDefgrpSeq().equals(other.getDefgrpSeq()))
            && (this.getAstatus() == null ? other.getAstatus() == null : this.getAstatus().equals(other.getAstatus()))
            && (this.getLcount() == null ? other.getLcount() == null : this.getLcount().equals(other.getLcount()))
            && (this.getDefschclass() == null ? other.getDefschclass() == null : this.getDefschclass().equals(other.getDefschclass()))
            && (this.getExtUsername() == null ? other.getExtUsername() == null : this.getExtUsername().equals(other.getExtUsername()))
            && (this.getSpare1() == null ? other.getSpare1() == null : this.getSpare1().equals(other.getSpare1()))
            && (this.getSpare2() == null ? other.getSpare2() == null : this.getSpare2().equals(other.getSpare2()))
            && (this.getSpare3() == null ? other.getSpare3() == null : this.getSpare3().equals(other.getSpare3()))
            && (this.getSpare4() == null ? other.getSpare4() == null : this.getSpare4().equals(other.getSpare4()))
            && (this.getSpare5() == null ? other.getSpare5() == null : this.getSpare5().equals(other.getSpare5()))
            && (this.getSpare6() == null ? other.getSpare6() == null : this.getSpare6().equals(other.getSpare6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getDatats() == null) ? 0 : getDatats().hashCode());
        result = prime * result + ((getTempts() == null) ? 0 : getTempts().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getPtime() == null) ? 0 : getPtime().hashCode());
        result = prime * result + ((getExptime() == null) ? 0 : getExptime().hashCode());
        result = prime * result + ((getLtime() == null) ? 0 : getLtime().hashCode());
        result = prime * result + ((getResource() == null) ? 0 : getResource().hashCode());
        result = prime * result + ((getAudit() == null) ? 0 : getAudit().hashCode());
        result = prime * result + ((getDefrole() == null) ? 0 : getDefrole().hashCode());
        result = prime * result + ((getDefgrp() == null) ? 0 : getDefgrp().hashCode());
        result = prime * result + ((getDefgrpSeq() == null) ? 0 : getDefgrpSeq().hashCode());
        result = prime * result + ((getAstatus() == null) ? 0 : getAstatus().hashCode());
        result = prime * result + ((getLcount() == null) ? 0 : getLcount().hashCode());
        result = prime * result + ((getDefschclass() == null) ? 0 : getDefschclass().hashCode());
        result = prime * result + ((getExtUsername() == null) ? 0 : getExtUsername().hashCode());
        result = prime * result + ((getSpare1() == null) ? 0 : getSpare1().hashCode());
        result = prime * result + ((getSpare2() == null) ? 0 : getSpare2().hashCode());
        result = prime * result + ((getSpare3() == null) ? 0 : getSpare3().hashCode());
        result = prime * result + ((getSpare4() == null) ? 0 : getSpare4().hashCode());
        result = prime * result + ((getSpare5() == null) ? 0 : getSpare5().hashCode());
        result = prime * result + ((getSpare6() == null) ? 0 : getSpare6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", password=").append(password);
        sb.append(", datats=").append(datats);
        sb.append(", tempts=").append(tempts);
        sb.append(", ctime=").append(ctime);
        sb.append(", ptime=").append(ptime);
        sb.append(", exptime=").append(exptime);
        sb.append(", ltime=").append(ltime);
        sb.append(", resource=").append(resource);
        sb.append(", audit=").append(audit);
        sb.append(", defrole=").append(defrole);
        sb.append(", defgrp=").append(defgrp);
        sb.append(", defgrpSeq=").append(defgrpSeq);
        sb.append(", astatus=").append(astatus);
        sb.append(", lcount=").append(lcount);
        sb.append(", defschclass=").append(defschclass);
        sb.append(", extUsername=").append(extUsername);
        sb.append(", spare1=").append(spare1);
        sb.append(", spare2=").append(spare2);
        sb.append(", spare3=").append(spare3);
        sb.append(", spare4=").append(spare4);
        sb.append(", spare5=").append(spare5);
        sb.append(", spare6=").append(spare6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}