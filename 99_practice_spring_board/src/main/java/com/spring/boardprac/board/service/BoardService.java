package com.spring.boardprac.board.service;

import java.util.List;

import com.spring.boardprac.board.dto.BoardDto;

public interface BoardService {
	
	public void insertBoard(BoardDto boardDto);
	public List<BoardDto> getAllBoard();
	public BoardDto getOneBoard(int num);
	
}
