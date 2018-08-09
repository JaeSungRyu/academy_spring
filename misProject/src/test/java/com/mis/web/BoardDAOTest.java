package com.mis.web;

import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.BoardVO;
import com.mis.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class BoardDAOTest {
	@Inject
	private BoardDAO dao;
	
	private static Logger Logger = LoggerFactory.getLogger(BoardDAOTest.class);

	@Test
	public void testCreate() throws Exception{
		
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다");
		board.setContent("새로운 글을 넣습니다");
		board.setWriter("user00");
		
		dao.create(board);
	}
	
	@Test
	public void testRead() throws Exception{
		Logger.info(dao.read(4).toString());
	}
	@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 글입니다");
		board.setContent("수정 테스트");
		
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(2);
	}
	
	
	
}

