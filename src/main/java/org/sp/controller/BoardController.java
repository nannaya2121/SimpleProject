package org.sp.controller;

import java.util.List;

import org.sp.model.BoardDTO;
import org.sp.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		
		List<BoardDTO> list = boardService.boardList();
		model.addAttribute("list", list);
		
		
		return "board/boardList";
	}
	
	
	@GetMapping("/boardRegist")
	public String boardRegist() {
		return "board/boardRegist";
	}
	
	@PostMapping("/boardRegist")
	public String boardRegistProcess(BoardDTO dto) {
		boardService.boardInsert(dto);
		
		return "redirect:/boardList";
	}
	
	@GetMapping("/boardRead")
	public String boardRead(@RequestParam("b_no") String b_no, Model model) {
		BoardDTO dto = boardService.boardRead(b_no);
		model.addAttribute("dto", dto);
		return "board/boardRead";
	}

}
