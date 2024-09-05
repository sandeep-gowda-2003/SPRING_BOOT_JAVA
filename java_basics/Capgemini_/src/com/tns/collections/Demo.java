package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo{
	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell", 43453, 8));
		laps.add(new Laptop("asus", 52342, 16));
		Collections.sort(laps);
		for(Laptop l:laps) {
			System.out.println(l);
		}
	}

	

}
