package org.sp.controller;

import org.sp.model.ReplyDTO;
import org.sp.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	@PostMapping("/replyRegist")
	@ResponseBody
	public String replyRegist(ReplyDTO dto) {
		System.out.println("타니?");
		int result = replyService.replyInsert(dto);
		if(result == 1) {
			return "Success";
		}else {
			return "Fail";
		}
	}
}
