package lecture.c01lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class App {
	public static void main(String[] args) {
		
		// @Getter, @Setter 
		JavaBeans1 o1 = new JavaBeans1();
		
		o1.setAge(33);
		o1.setName("sunja");
		
		System.out.println(o1.getAge());
		System.out.println(o1.getName());
		
		System.out.println(o1.toString());
		
		// @Getter, @Setter, @ToString
		JavaBeans2 o2 = new JavaBeans2();
		
		o2.setId(3);
		o2.setModel("tesla");
		
		System.out.println(o2.getId());
		System.out.println(o2.getModel());
		
		System.out.println(o2.toString());
		
		// @Data 
		JavaBeans3 o3 = new JavaBeans3();
		
		o3.setAddress("Seoul");
		o3.setEmployeeId(1);
		
		System.out.println(o3);
		
		// @AllArgsConstructor 
		// 생성자 사용 
		JavaBeans4 o4 = new JavaBeans4("jimin", 99);
		
		System.out.println(o4);
		
		// 파라미터 없는 생성자 사용
		// 자동추가되지 않았는다.
		// @NoArgsConstructor 어노테이션 사용해서 만듬
		JavaBeans4 o5 = new JavaBeans4();
	}

}
