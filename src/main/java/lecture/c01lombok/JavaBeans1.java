package lecture.c01lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class JavaBeans1 {
	// lombok의 어노테이션, 키워드
	// get,set method를 직접만드는 것이 아니라
	// @Getter, @Setter, @ToString 어노테이션으로 만들 수 있다.
	
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int age;
	
	
	

}
