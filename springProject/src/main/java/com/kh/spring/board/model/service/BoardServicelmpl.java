package com.kh.spring.board.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.spring.board.model.repository.BoardRepository;
import com.kh.spring.board.model.vo.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServicelmpl implements BoardService{
	
	private final BoardRepository boardRepository;
	private final SqlSessionTemplate sqlSession;
	
	@Override
	public int boardCount() {
		return boardRepository.boardCount(sqlSession);
	}

	@Override
	public List<Board> findAll(Map<String, Integer> map) {
		
		return boardRepository.findAll(sqlSession, map);
	}

	@Override
	public int searchCount(Map<String, String> map) {
		return boardRepository.searchCount(sqlSession, map);
	}

	@Override
	public List<Board> findByConditionAndKetword(Map<String, String>map, RowBounds rowBounds) {
		return boardRepository.findByConditionAndKetword(sqlSession, map, rowBounds);
	}

	@Override
	public int insert(Board board) {
		return boardRepository.insert(sqlSession, board);
	}

	@Override
	public int increadeCount(int boardNo) {
		return boardRepository.increadeCount(sqlSession);
	}

	@Override
	public Board findbyId(int boardNo) {
		return null;
	}

	@Override
	public int delete(int boardNo) {
		return 0;
	}

	
	
}
