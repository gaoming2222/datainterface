package com.itclj.database.entity;

import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

public class Station {
	@JSONField(name="StationID")
	private String StationID;
	@JSONField(name="StationName")
	private String StationName;
	@JSONField(name="StationType")
	private Long StationType;
	@JSONField(name="SubCenterID")
	private Long SubCenterID;
	@JSONField(name="Origin")
	private String Origin;
	@JSONField(name="Longitude")
	private BigDecimal Longitude;
	@JSONField(name="Latitude")
	private BigDecimal Latitude;
	@JSONField(name="ID")
	private String ID;
	@JSONField(name="RainMax")
	private BigDecimal RainMax;
	@JSONField(name="WaterMax")
	private BigDecimal WaterMax;
	@JSONField(name="WaterMin")
	private BigDecimal WaterMin;
	
	@JSONField(name="Watershed")
	private String Watershed;
	
	@JSONField(name="Content")
	private String Content;
	
	@JSONField(name="Project")
	private String Project;
	
	@JSONField(name="Company")
	private String Company;
	
	@JSONField(name="Pass")
	private String Pass;
	
    private static final long serialVersionUID = 1L;

    
	@JSONField(name="StationID")
    public String getStationID(){
    	return StationID;
    }
    public void setStationID(String StationID){
    	this.StationID = StationID;
    }
	
	@JSONField(name="StationName")
    public String getStationName(){
    	return StationName;
    }
    public void setStationName(String StationName){
    	this.StationName = StationName;
    }
	
	@JSONField(name="StationType")
    public Long getStationType(){
    	return StationType;
    }
    public void setStationType(Long StationType){
    	this.StationType = StationType;
    }
	
	@JSONField(name="SubCenterID")
    public Long getSubCenterID(){
    	return SubCenterID;
    }
    public void setSubCenterID(Long SubCenterID){
    	this.SubCenterID = SubCenterID;
    }
	
	@JSONField(name="Origin")
    public String getOrigin(){
    	return Origin;
    }
    public void setOrigin(String Origin){
    	this.Origin = Origin;
    }
    
	@JSONField(name="Longitude")
    public BigDecimal getLongitude(){
    	return Longitude;
    }
    public void setLongitude(BigDecimal Longitude){
    	this.Longitude = Longitude;
    }
    
	@JSONField(name="Latitude")
    public BigDecimal getLatitude(){
    	return Latitude;
    }
    public void setLatitude(BigDecimal Latitude){
    	this.Latitude = Latitude;
    }
    
	@JSONField(name="ID")
    public String getID(){
    	return ID;
    }
    public void setID(String ID){
    	this.ID = ID;
    }
    
	@JSONField(name="RainMax")
    public BigDecimal getRainMax(){
    	return RainMax;
    }
    public void setRainMax(BigDecimal RainMax){
    	this.RainMax = RainMax;
    }
    
	@JSONField(name="WaterMax")
    public BigDecimal getWaterMax(){
    	return WaterMax;
    }
    public void setWaterMax(BigDecimal WaterMax){
    	this.WaterMax = WaterMax;
    }
    
	@JSONField(name="WaterMin")
    public BigDecimal getWaterMin(){
    	return WaterMin;
    }
    public void setWaterMin(BigDecimal WaterMin){
    	this.WaterMin = WaterMin;
    }
    
    
    @JSONField(name="Watershed")
    public String getWatershed() {
		return Watershed;
	}
	public void setWatershed(String watershed) {
		Watershed = watershed;
	}
	@JSONField(name="Content")
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	@JSONField(name="Project")
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	}
	@JSONField(name="Company")
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	@JSONField(name="Pass")
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
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
        Station other = (Station) that;
        return (this.getStationID() == null ? other.getStationID() == null : this.getStationID().equals(other.getStationID()))
            && (this.getStationName() == null ? other.getStationName() == null : this.getStationName().equals(other.getStationName()))
            && (this.getStationType() == null ? other.getStationType() == null : this.getStationType().equals(other.getStationType()))
            && (this.getSubCenterID() == null ? other.getSubCenterID() == null : this.getSubCenterID().equals(other.getSubCenterID()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getRainMax() == null ? other.getRainMax() == null : this.getRainMax().equals(other.getRainMax()))
            && (this.getWaterMax() == null ? other.getWaterMax() == null : this.getWaterMax().equals(other.getWaterMax()))
            && (this.getWaterMin() == null ? other.getWaterMin() == null : this.getWaterMin().equals(other.getWaterMin()))
            && (this.getWatershed() == null ? other.getWatershed() == null : this.getWatershed().equals(other.getWatershed()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getProject() == null ? other.getProject() == null : this.getProject().equals(other.getProject()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getPass() == null ? other.getPass() == null : this.getPass().equals(other.getPass()));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStationID() == null) ? 0 : getStationID().hashCode());
        result = prime * result + ((getStationName() == null) ? 0 : getStationName().hashCode());
        result = prime * result + ((getStationType() == null) ? 0 : getStationType().hashCode());
        result = prime * result + ((getSubCenterID() == null) ? 0 : getSubCenterID().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getRainMax() == null) ? 0 : getRainMax().hashCode());
        result = prime * result + ((getWaterMax() == null) ? 0 : getWaterMax().hashCode());
        result = prime * result + ((getWaterMin() == null) ? 0 : getWaterMin().hashCode());
        result = prime * result + ((getWatershed() == null) ? 0 : getWatershed().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getProject() == null) ? 0 : getProject().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getPass() == null) ? 0 : getPass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", StationID=").append(StationID);
        sb.append(", StationName=").append(StationName);
        sb.append(", StationType=").append(StationType);
        sb.append(", SubCenterID=").append(SubCenterID);
        sb.append(", Origin=").append(Origin);
        sb.append(", Longitude=").append(Longitude);
        sb.append(", Latitude=").append(Latitude);
        sb.append(", ID=").append(ID);
        sb.append(", RainMax=").append(RainMax);
        sb.append(", WaterMax=").append(WaterMax);
        sb.append(", WaterMin=").append(WaterMin);
        sb.append(", Watershed=").append(Watershed);
        sb.append(", Project=").append(Project);
        sb.append(", Company=").append(Company);
        sb.append(", Pass=").append(Pass);
        sb.append(", Content=").append(Content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
