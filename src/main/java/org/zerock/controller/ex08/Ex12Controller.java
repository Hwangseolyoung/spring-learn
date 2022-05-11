package org.zerock.controller.ex08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Employee;
import org.zerock.service.ex01.Ex01Service;
import org.zerock.service.ex01.Ex02Service;

import lombok.Setter;

@Controller
@Repository("ex12")
public class Ex12Controller {
	// 의존성 주입 방법(스프링빈 주입) 3가지 : 생성자, 필드, 메소드 주입
	
	// 의존성 주입받는 필드 명시하기
	@Autowired
	private Ex01Service service;
	
	
//	@Setter(Method_ = @Autowired) : 책
	@Autowired
	private Ex02Service service2;
	
	@RequestMapping("sub01")
	public void method01() {
		// 1. request parameter 수집/ 가공
		
		// 2. bussiness 로직 실행
		service.getCustomer(1);
		
		// 3. model에 attribute 추가
		
		// 4. forward / redirect
		
	}
	
	
	@RequestMapping("sub02") 
	public void method02(Employee e) {
		service2.insertEmployee(e);
		
		System.out.println("입력 성공..");
	}
}
