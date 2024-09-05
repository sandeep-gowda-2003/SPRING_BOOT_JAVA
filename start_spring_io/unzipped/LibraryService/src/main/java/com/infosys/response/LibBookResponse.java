package com.infosys.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibBookResponse {
	private Integer library_id;
	private String library_name;
	private String library_city;
	private Integer book_id;
	private String book_status;
	private String book_name;
	private String author_name;
	private Integer Publication_year;
}
