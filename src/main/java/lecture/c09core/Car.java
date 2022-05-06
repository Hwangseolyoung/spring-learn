package lecture.c09core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Wheel wheel;
	
	// 생성자가 하나밖에 없을때는 @Autowired 생략가능함(버전에 따라 다름)
	@Autowired
	public Car(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void go() {
		wheel.roll();
	}

}
