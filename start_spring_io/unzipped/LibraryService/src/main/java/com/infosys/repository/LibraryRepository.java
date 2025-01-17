package com.infosys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infosys.entity.LibraryService;

import jakarta.transaction.Transactional;

public interface LibraryRepository extends JpaRepository<LibraryService, Integer>{

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="select * from project where book_id=?1 and book_status=?2;",nativeQuery = true)
	public List<LibraryService> findbybookid(Integer book_id,String avail);

//	List<LibraryService> findByBook_id(int id);
}
