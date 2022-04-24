package org.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sp.model.MemberDTO;
import org.sp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memRegist")
	public String memRegist() {
		return "/member/memRegist";
	}
	
	@PostMapping("/memRegist")
	public String memRegProcess(MemberDTO dto) {
		
		memberService.memInsert(dto);
		
		return "redirect:/";
	}
	
	@GetMapping("/memList")
	public String memList(Model model) {
		
		List<MemberDTO> list = memberService.memList();
		model.addAttribute("list", list);
		
		return "/member/memList";
	}
	
	@GetMapping("/memUpdate")
	public String memUpdate(@RequestParam("m_no") String m_no, Model model) {
		MemberDTO dto = memberService.memOne(m_no);
		model.addAttribute("dto",dto);
		
		return "/member/memUpdate";
	}
	
	@PostMapping("/memUpdate")
	public String memUpdateProcess(MemberDTO dto) {
		System.out.println(dto.toString());
		memberService.memUpdate(dto);
		
		return "redirect:/memList";
	}

	@GetMapping("/memDelete")
	public String memDelete(@RequestParam("m_no") String m_no) {
		
		memberService.memDelete(m_no);
		
		return "redirect:/memList";
	}
	
	@PostMapping("/login")
	public String login(MemberDTO dto, HttpServletRequest request, Model model, RedirectAttributes rttr) {
		String result = memberService.login(dto);
		
		if(result.equals("Success")) {
			HttpSession session = request.getSession();
			session.setAttribute("m_id", dto.getM_id());
			return "redirect:/";
		}else {
			rttr.addFlashAttribute("msg", false);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}

}
