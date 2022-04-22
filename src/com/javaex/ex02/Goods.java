package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	
	//
	public Goods() {} //기본 추가!
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //private -> public
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	//
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
}




