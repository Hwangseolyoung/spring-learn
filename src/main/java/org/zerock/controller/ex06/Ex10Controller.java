package org.zerock.controller.ex06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.controller.ex03.Customer;

@Controller
@RequestMapping("ex10")
public class Ex10Controller {
	
	// Redirect
	// Model은 request에 붙는데 redirect시에는 사용할 수 없다.
	// 객체를 request(Model)에 담을 수 없기 때문에 쿼리스트링에 담아 전달한다. 
	// 값을 전달할 때 RedirectAttributes를 사용한다.
	
	// RedirectAttributes : Model처럼 사용하는데 redirect때 사용한다.
	// 						일회성으로 데이터를 전달하는 용도로 사용한다.
	// Servlet에서 사용한 response.sendRedirect()와 동일한 용도로 사용됨
	// addAttribute를 이용해서 값을 넣어주면된다.
	// addAttribute에 담아준 값이 쿼리스트링에 보여준다.
	@RequestMapping("sub01")
	public String method01(RedirectAttributes rttr) {
		System.out.println("/ex10/sub01 경로에서 일함...");
		rttr.addAttribute("address", "seoul");
		// http://localhost:8080/controller/ex10/sub02?address=seoul
		
		return "redirect:/ex10/sub02";
	}
	
	@RequestMapping("sub02")
	public void method02() {
		System.out.println("/ex10/sub02 경로에서 일함!!!");
	}
	
	@RequestMapping("sub03")
	public String method03(RedirectAttributes rttr) {
		rttr.addAttribute("name", "sunja");
		rttr.addAttribute("age", 99);
		rttr.addAttribute("address", "seoul");
		
		return "redirect:/ex10/sub04";
	}
	
	@RequestMapping("sub04")
	public void method04() {
		
	}
	
	// 쿼리스트링은 String으로만 담을 수 있기 때문에 객체를 전달 할 수 없다.
	// 리퀘스트 보다 좀더 넓은 영역인 세션영역에 담아 객체를 전달 할 수 있다. 
	// addFlashAttribute 메소드를 사용해서 값을 담아준다.
	
	// addFlashAttribute : 화면에 한번만 사용하고 
	// 다음에는 사용되지 않는 데이터를 전달하기 위해 사용 (임시로 저장되고 전달 후 바로 지워짐)
	@RequestMapping("sub05")
	public String method053(RedirectAttributes rttr) {
		Customer c = new Customer();
		
		c.setAddress("ny");
		c.setAge(80);
		c.setName("captain");
		
		rttr.addFlashAttribute("customer", c);
		
		return "redirect:/ex10/sub06";
	}
	
	// redirect 후 request의 model에 담아 출력할 수 있다. 
	@RequestMapping("sub06")
	public void method06(Model model) {
		System.out.println(model.asMap().get("customer"));
	}
}
