package com.sandeep.Annotation_Component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("shoppingList")
//if you don't inculde scope of prototype then by default it will be singleton
//@Scope("prototype")
@ToString
public class ShoppingList {
	private List<Mobile> items = new ArrayList<>();
	
	public void addItem(Mobile m) {
		items.add(m);
	}
	
	public List<Mobile> getItems(){
		return items;
	}
}
