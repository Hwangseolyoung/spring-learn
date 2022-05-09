package org.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

// @Controller : @Controller는 @Component이다.
//               안쪽 메소드, 객체를 모두 spring bean으로 만든다.
@Controller
public class Ex01Controller {
	
	// @RequestMapping : 특정 경로로 요청이 왔을때
	//                   특정 메소드에게 일을 시킬 수 있다.(경로 넣어주기)
	@RequestMapping("/ex01/sub01")
	public void method01() {
		System.out.println("메소드01 일함");
		
	}
	
	@RequestMapping("/ex01/sub02")
	public void method02() {
		System.out.println("메소드02 일함");
	}

}
