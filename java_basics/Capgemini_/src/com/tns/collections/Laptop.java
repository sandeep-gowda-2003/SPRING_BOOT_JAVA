package com.tns.collections;

public class Laptop  implements Comparable<Laptop>{
	private String brand;
	private int price,ram;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public String toString() {
		return this.brand+"  "+this.price;
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.getRam()<o.getRam())
		{
			return 1;	
		}
		
		else
			return -1;
	}
}
