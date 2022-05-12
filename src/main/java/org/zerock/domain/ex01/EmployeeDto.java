package org.zerock.domain.ex01;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class EmployeeDto {
	
	private int id;
	private String lastName;
	private String firstName;
	
	// input type="date" 
//	@DateTimeFormat(pattern = "yyyy-MM-dd") // 책 135
	@DateTimeFormat(iso = ISO.DATE) // 국제표준 날짜 형식
	private LocalDate birthDate;
	private String Photo;
	private String Notes;
	
}
