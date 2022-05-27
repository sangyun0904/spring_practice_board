package com.spring.boardprac.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boardprac.board.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(BoardDto boardDto) {
		sqlSession.insert("boardMapperPrac.insertBoard", boardDto);
	}

	@Override
	public List<BoardDto> selectAll() {
		return sqlSession.selectList("boardMapperPrac.selectAll");
	}
	
}
