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

	@Override
	public BoardDto selectBoard(int num) {
		return sqlSession.selectOne("boardMapperPrac.selectBoard" , num);
	}

	@Override
	public void updateReadCount(int num) {
		sqlSession.update("boardMapperPrac.updateReadCount" , num);
	}


	@Override
	public BoardDto validateBoard(BoardDto boardDto) {
		return sqlSession.selectOne("boardMapper.validateUserCheck" , boardDto);
	}
	
	@Override
	public void deleteBoard(int num) {
		sqlSession.delete("boardMapperPrac.deleteBoard", num);
		
	}
}
