package com.itclj.database.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * USER$
 * @author 
 */
public class UserBS implements Serializable {
	@JSONField(name="ID")
	private BigDecimal ID;
	@JSONField(name="Name")
    private String Name;
	@JSONField(name="Password")
    private String Password;
	@JSONField(name="Subcenter")
	private BigDecimal Subcenter;
	@JSONField(name="Authority")
	private BigDecimal  Authority;
	
	
	
	
	
    private static final long serialVersionUID = 1L;
    
	@JSONField(name="ID")
	public BigDecimal getID() {
		return ID;
	}
	public void setID(BigDecimal ID) {
		this.ID = ID;
	}

	
	@JSONField(name="Authority")
	public BigDecimal getAuthority() {
		return Authority;
	}
	public void setAuthority(BigDecimal authority) {
		this.Authority = authority;
	}

    
	@JSONField(name="Name")
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    
	@JSONField(name="Password")
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    
	@JSONField(name="Subcenter")
    public BigDecimal getSubcenter() {
        return Subcenter;
    }
    public void setSubcenter(BigDecimal subcenter) {
        this.Subcenter = subcenter;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSubcenter() == null) ? 0 : getSubcenter().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", Password=").append(Password);
        sb.append(", Name=").append(Name);
        sb.append(", Subcenter=").append(Subcenter);
        sb.append(", Authority=").append(Authority);
        sb.append("]");
        return sb.toString();
    }
}