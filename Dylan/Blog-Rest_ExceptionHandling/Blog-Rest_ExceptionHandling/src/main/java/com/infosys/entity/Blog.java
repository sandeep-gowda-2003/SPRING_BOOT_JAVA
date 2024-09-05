package com.infosys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="blog")
public class Blog {

	@Id
	@NotNull(message = "blogid is not null")
	private Integer blogid;
	@NotNull(message = "blogtitle is not null")
	private String blogtitle;
	@NotNull(message = "blogcreator is not null")
	private String blogcreator;
	@NotNull(message = "yearofpost is not null")
	@Min(value = 1980,message = " L'internet ne existe pas")
	private Integer yearofpost;
}
