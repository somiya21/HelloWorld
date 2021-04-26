package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BoardMapper;
import com.example.demo.model.Board;

@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	public Board getBoard() {
		return boardMapper.getBoard();
	}
	
	//메인화면 글목록
	public ArrayList<Board> getBoardList(){
		return boardMapper.selectAllContent();
	}
	
	//글쓰기
	public void writeBoard(Board board) {
		
		boardMapper.writeCotent(board);
		
		System.out.println("board :"+board);
	}

	//글삭제
	public void deleteBoard(int content_no) {
		boardMapper.deleteContent(content_no);
	}
	
	//글수정
}
