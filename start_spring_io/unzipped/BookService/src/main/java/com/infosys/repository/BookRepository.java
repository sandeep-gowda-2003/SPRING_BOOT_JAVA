package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infosys.entity.BookService;

import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<BookService, Integer>{

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="update employee set book_name=?1 ,author_name=?2 ,publication_year=?3  where book_id=?4",nativeQuery = true)
	public void updatebook(String book_name,String author_name,Integer publication_year,Integer book_id);
}
