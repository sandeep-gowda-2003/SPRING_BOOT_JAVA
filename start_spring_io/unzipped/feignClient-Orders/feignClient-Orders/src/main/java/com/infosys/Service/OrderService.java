package com.infosys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.controller.Product;
import com.infosys.controller.ProductClient;

@Service
public class OrderService {

	@Autowired
	private ProductClient pclient;
	
	public Product getProductById(Long id) {
		return pclient.getProductById(id);
	}
}
