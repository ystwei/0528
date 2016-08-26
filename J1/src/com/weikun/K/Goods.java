package com.weikun.K;

public class Goods {
	private String no;
	private String name;
	private double price;
	private int quantity;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Goods(String no, String name, double price, int quantity) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Goods(){}
	
}
