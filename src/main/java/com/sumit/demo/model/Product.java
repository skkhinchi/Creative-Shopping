package com.sumit.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myeproduct")

public class Product {
	public Product()
	{
		
	}
	@Id
	private int id;
	private String productname;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String productname, double price) {
		super();
		this.productname = productname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", price=" + price + "]";
	}
	
	
	
	
}