package org.sp.service;

import java.util.List;

import org.sp.mapper.BoardMapper;
import org.sp.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public void boardInsert(BoardDTO dto) {
		mapper.boardInsert(dto);
	}

	@Override
	public List<BoardDTO> boardList() {
		
		List<BoardDTO> boardList = mapper.boardList();
		
		return boardList;
	}

	
	

}
