package com.infosys.entity;

public class Airtel implements Sim{
	@Override
	public void calldata() {
		System.out.println("airtel calling");

	}
	@Override
	public void calling() {
		System.out.println("airtel called");

	}
}
