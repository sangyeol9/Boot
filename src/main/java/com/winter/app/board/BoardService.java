package com.winter.app.board;

import java.util.List;

import com.winter.app.util.Pager;

public interface BoardService {
	
	public List<BoardVO> getList(Pager pager)throws Exception;					
	
	public int add(BoardVO boardVO) throws Exception;
	
}
