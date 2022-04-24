package org.sp.service;

import java.util.List;

import org.sp.model.MemberDTO;

public interface MemberService {
	
	public void memInsert(MemberDTO dto);

	public List<MemberDTO> memList();

	public MemberDTO memOne(String m_no);

	public void memDelete(String m_no);

	public void memUpdate(MemberDTO dto);
	
	public String login(MemberDTO dto);


}
