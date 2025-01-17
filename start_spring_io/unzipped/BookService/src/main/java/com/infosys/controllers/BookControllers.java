package com.infosys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.BookService;
import com.infosys.exception.MissingItemException;
import com.infosys.service.BookServiceService;

@RestController
@RequestMapping("/book")
public class BookControllers {
	@Autowired
	BookServiceService service;
	
	@GetMapping("/")
	public String home() {
		System.out.println("hii");
		return "hii";
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> insert(@RequestBody BookService b){
		System.out.println("inside");
		String res=service.insertBook(b);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	@GetMapping("/fetchall")
	public ResponseEntity<List<BookService>> fetchall(){
//		System.out.println("inside");
		List<BookService> res=service.fetchall();
		return new ResponseEntity<List<BookService>>(res,HttpStatus.OK);
	}
	@GetMapping("/fetch/{id}")
	public ResponseEntity<BookService> fetch(@PathVariable Integer id){
//		System.out.println("inside");
		BookService res=service.fetchbyId(id);
		return new ResponseEntity<BookService>(res,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<BookService>> delete(@PathVariable Integer id){
//		System.out.println("inside");
		List<BookService> res=service.deletebyId(id);
		return new ResponseEntity<List<BookService>>(res,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody BookService b){
		System.out.println(b.getPublication_year());
		String res=service.updatebyId(b);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	@ExceptionHandler(value = MissingItemException.class)
	public ResponseEntity handleNot(MissingItemException NotFoundException) {
		return new ResponseEntity("NOT FOUND",HttpStatus.NOT_FOUND);
	}
	

	
}
