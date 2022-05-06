package lecture.c07core;

import lombok.AllArgsConstructor;

// @AllArgsConstructor : 모든 필드 파라미터 있는 생성자 만들기
@AllArgsConstructor
public class Car {
	
	private Engine engine;
	
	/* @AllArgsConstructor로 대신함
	 * public Car(Engine engine) { this.engine = engine; }
	 */
	public void move() {
		engine.action();
	}

}
