package com.infosys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infosys.entity.Blog;
import com.infosys.exception.BlogAldreadyExistsException;
import com.infosys.exception.BlogNotFoundException;

@Service
public interface BlogService {

	public Blog saveBlog(Blog blog) throws BlogAldreadyExistsException;
	
	public List<Blog> getAllBlogs();
	
	public Blog getBlogById(int id) throws BlogNotFoundException;
	 
	
}
