package com.itclj.database.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author gaoming
 *
 */

public class Subcenter {
	
	private String SubCenterID;
	
	private String  SubCenterName;
	
	
	private String Comment;
	
	@JSONField(name="SubCenterID")
	public String getSubcenterId() {
		return SubCenterID;
	}
	public void setSubcenterId(String SubCenterID) {
		this.SubCenterID = SubCenterID;
	}
	@JSONField(name="SubCenterName")
	public String getSubcenterName() {
		return SubCenterName;
	}
	public void setSubcenterName(String SubCenterName) {
		this.SubCenterName = SubCenterName;
	}
	@JSONField(name="Comment")
	public String getComment() {
		return Comment;
	}
	public void setComment(String Comment) {
		this.Comment = Comment;
	}

}
