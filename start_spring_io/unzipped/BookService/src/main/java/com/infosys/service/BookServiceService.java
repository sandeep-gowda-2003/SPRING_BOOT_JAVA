package com.infosys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.BookService;
import com.infosys.exception.MissingItemException;
import com.infosys.repository.BookRepository;

@Service
public class BookServiceService {
	@Autowired
	private BookRepository brepo;
	
	public String insertBook(BookService b) {
		System.out.println(b.getAuthor_name());
		BookService a=brepo.saveAndFlush(b);
		if(a!=null) {
			return "successfull Insertion";
		}
		else {
			return "failure";
			
		}
	}
	public List<BookService> fetchall(){
		List<BookService> b=new ArrayList<BookService>();
		b=brepo.findAll();
		return b;
	}
	public BookService fetchbyId(Integer id) throws MissingItemException{
		System.out.println("inside");
		Optional<BookService> b=brepo.findById(id);
		System.out.println("inside");
		try {
				System.out.println("present");
				return b.get();
		}
		catch(Exception e){
			throw new MissingItemException("not found!!!");
		}
	}
	public List<BookService> deletebyId(Integer id){
		brepo.deleteById(id);
		List<BookService> b=new ArrayList<BookService>();
		b=brepo.findAll();
		return b;
	}
	public String updatebyId(BookService b){
		brepo.updatebook(b.getBook_name(), b.getAuthor_name(), b.getPublication_year(), b.getBook_id());
		return "successfully updated";
	}
}
