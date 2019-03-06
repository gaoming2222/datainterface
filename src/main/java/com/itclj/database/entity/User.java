package com.itclj.database.entity;

import java.io.Serializable;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * USER$
 * @author 
 */
public class User implements Serializable {
	@JSONField(name="UserID")
	private String UID_;
	
	@JSONField(name="UserID")
	public String getUserId() {
		return UID_;
	}
	public void setUserId(String UID_) {
		this.UID_ = UID_;
	}

	@JSONField(name="UserName")
    private String name;
	
	@JSONField(name="Password")
    private String password;
	
	@JSONField(name="Administrator")
	private String  administrator;
	
	
	
	
	
    private static final long serialVersionUID = 1L;
    
    
	
	
	@JSONField(name="Administrator")
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

    
    @JSONField(name="UserName")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    @JSONField(name="Password")
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAdministrator() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", UID_=").append(UID_);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", administrator=").append(administrator);
        sb.append("]");
        return sb.toString();
    }
}