package com.spring.boardprac.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boardprac.board.dto.BoardDto;
import com.spring.boardprac.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.GET)
	public ModelAndView boardWrite() {
		
		return new ModelAndView("/board/bWrite");
	}
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.POST)
	public ModelAndView boardWrite(BoardDto boardDto) {
		
		boardService.insertBoard(boardDto);
		
		return new ModelAndView("/board/bWrite");
	}
	
	@RequestMapping(value="/boardList" , method=RequestMethod.GET)
	public ModelAndView boardList() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/bList");
		mv.addObject("boardList", boardService.getAllBoard());
		
		return mv;
	}
	
}