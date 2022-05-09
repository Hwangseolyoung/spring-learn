package org.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 공통된 경로 사용시 클래스 레벨로 사용할 수 있다.
// 슬래시(/) 생략 가능하다.
@RequestMapping("ex02")
public class Ex02Controller {
	
	@RequestMapping("sub01")
	public void method01() {
		System.out.println("/ex02/sub01 일함");
	}
	
	@RequestMapping("/sub02")
	public void method02() {
		System.out.println("/ex02/sub02 일함");
	}
	
	// value= 는 생략 가능하다.
	@RequestMapping(value= "sub03")
	public void method03() {
		System.out.println("/ex02/sub03 일함");
	}
	
	// value를 배열로 작성시 여러개 경로 작성가능
	@RequestMapping({"sub04", "sub05"})
	public void method04() {
		System.out.println("/ex02/sub04, /ex02/sub05 일함");
	}
	
	@RequestMapping({"sub06", "sub07"})
	public void method05() {
		System.out.println("/ex02/sub06, /ex02/sub07 일함");
	}
	
	// path : value와 동일하게 사용가능함
	@RequestMapping(path = "sub08")
	public void method06() {
		System.out.println("/ex02/sub08 일함!");
	}
	
	// path를 배열로 작성시 여러개 경로 작성가능
	@RequestMapping(path = {"sub09", "sub10"})
	public void method07() {
		System.out.println("/ex02/sub09 일함!, /ex02/sub10 일함!");
	}
}
