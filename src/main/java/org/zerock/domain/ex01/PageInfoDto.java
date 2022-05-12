package org.zerock.domain.ex01;

public class PageInfoDto {
	// 현재, 마지막 페이지
	// 양옆에 3개씩 보여주고 jsp에 정보제공
	
	// 현재 페이지
	private int current;
	// 가장왼쪽에 표시되는 페이지
	private int left;
	// 가장 오른쪽에 표시되는 페이지
	private int right;
	// 마지막 페이지
	private int end;
	
	public void setCurrent(int current) {
		this.current = current;
	}
	
	public int getCurrent() {
		return current;
	}
	
	public int getLeft() {
		return Math.max(current - 3, 1);
	}
	
	public int getRight() {
		return Math.min(current + 3, end);
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getEnd() {
		return end;
	}
}
