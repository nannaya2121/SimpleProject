package org.sp.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sp.model.MemberDTO;
import org.sp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {

	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private MemberService service;
	
	//@Test
	public void memInsertTest() {
		log.info("테스트 시작");
		MemberDTO dto = new MemberDTO();
		dto.setM_id("test2");
		dto.setM_pw("test2");
		mapper.memInsert(dto);
		log.info("테스트 성공");
	}
	
	//@Test
	public void memList(){
		log.info("memList() 시작");
		List<MemberDTO> list = mapper.memList();
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
	}
	
	//@Test
	public void memOne() {
		log.info("memList() 시작");
		MemberDTO dto = mapper.memOne("1");
		System.out.println(dto.toString());
		
	}
	
	//@Test
	public void checkPW() {
		String test = mapper.findByPW("test1");
		System.out.println(test);
	}
	
	
	@Test
	public void login() {
		MemberDTO dto = new MemberDTO();
		dto.setM_id("test1");
		dto.setM_pw("test1");
		String test = service.login(dto);
		System.out.println(test);
	}
	
	
}
