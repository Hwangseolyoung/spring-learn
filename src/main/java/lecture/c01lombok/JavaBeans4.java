package lecture.c01lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @AllArgsConstructor : 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자 만들기
// @NoArgsConstructor : 인스턴스 변수로 선언된 모든 것을 파라미터 없는 생성자 만들기
@AllArgsConstructor
@Data
@NoArgsConstructor
public class JavaBeans4 {
	private String name;
	private int age;
	
}
