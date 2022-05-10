package org.zerock.controller.ex05;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex09")
public class Ex09Controller {
	
	@RequestMapping("sub01")
	public void method01(String name, Model model) { // 파라미터로 받은 값을 model에 세팅함
		// 1. request 파라미터 수집/가공
		System.out.println(name);
		// 3. model에 attribute 추가
		model.addAttribute("name", name);
		// 4. view forward : ex09/sub01.jsp
	}
	
	// @ModelAttribute : 파라미터로 전달된 데이터를 다시 화면에서 사용해야 할 때 사용
	@RequestMapping("sub02")
	public String method02(@ModelAttribute("name") String name) {
		
		return "ex09/sub01";
	}
	
	// 여러 개의 값을 세팅할 때 중복사용 가능함
	// /ex09/sub03?address=seoul&email=seoul@gmail.com
	@RequestMapping("sub03")
	public void method03(@ModelAttribute("address") String address, 
				         @ModelAttribute("email") String email) {
			
	}
	
	// java beans 사용가능
	// java beans 규칙에 맞는 객체는 다시 화면으로 객체를 전달한다.
	// /ex09/sub04?name=trump&age=40&address=newyork
	@RequestMapping("sub04")
	public void method04(@ModelAttribute("customer") Customer cus) {
		
	}
	
	// @ModelAttribute : 이름을 생략가능하다.
	// 					 이름을 생략하면 클래스명이 이름이 된다.
	@RequestMapping("sub05")
	public String method05(@ModelAttribute Customer cus) {
		return "ex09/sub04";
	}
	
	// @ModelAttribute 도 생략가능하다.
	@RequestMapping("sub06")
	public String method06(Customer cus) {
		return "ex09/sub04";
	}
	
	// 요청경로 : /ex09/sub07
	// 쿼리스트링 : ?name=sunja&salary=50000&email=sunja@gmail.com
	
	// method07작성
	// org.zerock.controller.ex03.Customer 객체가
	// 쿼리스트링으로 넘어온 파라미터의 값들을 세팅해서
	// model에 "employee"라는 이름의 attribute로 추가되고
	// /ex09/sub07 뷰로 포워드되도록 jsp 작성하세요
	
	/* Spring MVC 사용전 방법
	public void method07(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String salaryStr = request.getParameter("salary");
		
		int salary = Integer.parseInt(salaryStr);
		
		Employee emp = new Employee();
		
		emp.setName(name);
		emp.setEmail(email);
		emp.setSalary(salary);
		
		request.setAttribute("Employee", emp);
		
		request.getRequestDispatcher("/WEB-INF/views/ex09/sub07.jsp");
	}
	*/
	
	@RequestMapping("sub07")
	public void method07(@ModelAttribute("employee") Employee employee) {
		
	}
}
