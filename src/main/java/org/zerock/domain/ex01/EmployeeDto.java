package org.zerock.domain.ex01;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDto {
	
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	private String Photo;
	private String Notes;
	
}
