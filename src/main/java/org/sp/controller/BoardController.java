package org.sp.controller;

import java.util.List;

import org.sp.model.BoardDTO;
import org.sp.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
		System.out.println("1111");
		boardService.boardInsert(dto);
		
		return "redirect:/boardList";
	}

}
