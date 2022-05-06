package lecture.c01lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 클래스 위에 작성시 안에 필드 전체에 적용할 수 있다.
// 작성 순서는 상관 없다.
@Getter
@Setter
@ToString
public class JavaBeans2 {
	private String model;
	private int id;
	
	

}
