package com.cjc.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_DTLS")
public class Product {
    
	@Id
	@Column(name = "PRODUCT_ID")
	private int pid;
	
	@Column(name = "PRODUCT_NAME")
	private String pname;
	
	@Column(name = "PRODUCT_COLOR")
	private String color;
	
	@Column(name = "PRODUCT_PRICE")
	private double price;
	
	@Column(name = "PRODUCT_CATEGORY")
	private String category;
	
	@Column(name = "PRODUCT_COMPANY")
	private String company;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", color=" + color + ", price=" + price + ", category="
				+ category + ", company=" + company + "]";
	}
}
