package org.sp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.sp.model.BoardDTO;
import org.sp.model.ReplyDTO;

@Mapper
public interface ReplyMapper {

	public void boardInsert(BoardDTO dto);

	public List<BoardDTO> boardList();

	public BoardDTO boardRead(String b_no);

	public int replyInsert(ReplyDTO dto);

	public List<ReplyDTO> replyList();

}
