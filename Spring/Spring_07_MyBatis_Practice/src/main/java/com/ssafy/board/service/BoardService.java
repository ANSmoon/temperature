package com.ssafy.board.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	// 게시글 전체 조회
	public List<Board> getBoardList();

	// 게시글 상세조회
	public Board readBoard(int id);

	// 게시글 작성
	public void writeBoard(Board board);

	// 게시글 삭제
	public void deleteBoard(int id);

	// 게시글 수정
	public void modifyBoard(Board board);
}