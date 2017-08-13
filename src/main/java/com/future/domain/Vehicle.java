package com.future.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Package com.future.domain
 * 
 * @Title: vehicle.java
 *
 * @author: 孤城落寞
 *
 * @date 2017年7月31日 下午4:05:31
 * 
 * @Description:
 * 
 */
public class Vehicle {

	// 档案号
	private String vehicleId;
	// 车牌号
	private String plateId;
	// 车辆型号
	private String model;
	// 发动机编号
	private String engineId;
	// 车底盘号衍射
	private String carChassisId;
	// 出厂日期
	private Date manufactureDate;
	// 重量
	private Double weight;
    //备案日期
	private Date date;
	
	//车主名字       
	private String userName;
	//车主id
	private Integer userId;
    
	//维护信息数量  多对一
	private Integer maintainNuber;
	
	
	// 车的类别
	private BaseDict category;
	// 车辆状态
	private BaseDict operationStatus;
    
	//假删除
	private String judge;
	
	
	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getPlateId() {
		return plateId;
	}


	public void setPlateId(String plateId) {
		this.plateId = plateId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngineId() {
		return engineId;
	}

	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	public String getCarChassisId() {
		return carChassisId;
	}

	public void setCarChassisId(String carChassisId) {
		this.carChassisId = carChassisId;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public BaseDict getCategory() {
		return category;
	}

	public void setCategory(BaseDict category) {
		this.category = category;
	}

	public BaseDict getOperationStatus() {
		return operationStatus;
	}

	public void setOperationStatus(BaseDict operationStatus) {
		this.operationStatus = operationStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getMaintainNuber() {
		return maintainNuber;
	}

	public void setMaintainNuber(Integer maintainNuber) {
		this.maintainNuber = maintainNuber;
	}

	public String getJudge() {
		return judge;
	}

	public void setJudge(String judge) {
		this.judge = judge;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", plateId=" + plateId + ", model=" + model + ", engineId="
				+ engineId + ", carChassisId=" + carChassisId + ", manufactureDate=" + manufactureDate + ", weight="
				+ weight + ", date=" + date + ", userName=" + userName + ", userId=" + userId + ", maintainNuber="
				+ maintainNuber + ", category=" + category + ", operationStatus=" + operationStatus + ", judge=" + judge
				+ "]";
	}


}