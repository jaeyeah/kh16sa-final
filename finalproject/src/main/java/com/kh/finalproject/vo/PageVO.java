package com.kh.finalproject.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PageVO {

	private int page = 1;
	private int size = 10;
	private int TotalCount;

	public int getBegin() {
		return page * size - (size-1);
	}
	public int getEnd() {
		return page * size;
	}

}
