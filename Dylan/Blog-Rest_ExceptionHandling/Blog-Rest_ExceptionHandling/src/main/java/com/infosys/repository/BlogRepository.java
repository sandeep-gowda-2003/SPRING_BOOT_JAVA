package com.infosys.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
