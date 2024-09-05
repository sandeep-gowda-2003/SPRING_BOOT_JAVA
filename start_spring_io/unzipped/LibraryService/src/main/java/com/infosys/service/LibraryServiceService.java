package com.infosys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.LibraryService;
import com.infosys.exception.NotFoundException;
import com.infosys.feignClient.BookFeignClient;
import com.infosys.repository.LibraryRepository;
import com.infosys.response.BookResponse;
import com.infosys.response.LibBookResponse;

@Service
public class LibraryServiceService {
	@Autowired
	private LibraryRepository brepo;
	
	@Autowired 
	BookFeignClient feign;
	
	
	public String insertLib(LibraryService b) {
		System.out.println(b.getLibrary_name());
		LibraryService a=brepo.saveAndFlush(b);
		if(a!=null) {
			return "successfull Insertion";
		}
		else {
			return "failure";
			
		}
	}
	public List<LibraryService> fetchall(){
		List<LibraryService> b=new ArrayList<LibraryService>();
		b=brepo.findAll();
		return b;
	}
	public LibraryService fetchbyId(Integer id) throws NotFoundException{
		Optional<LibraryService> b=brepo.findById(id);
		try {
			return b.get();
	}
	catch(Exception e){
		throw new NotFoundException("not found!!!");
	}
	}
	public List<LibraryService> fetchall_avail(Integer id){
		List<LibraryService> b=new ArrayList<LibraryService>();
		String avail="Available";
		b=brepo.findbybookid(id,avail);
		return b;
	}
	public List<LibraryService> fetchwithbook(Integer id){
		List<LibraryService> b=new ArrayList<LibraryService>();
		String avail="Available";
		b=brepo.findbybookid(id,avail);
		BookResponse br=feign.fetch(id).getBody();
		LibBookResponse lb=new LibBookResponse();
		lb.setAuthor_name(br.getAuthor_name());
		lb.setBook_id(br.getBook_id());
		lb.setBook_name(br.getBook_name());
		lb.setPublication_year(br.getPublication_year());	
		return b;
	}}

	

