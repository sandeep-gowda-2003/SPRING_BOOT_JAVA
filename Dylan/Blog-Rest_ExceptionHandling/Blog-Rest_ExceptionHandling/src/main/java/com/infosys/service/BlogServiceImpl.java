package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Blog;
import com.infosys.exception.BlogAldreadyExistsException;
import com.infosys.exception.BlogNotFoundException;
import com.infosys.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepository;

	@Override
	public Blog saveBlog(Blog blog) throws BlogAldreadyExistsException {
		// TODO Auto-generated method stub
		if (blogRepository.existsById(blog.getBlogid())) {
			throw new BlogAldreadyExistsException();
		} else {
			Blog savedBlog = blogRepository.save(blog);
			return savedBlog;
		}
	}

	@Override
	public List getAllBlogs() {
		return (List) blogRepository.findAll();
	}

	@Override
	public Blog getBlogById(int id) throws BlogNotFoundException {
		// TODO Auto-generated method stub
		Blog blog;
		if (blogRepository.findById(id).isEmpty()) {
			throw new BlogNotFoundException();
			
		}else {
			blog = blogRepository.findById(id).get();
		}
		return blog;
	}

}
