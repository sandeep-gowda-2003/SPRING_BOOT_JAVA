package com.infosys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;
import com.infosys.entity.Blog;
import com.infosys.exception.BlogAldreadyExistsException;
import com.infosys.exception.BlogNotFoundException;
import com.infosys.service.BlogService;


@RestController
@RequestMapping("/api/v1")
public class HomeControllers {
	
	@Autowired
	private BlogService service;
	
	@PostMapping("/blog")
	public ResponseEntity saveBlog(@RequestBody Blog blog) throws BlogAldreadyExistsException
	{
		Blog savedBlog = service.saveBlog(blog);
		return new ResponseEntity<>(savedBlog,HttpStatus.CREATED);
	}
	
	@GetMapping("/blogs")
	public ResponseEntity<List> getAllBlogs(){
		return new ResponseEntity<List>((List) service.getAllBlogs(),HttpStatus.OK);
	}
	
	@GetMapping("/blog/{id}")
	public ResponseEntity getBlogById(@PathVariable("id") Integer id) {
		return new ResponseEntity(service.getBlogById(id),HttpStatus.OK);
	}
	
	@ExceptionHandler(value = BlogNotFoundException.class)
	public ResponseEntity handleNot(BlogNotFoundException blogNotFoundException) {
		return new ResponseEntity("NOT FOUND",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = BlogAldreadyExistsException.class)
	public ResponseEntity handleExists(BlogAldreadyExistsException blogAldreadyExistsException) {
		return new ResponseEntity("Aldreay Exists",HttpStatus.CONFLICT);
	}

}
