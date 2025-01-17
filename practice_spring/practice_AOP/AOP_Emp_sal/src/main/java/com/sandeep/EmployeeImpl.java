package com.sandeep;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeImpl {

	private int empNo,basicPay,da,hra,tax;
	public void display() {
		System.out.println("emp No: "+empNo+"\nbasic pay: "+basicPay
				+"da: "+da+"\nhra: "+hra+"\ntax: "+tax);
	}

	public int gross_sal() {
		return basicPay+da;
	}

	public int netsal() {
		// TODO Auto-generated method stub
		return (basicPay+da-hra-tax);
	}

}
