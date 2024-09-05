package com.infosys.demo;

public class Bank {
	int accountNumber;
	int amount;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void deposit(int amount) {
		this.amount+=amount;
		System.out.println("Rs."+amount+" is added into account");
		System.out.println("final balance is "+this.amount);
	}
	public int checkBalance() {
		return amount;
	}
	public String toString() {
		return "Bank [ account Number: "+accountNumber+" amount: "+amount+"]";
	}
}
