package lecture.c08core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

// @Component : 해당 클래스가 스프링에서 객체로 만들어서 
//              관리하는 대상임을 명시하는 어노테이션 
// classpath scanning 해서 spring bean이 된다. 
@Component
public class Car {
	@Setter
	private Engine engine;
	
	// @Autowired : 해당 인스턴스 변수가 스프링으로부터 자동 주입되는 어노테이션,
	//             스프링 내부에서 자신이 특정한 객체에 의존적이므로 
	//             자신에게 해당 타입의 빈을 주입해주라는 표시이다.
	// @Autowired를 붙여주지 않으면 주입되지 않아 nullpointerexception 발생함
	@Autowired
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public void go() {
		engine.action();
	}

}
