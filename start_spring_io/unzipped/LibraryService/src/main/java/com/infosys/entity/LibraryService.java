package com.infosys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="project")
public class LibraryService {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer library_id;
	@NotNull(message = "library name cannot be null")
	private String library_name;
	@NotNull(message="library city cannot be null")
	private String library_city;
	@NotNull(message="book id cannot be null")
	private Integer book_id;
	@NotNull(message="book status cannot be null")
	private String book_status;
}
