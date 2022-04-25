package org.sp.service;

import java.util.List;

import org.sp.mapper.ReplyMapper;
import org.sp.model.ReplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyMapper mapper;

	@Override
	public int replyInsert(ReplyDTO dto) {
		return mapper.replyInsert(dto);
	}

	@Override
	public List<ReplyDTO> replyList(String r_boardNum) {
		return mapper.replyList(r_boardNum);
	}

	
	
	

}
