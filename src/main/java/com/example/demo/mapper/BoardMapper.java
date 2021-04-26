package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Board;

@Mapper
public interface BoardMapper {
	
	public Board getBoard();
	
	//글보기-메인
	public ArrayList<Board> selectAllContent();
	
	//글쓰기 
	public void writeCotent(Board board);
	
	//글삭제
	public void deleteContent(int no);
	
	//글수정
	public void updateContent(Board board);
	//글조회수
}
