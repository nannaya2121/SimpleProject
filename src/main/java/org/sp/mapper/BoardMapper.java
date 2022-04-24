package org.sp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.sp.model.BoardDTO;

@Mapper
public interface BoardMapper {

	public void boardInsert(BoardDTO dto);

	public List<BoardDTO> boardList();

}
