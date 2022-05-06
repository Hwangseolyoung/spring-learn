package lecture.c10core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Computer {
	
	@Autowired // set, 생성자가 없어도 자동 주입된다.
	private SSD ssd;
	

}
