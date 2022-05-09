package org.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Ex03Controller {
	
	@RequestMapping("sub01")
	public void method01() {
		System.out.println("/ex03/sub01 일함");
	}
	
	// params : 리퀘스트에 파라미터가 있으면 매핑됨(좁은범위 설정가능)
	//          query string에 name만 있고 value가 없어도 이동함
	@RequestMapping(value = "sub01", params = "name")
	public void method02() {
		System.out.println("/ex03/sub01 경로, name 파라미터 있음");
	}
	
	// query string에 name, age만 있고 value가 없어도 이동함
	@RequestMapping(value = "sub01", params = {"name", "age"})
	public void method03() {
		System.out.println("같은 경로, name, age 파라미터 있음");
	}
} 
