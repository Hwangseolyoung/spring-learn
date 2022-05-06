package lecture.c04core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// xml파일의 위치 작성하기
		String path = "lecture/c04core/context.xml";
		
		// xml은 빈과 빈사이에 의존관계를 처리하는 방식중 하나이다.
		// ApplicationContext : bean(객체)를 만들고 관리함. 핵심 인터페이스이다.
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		
		// bean을 만들고 일하면 log에 기록이 남는다.
		System.out.println(s);
		System.out.println(d);
		
		
		
	}

}
