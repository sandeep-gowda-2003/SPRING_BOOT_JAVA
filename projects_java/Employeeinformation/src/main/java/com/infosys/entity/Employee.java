package com.infosys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/* ctrl+shift+o 
 * for making all dependent library auto import
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	private String firstname;
	private String lastname;
	private String email;
	
}
