package com.infosys.Emp;

public class Employee {
	int empNumber,basicPay,da,hra,tax;

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public int getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	public void display() {
		System.out.println("Employee Number "+empNumber+"\nBasic Pay "
				+basicPay+"\nDA "+da+"\nHRA "+hra+"\nTAX "+tax);
	}
	public int grossSalary() {
		return basicPay+da;
	}
	public void netSalary() {
		System.out.println("YOUR NET SALARY: "+(basicPay+da-hra-tax));
	}
	
}
