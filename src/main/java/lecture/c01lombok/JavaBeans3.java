package lecture.c01lombok;

import lombok.Data;

// @Data : set method를 생성하는 기능과 생성자, toString, hashCodem equals를 한꺼번에 만들어줌
@Data
public class JavaBeans3 {
	private String address;
	private int employeeId;
}
