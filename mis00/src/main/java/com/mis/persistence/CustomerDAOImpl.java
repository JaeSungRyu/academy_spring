package com.mis.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.CustomerVO;

//dao를 스프링에 인식시키기 위한 repository 어노테이션 사용
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	//Mybatis에서 Sql 관련 작업을 해주는 SqlSession 클래스 사용
	@Inject
	private SqlSession sqlSession;
	
	
	//CustomerMapper.xml에 저장되어 있는 쿼리실행을 위해 해당 위치를 찾아가는 namespace 변수선언
	private static final String namespace = "com.mis.mapper.CustomerMapper";
	
	
	
	//고객 정보 등록 메소드 
	@Override
	public void insertCustomer(CustomerVO vo) {
		sqlSession.insert(namespace + ".insertCustomer",vo);
	
	}
	//고객 조회 메소드
	@Override
	public CustomerVO readCustomer(String customerid) throws Exception {

		return(CustomerVO) sqlSession.selectOne(namespace + ".readCustomer",customerid);
	}
	//고객정보 수정 메소드
	@Override
	public void updateCustomer(CustomerVO vo) throws Exception {
		
		sqlSession.update(namespace+".updateCustomer",vo);
		
	}
	//고객정보 삭제 메소드
	@Override
	public void deleteCustomer(String userid) throws Exception {
		
		sqlSession.delete(namespace+".deleteCustomer",userid);
		
	}

}
