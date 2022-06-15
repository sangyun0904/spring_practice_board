package com.spring.boardprac.board.dao;

import java.util.List;

import com.spring.boardprac.board.dto.BoardDto;

public interface BoardDao {
	
	public void insert(BoardDto boardDto);
	public List<BoardDto> selectAll();
	public BoardDto selectBoard(int num);
	public void updateReadCount(int num);
	public BoardDto validateBoard(BoardDto boardDto);
	public void deleteBoard(int num);
	
}
