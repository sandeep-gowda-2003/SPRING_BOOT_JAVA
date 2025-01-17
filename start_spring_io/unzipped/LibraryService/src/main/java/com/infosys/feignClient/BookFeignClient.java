package com.infosys.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.response.BookResponse;


@FeignClient("BOOKSERVICE")
public interface BookFeignClient {
	@GetMapping("/fetch/{id}")
	public ResponseEntity<BookResponse> fetch(@PathVariable Integer id);
}
