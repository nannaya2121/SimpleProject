package org.sp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sp.model.MemberDTO;

@Mapper
public interface MemberMapper {
	
	public void memInsert(MemberDTO dto);
	public List<MemberDTO> memList();
	public MemberDTO memOne(String m_no);
	public void memDelete(String m_no);
	public void memUpdate(MemberDTO dto);
	public MemberDTO login(MemberDTO dto);
	public String findByPW(String m_id);

}
