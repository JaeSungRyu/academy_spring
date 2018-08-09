package com.mis.web;

import javax.inject.Inject;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
//	@Test
//	public void testTime() throws Exception{
//		
//		System.out.println(dao.getTime());
//		
//	}
	
//	@Test
//	public void testInsertMember() throws Exception{
//		
//		MemberVO vo = new MemberVO();
//		vo.setUserid("user02");
//		vo.setUserpw("user00");
//		vo.setUsername("USER00");
//		vo.setEmail("user00@aaa.com");
//		
//		dao.insertMember(vo);
//		
//	}
	
	
//	@Test
//	public void testSelectOne() throws Exception{
//		System.out.println(dao.readMember("user00"));
//		
//	}
//	@Test
//	public void testSelectPwMember() throws Exception{
//		System.out.println(dao.readWithPW("user00", "user00"));
//	}
//	
	@Test
	public void testUpdateMember() throws Exception{
		
		MemberVO vo  = new MemberVO();
		vo.setUserid("user02");
		vo.setUserpw("1234");
		vo.setUsername("À¯Àç¼º");
		vo.setEmail("yjs@aaa.com");
		
		dao.updateMember(vo);
	}
	@Test
	public void testDeleteMember() throws Exception{
		dao.deleteMember("user01", "user00");
		
	}
	
}
