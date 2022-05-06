package lecture.c03core;

public class Servlet1 {
	// 내가 직접 객체를 만들고 할당하는 것이 아니라
	// spring이 직접 control한다.
	// inversion of control : 제어의 역전 IOC
	private Dao1 dao; // dependency, 필드로 생각하면됨
	
	public void doGet() {
		// request 파라미터 수집/가공
		// 비지니스 로직 처리
		dao.select(); // 의존성 주입
		// 결과세팅
		// forward / redirect
	}

}
