package org.zerock.controller.ex04;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Customer;

@Controller
@RequestMapping("ex07")
public class Ex07Controller {
	
	// return을 redirect 할 수 있다.
	// 일회성으로 데이터를 전달하는 용도로 사용한다. 
	// Servlet에서 response.sendRedirect()와 동일한 용도로 사용
	// prefix를 붙여주면 된다. redirect:리다이렉트 위치 작성
	// redirection 위치로 이동하고 주소가 변경됨 
	@RequestMapping("sub01")
	public String method01() {
		// 1. request parameter 수집/가공
		// 2. business logic 실행
		// 3. add attribute
		// 4. forward / redirect
		
		return "redirect:http://www.naver.com";
	}
	
	// /ex07/sub02로 요청을 보내고
	// /ex06/sub01로 redirection
	@RequestMapping("sub02")
	public String method02(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// /ex07/sub02
		// /ex06/sub01로 redirection
		
		String location = request.getContextPath() + "/ex06/sub01";
		response.sendRedirect(location);
		
		return null;
	}
	
	// /ex07/sub02로 요청을 보내고
	// /ex06/sub01로 redirection
	@RequestMapping("sub03")
	public String method02() {
			
		return "redirect:/ex06/sub01";
	}
	
	@RequestMapping("sub04")
	public String method03() {
		
		// /ex06/sub05로 리디렉션하는 코드 작성
		return "redirect:/ex06/sub05";
	}
}
