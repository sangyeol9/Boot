package com.winter.app.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {

	public List<BoardVO> getList()throws Exception;					
	
	public int add(BoardVO boardVO) throws Exception;
	
}