package org.zerock.controller.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex08")
public class Ex08Controller {
	
	@RequestMapping("sub01")
	public String method01(HttpServletRequest req) {
		// Model과 유사한 역할을 한다.
		req.setAttribute("address", "new york");
		
		// 리턴타입 String에는 prefix, prefix
		// prefix : /WEB-INF/views/
		// prefix : .jsp
				
		//full view name : /WEB-INF/views/ex08/sub01.jsp
		
		return "ex08/sub01";
	}
	
	@RequestMapping("sub02")
	public String method02(Model model) {
		// Model 객체는 JSP에 컨트롤러에서 생성된 데이터를 담아서
		// 전달하는 역할을 하는 존재이다.
		// JSP와 같은 View로 전달해야하는 데이터를 담아서 보낼 수 있다.
		// Model은 Dispatcher-Servlet이 제공하는 객체이므로 파라미터에 명시해줘야한다.
		// addAttribute(String, Object) : (attributeName, attributeValue)
		model.addAttribute("address", "london");
		
		return "ex08/sub01";
	}
	
	@RequestMapping("sub03")
	public String method03(Model model) {
		
		model.addAttribute("myName", "sugar");
		model.addAttribute("myAge", 25);
		
		return "ex08/sub03";
	}
	
	// void 요청경로 : /ex08/sub04
	@RequestMapping("sub04")
	public void method04(Model model) {
		model.addAttribute("foods", new String[] {"apple", "milk", "coffee"});
	}
	
	@RequestMapping("sub05")
	public void method05(Model model) {
		List<String> list = new ArrayList<>();
		list.add("iron man");
		list.add("thor");
		list.add("hulk");
		
		model.addAttribute("heroList", list);
	}
	
	@RequestMapping("sub06")
	public void method06(Model model) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("name", "jin");
		map.put("song", "butter");
		map.put("group", "bts");
		
		model.addAttribute("desc", map);
	}
	
	@RequestMapping("sub07")
	public void method07(Model model)  {
		
		Customer cus = new Customer();
		cus.setAddress("seoul");
		cus.setName("donald");
		cus.setAge(30);
		
		model.addAttribute("customer", cus);
	}
	
	@RequestMapping("sub08")
	public void method08(Model model)  {
		
		// jsp와 메소드를 완성해서 위에 세팅한 email, name, salary 출력되도록 하세요.
		Employee emp = new Employee();
		// email, name, salary 세팅
		emp.setName("park");
		emp.setEmail("emp.gmail.com");
		emp.setSalary(30000);
		
		model.addAttribute("employee", emp);
	}
	
	@RequestMapping("sub09")
	public String method09(Model model) {
		
		Employee emp = new Employee();
	
		emp.setName("kim");
		emp.setEmail("korea.gmail.com");
		emp.setSalary(50000);
		
		// addAttribute(attributeValue) : attributeValue만 받는다.
		// attributeName이 클래스의 이름으로 결정(단, lowerCarmelCase 형식)
		model.addAttribute(emp); 
	// model.addAttribute("employee", emp); 위 작성법과 동일하다.
		
		return "ex08/sub08";
	}
	
	@RequestMapping("sub10")
	public String method10(Model model) {
		Customer cus = new Customer();
		
		cus.setName("mija");
		cus.setAge(50);
		cus.setAddress("Busan");
		
		model.addAttribute(cus);
		
		return "ex08/sub07";
	}
	
	@RequestMapping("sub11")
	public void method11(Model model) {
		List<String> list = new ArrayList<>();
		
		list.add("wanda");
		list.add("doctor");
		list.add("wong");
		
		model.addAttribute("list", list);
	}
	
	@RequestMapping("sub12")
	public void method12() {
		// 1. request 파라미터 수집/가공
		// 2. bussiness 로직처리
		// 3. add attribute
		// 4. forward / redirect
	}
}
