package org.zerock.controller.ex02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex04")
public class Ex04Controller {
	
	@RequestMapping("sub01")
	// HttpServletRequest request : 리퀘스트 파라미터를 꺼낼때 명시하고 사용하면됨
	public void method01(HttpServletRequest request) {
		System.out.println("/ex04/sub01 요청");
		// 1. request parameter 수집/가공
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("age"));
		// 2. business logic 실행
		// 3. add attribute
		// 4. forward / redirect
		
	}
	
	// @RequestParam : 파라미터 앞에 명시해주고 (리퀘스트 파라미터 이름 작성)
	// name 파라미터의 값을 String n에 넣어준다.
	// name의 값을 입력하지 않으면 잘못된 요청으로 응답함(값 필수)
	@RequestMapping("sub02")
	public void method02(@RequestParam("name") String n) {
		System.out.println(n);
		
	}
	
	// 여러개 사용가능함
	@RequestMapping("sub03")
	public void method03(@RequestParam("name") String n, @RequestParam("age") String a) {
		System.out.println(n);
		System.out.println(a);
		int age = Integer.parseInt(a);
		
	}
	
	@RequestMapping("sub04")
	public void method04(@RequestParam("age") int age) {
		System.out.println(age);
	}
	
	@RequestMapping("sub05")
	public void method05(HttpServletRequest request) {
		// 1. request parameter 수집/가공
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		
		int age = Integer.parseInt(ageStr);
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	// @RequestParam : 같은 이름 시용시 리퀘스트 파라미터명 생략가능
	@RequestMapping("sub06")
	public void method06(@RequestParam String name, @RequestParam int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	// @RequestParam : 어노테이션 생략가능
	@RequestMapping("sub07")
	public void method07(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	// /ex04/sub08?address=seoul&number=300
	@RequestMapping("sub08")
	public void method08(String address, int number) {
		System.out.println(address);
		System.out.println(number);
	}
	
	// /ex04/sub09?password=1q2w3e&number=10000
	@RequestMapping("sub09")
	public void method09(@RequestParam("password") String pw, @RequestParam("number") int num) {
		System.out.println(pw);
		System.out.println(num);
	}
	
	// 쿼리스트링을 작성하지 않으면 메소드도 일하지 않는다.
	// 쿼리스트링이 있을수도 있고 없을수도 있다면 value와 required = false로 작성한다.
	// required는 true가 기본값이다. 
	@RequestMapping("sub10")
	public void method10(@RequestParam(value = "name", required = false) String name) {
		System.out.println(name);
	}
	
	// 동일한 이름의 파라미터가 여러 개 전달되는 경우
	// 배열과 리스트로 값을 받을 수 있다.
	// 스프링은 파라미터의 타입을 보고 객체를 생성하므로
	// 인터페이스 타입이 아닌 실제적인 클래스 타입으로 지정한다. 
	
	// 배열 : 배열의 toString 메소드를 이용하여 출력할 수 있다. 
	@RequestMapping("sub11")
	public void method11(HttpServletRequest request) {
		String[] foods = request.getParameterValues("food");
		System.out.println(Arrays.toString(foods));
	}
	
	@RequestMapping("sub12")
	public void method12(@RequestParam("food") String[] foods) {
		System.out.println(Arrays.toString(foods));
	}
	
	// 배열은 @RequestParam() 생략가능함
	@RequestMapping("sub13")
	public void method13(String[] food) {
		System.out.println(Arrays.toString(food));
	}
	
	// ArrayList 사용
	// @RequestParam()를 생략하고 작성할 수 없다.
	@RequestMapping("sub14")
	public void method14(@RequestParam("food") ArrayList<String> food) {
		System.out.println(food);
	}
	
	
}
