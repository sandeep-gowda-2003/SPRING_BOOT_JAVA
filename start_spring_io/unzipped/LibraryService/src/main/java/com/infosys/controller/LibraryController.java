package com.infosys.controller;

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

import com.infosys.entity.LibraryService;
import com.infosys.exception.NotFoundException;
import com.infosys.service.LibraryServiceService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	LibraryServiceService lservice;

	@PostMapping("/add")
	public ResponseEntity<String> insert(@RequestBody LibraryService b){
		System.out.println("inside");
		String res=lservice.insertLib(b);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	@GetMapping("/fetchall")
	public ResponseEntity<List<LibraryService>> fetchall(){
//		System.out.println("inside");
		List<LibraryService> res=lservice.fetchall();
		return new ResponseEntity<List<LibraryService>>(res,HttpStatus.OK);
	}
	@GetMapping("/fetch/{id}")
	public ResponseEntity<LibraryService> fetch(@PathVariable Integer id){
//		System.out.println("inside");
		LibraryService res=lservice.fetchbyId(id);
		return new ResponseEntity<LibraryService>(res,HttpStatus.OK);
	}
	@GetMapping("/fetchall_avail/{id}")
	public ResponseEntity<List<LibraryService>> fetchall_book(@PathVariable Integer id){
//		System.out.println("inside");
		List<LibraryService> res=lservice.fetchall_avail(id);
		return new ResponseEntity<List<LibraryService>>(res,HttpStatus.OK);
	}

	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity handleNot(NotFoundException NotFoundException) {
		return new ResponseEntity("NOT FOUND",HttpStatus.NOT_FOUND);
	}
	}
