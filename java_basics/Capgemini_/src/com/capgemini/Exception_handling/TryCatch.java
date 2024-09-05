//Program to demonstrate try multiple catch block

package com.capgemini.Exception_handling;

public class TryCatch {
	public static void main(String[] args) {
		int a = 6, b = 0, c;
		try {
			c = a / b;
			b = a / 0;
		} 
		catch (ArithmeticException e) {
			System.out.println("exception"+e);
		}
		catch (Exception e) {
			System.out.println("exception"+e);
		}
	}
}
