package com.infosys.AnnotationComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingListConfig.class);
		Mobile ip=context.getBean("iphone",Mobile.class);
		Mobile mi=context.getBean("mi",Mobile.class);
		Mobile vivo=context.getBean("vivo",Mobile.class);
		
		ShoppingList list1 = context.getBean("shoppingList",ShoppingList.class);
		list1.addItem(ip);
		System.out.println(list1.toString());
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		ShoppingList list2 = context.getBean("shoppingList",ShoppingList.class);
		list2.addItem(mi);
		System.out.println(list2);
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		ShoppingList list3 = context.getBean("shoppingList",ShoppingList.class);
		list3.addItem(vivo);
		System.out.println(list3);
	}

}
