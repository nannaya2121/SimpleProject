package org.sp.service;

import java.util.List;

import org.sp.model.BoardDTO;

public interface BoardService {

	public void boardInsert(BoardDTO dto);

	public List<BoardDTO> boardList();
	
	


}
