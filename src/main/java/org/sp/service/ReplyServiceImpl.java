package org.sp.service;

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
		System.out.println("in Impl");
		return mapper.replyInsert(dto);
	}

	
	
	

}
