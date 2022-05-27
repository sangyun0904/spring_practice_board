package com.spring.boardprac.board.dao;

import java.util.List;

import com.spring.boardprac.board.dto.BoardDto;

public interface BoardDao {
	
	public void insert(BoardDto boardDto);
	public List<BoardDto> selectAll();
	
}
