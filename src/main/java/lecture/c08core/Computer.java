package lecture.c08core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
public class Computer {
	
	// @Setter만 붙이면 bean만 만들어진 상태이다. 주입x
	// onMethod : setMemory에 @Autowired에 어노테이션을 추가하도록함
	// @Setter(onMethod_= @Autowired) : setMethod 만들고 @Autowired 자동주입됨
	@Setter(onMethod_= @Autowired)
	private Memory memory;
	
/* @Setter(onMethod_= @Autowired) 사용으로 작성하지 않아도됨
 * @Autowired public void setMemory(Memory memory) { this.memory = memory; }
 */
}
