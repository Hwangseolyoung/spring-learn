package org.zerock.mapper.ex03;

import java.util.List;

import org.zerock.domain.ex02.BoardDto;

public interface Ex03Mapper {
	// mapper interface와 동일한 이름의 xml파일을 만들어준다.
	// 쿼리는 xml에 작성한다.
	String selectCustomerNameById(int id);
	
	String selectEmployeeFirstNameById(int id);

	List<BoardDto> selectBoard();
	
	BoardDto getBoard(int id);

	int updateBoard(BoardDto board);

	int deleteBoard(int id);

	int insertBoard(BoardDto board);


}
