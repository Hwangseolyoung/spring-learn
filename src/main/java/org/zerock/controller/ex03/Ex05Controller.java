package org.zerock.controller.ex03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex05")
public class Ex05Controller {
	
	// /ex05/sub01?name=jin&age=11&address=seoul
	@RequestMapping("sub01")
	public void method01(HttpServletRequest request) {
		// 1. request parameter 수집/가공
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		Customer cus = new Customer();
		cus.setName(name);
		cus.setAge(age);
		cus.setAddress(address);
		
		
		System.out.println(cus);
		
		// 2. business logic 실행
		// dao.insert(cus);
		
		// 3. add attribute
		// 4. forward / redirect
	}
	
	// 전달하는 데이터가 객체타입이고 여러 개를 처리해야야 한다면
	// java benes를 만들어 사용할 수 있다.(model attribute로 간주됨) 
	// Customer의 필드를 쿼리스트링으로 작성해서 날려주면 된다. 
	@RequestMapping("sub02")
	public void method02(Customer cus) {
		System.out.println(cus);
	}
	
	// @ModelAttribute : 없으면 자동 생성됨(생략 가능), request parameters의 value에 덮어써진다.
	// 					 동일한 java benes 필드명 덮어써지고 value가 담기게 된다.
	@RequestMapping("sub03")
	public void method03(@ModelAttribute Customer cus) {
		System.out.println(cus);
	}
	
	// /ex05/sub04?cpu=intel&hdd=1024&model=apple
	@RequestMapping("sub04")
	public void method04(Computer com) {
		System.out.println(com); // Computer(cpu=intel, hdd=1024, model=apple)
	}
	
	// /ex05/sub05?name=donald&salary=1000&email=emp@gmail.com
	@RequestMapping("sub05")
	public void method06(Employee emp) {
		System.out.println(emp); // Employee(name=donald, salary=1000, email=emp@gmail.com)
	}
}
