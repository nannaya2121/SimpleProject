package org.sp.service;

import java.util.List;

import org.sp.mapper.MemberMapper;
import org.sp.model.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private BCryptPasswordEncoder pwEncoder;

	@Override
	public void memInsert(MemberDTO dto) {
		dto.setM_pw(pwEncoder.encode(dto.getM_pw()));
		mapper.memInsert(dto);
	}

	@Override
	public List<MemberDTO> memList() {
		return mapper.memList();
	}

	@Override
	public MemberDTO memOne(String m_no) {
		return mapper.memOne(m_no);
	}

	@Override
	public void memDelete(String m_no) {
		mapper.memDelete(m_no);
	}

	@Override
	public void memUpdate(MemberDTO dto) {
		mapper.memUpdate(dto);
	}

	
	@Override
	public String login(MemberDTO dto) {
		
		String findPW = mapper.findByPW(dto.getM_id());
		
		System.out.println("1 : " + dto.getM_pw());
		System.out.println("2 : " + findPW);
		boolean test = pwEncoder.matches(dto.getM_pw(),findPW);
		
		if(test) {
			System.out.println("로그인 성공");
			return "Success";
		}else {
			System.out.println("로그인 실패");
			return "Fail";
		}
		
		
	}

	

	
	
	

}
