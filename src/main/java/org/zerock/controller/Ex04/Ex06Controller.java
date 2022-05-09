package org.zerock.controller.Ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Ex06Controller {
	
	// Return value
	// Return Type String : 
	// 상황에 따라 다른 화면을 보여줄 필요가 있을 경우에 사용함
	// 일반적으로 String 타입은 JSP파일의 이름을 의미한다.
	// ViewResolver에 설정된 prefix와 suffix가 앞뒤로 붙어서 
	// full view name 경로로 jsp 파일 찾아서 forward한다.
	@RequestMapping("sub01") 
	public String method01() {
		
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		
		//full view name : /WEB-INF/views/myView01.jsp
		
		return "myView01"; 
	}
	
	@RequestMapping("sub02")
	public String method02() {
		
		return "myView02";
	}
	
	@RequestMapping("sub03")
	public String method03() {
		
		// prefix : /WEB-INF/views/
		// suffix : .jsp
				
		//full view name : /WEB-INF/views/ex06/myView03.jsp
		
		return "ex06/myView03";
	}
	
	// 요청 경로와 view(jsp)의 경로가 같은 경우
	// null로 리턴 가능
	@RequestMapping("sub04")
	public String method04() {
		
		// 요청경로 : /ex06/sub04
		// view name : /WEB-INF/views/ex06/sub04.jsp
		
		return null;
	}
	
	// 요청 경로와 view(jsp)의 경로가 같은 경우
	// void로 리턴 타입 작성 가능
	@RequestMapping("sub05")
	public void method05() {
			
		// 요청경로 : /ex06/sub05
		// view name : /WEB-INF/views/ex06/sub05.jsp
		
	}
}
