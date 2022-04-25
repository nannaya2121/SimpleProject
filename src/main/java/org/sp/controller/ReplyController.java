package org.sp.controller;

import java.util.List;

import org.sp.model.ReplyDTO;
import org.sp.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	@PostMapping("/replyRegist")
	@ResponseBody
	public String replyRegist(ReplyDTO dto) {
		int result = replyService.replyInsert(dto);
		if(result == 1) {
			return "Success";
		}else {
			return "Fail";
		}
	}
	
	
	//Ajax return 값으로 List 형태로는 보낼 수 없음. 
	//pom.xml 에 jackson-core 와 jackson-databind를 넣어주면 해결 됨.
	@PostMapping("/replyList")
	@ResponseBody
	public List<ReplyDTO> replyLisy(@RequestParam("r_boardNum") String r_boardNum) {
		List<ReplyDTO> list = replyService.replyList(r_boardNum);
		System.out.println(list.toString());
		return list;
	}
	
	@PostMapping("/replyDelete")
	@ResponseBody
	public String replyDelete(@RequestParam("r_no") String r_no) {
		System.out.println("타니?");
		replyService.replyDelete(r_no);
		return "Success";
	}
}
