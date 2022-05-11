package org.zerock.mapper.ex01;

import org.apache.ibatis.annotations.Select;

public interface Ex01Mapper {
	
	// interface를 생성하면 mybatis가 동적 클래스(object, spring beans)를 만들어준다
	// 코드 작성 몸통 없이 만들기
	
	@Select("SELECT 100")
	public int selectNumber();

}
