package com.example.demo.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.example.demo.model.Board;
import com.example.demo.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	//게시판 메인화면
	@RequestMapping("/board")
	public ModelAndView getBoardList(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardService.getBoardList());
		mav.setViewName("view/board");
		return mav;
	}
	
	//글쓰기
	@GetMapping(value="/board_write")
	//@RequestMapping(value="/board_write", method=RequestMethod.GET) 위와 동일
	public ModelAndView writeBoard() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("view/board_write");
		return mav;
	}

	//글쓰기 process
	@PostMapping(value="/board_write_process")
	//@RequestMapping(value="/board_write_process", method=RequestMethod.POST)
	public ModelAndView writeBoardProcess(Board param) {
		ModelAndView mav = new ModelAndView();
		boardService.writeBoard(param);
		System.out.println(param);
		mav.setViewName("redirect:/board/board");
		return mav;
	}
	
//	//글삭제
//	@RequestMapping(value="/board_write", method=RequestMethod.GET)
//	public ModelAndView deleteBoard(int content_no) {
//		ModelAndView mav = new ModelAndView();
//		boardService.deleteBoard(content_no);
//		mav.setViewName("redirect:/view/board");
//		return mav;
//	}
//	
	
}
