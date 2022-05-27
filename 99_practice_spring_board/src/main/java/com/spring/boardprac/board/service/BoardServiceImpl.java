package com.spring.boardprac.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boardprac.board.dao.BoardDao;
import com.spring.boardprac.board.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public void insertBoard(BoardDto boardDto) {
		boardDao.insert(boardDto);
	}

	@Override
	public List<BoardDto> getAllBoard() {
		return boardDao.selectAll();
	}

	@Override
	public BoardDto getOneBoard(int num) {
		return boardDao.selectBoard(num);
	}
	
}
