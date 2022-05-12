package org.zerock.domain.ex02;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BoardDto {
	
	private int id;
	private String title;
	private String body;
	private LocalDate inserted;

}
