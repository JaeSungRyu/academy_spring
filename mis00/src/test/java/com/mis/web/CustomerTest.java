	package com.mis.web;
	
	import javax.inject.Inject;
	
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.springframework.test.context.ContextConfiguration;
	import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
	
	import com.mis.domain.CustomerVO;
	import com.mis.persistence.CustomerDAO;
	
	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(
			locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
			)
	public class CustomerTest {
	
		@Inject
		private CustomerDAO dao;
		
		//
		@Test
		public void insertCustomer() throws Exception{
			
			CustomerVO vo = new CustomerVO();
			
			vo.setUserid("user02");
			vo.setName("이재성");
			vo.setBirthyear(311);
			vo.setAddress("대전광역시 동구 용운동");
			vo.setPhone("01068900238");
			vo.setGrade("GOLD");
			
			dao.insertCustomer(vo);
		}
		
		@Test
		public void readCustomer() throws Exception{
			System.out.println(dao.readCustomer("user01"));
			
		}
		
		
		@Test
		public void updateCustomer() throws Exception{
			
			CustomerVO vo = new CustomerVO();
			
			vo.setUserid("yjs4400");
			vo.setName("유재성");
			vo.setBirthyear(0123);
			vo.setAddress("대전광역시 동구 오정동");
			vo.setPhone("01024665821");
			vo.setGrade("SILVER");
			
			dao.updateCustomer(vo);
		}
		
		@Test
		public void deleteCustomer() throws Exception{
			dao.deleteCustomer("user01");
	
		}
	
	}
