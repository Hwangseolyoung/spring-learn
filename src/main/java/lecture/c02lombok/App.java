package lecture.c02lombok;

import lombok.extern.log4j.Log4j;

// @Log4j : Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성
@Log4j
public class App {
	public static void main(String[] args) {
		
		System.out.println("어떤 메세지 출력...");
		log.debug("디버그용 메세지 출력...."); // 개발중 사용
		log.info("인포용 메세지 출력...");
		// warn : 설정 기본단계 
		log.warn("워닝용 메세지 출력..."); 
		log.error("에러용 메세지 출력..."); // 운영중 사용
		log.fatal("치명적 에러용 메세지 출력...");
	}

}
