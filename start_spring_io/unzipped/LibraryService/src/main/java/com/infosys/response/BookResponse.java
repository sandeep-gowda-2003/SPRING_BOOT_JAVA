package com.infosys.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookResponse {

	private Integer book_id;
	private String book_status;
	private String book_name;
	private String author_name;
	private Integer Publication_year;
}
