package lecture.c06core;

import lombok.Setter;

public class Computer {
	
	// @Setter : Setter method 생성해주는 어노테이션
	@Setter
	private Memory memory;
	
	public void calc() {
		memory.read();
	}

}
