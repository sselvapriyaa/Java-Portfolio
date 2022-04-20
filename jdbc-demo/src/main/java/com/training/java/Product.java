package com.training.java;

public class Product {
	private String prod_id;
	private String prod_name;
	private String prod_desc;
	private double price;
	/**
	 * @param prod_id
	 * @param prod_name
	 * @param prod_desc
	 * @param price
	 */
	public Product(String prod_id, String prod_name, String prod_desc, double price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.price = price;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
