package com.mq.app.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2295592356215833953L;
	private String productId;
	private String productName;
	private Date dateManufactured;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getDateManufactured() {
		return dateManufactured;
	}
	public void setDateManufactured(Date dateManufactured) {
		this.dateManufactured = dateManufactured;
	}
	

}
