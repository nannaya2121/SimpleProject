package org.sp.service;

import java.util.List;

import org.sp.model.ReplyDTO;

public interface ReplyService {

	int replyInsert(ReplyDTO dto);

	List<ReplyDTO> replyList();


}
