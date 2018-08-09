package com.mis.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.CustomerVO;

//dao�� �������� �νĽ�Ű�� ���� repository ������̼� ���
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	//Mybatis���� Sql ���� �۾��� ���ִ� SqlSession Ŭ���� ���
	@Inject
	private SqlSession sqlSession;
	
	
	//CustomerMapper.xml�� ����Ǿ� �ִ� ���������� ���� �ش� ��ġ�� ã�ư��� namespace ��������
	private static final String namespace = "com.mis.mapper.CustomerMapper";
	
	
	
	//�� ���� ��� �޼ҵ� 
	@Override
	public void insertCustomer(CustomerVO vo) {
		sqlSession.insert(namespace + ".insertCustomer",vo);
	
	}
	//�� ��ȸ �޼ҵ�
	@Override
	public CustomerVO readCustomer(String customerid) throws Exception {

		return(CustomerVO) sqlSession.selectOne(namespace + ".readCustomer",customerid);
	}
	//������ ���� �޼ҵ�
	@Override
	public void updateCustomer(CustomerVO vo) throws Exception {
		
		sqlSession.update(namespace+".updateCustomer",vo);
		
	}
	//������ ���� �޼ҵ�
	@Override
	public void deleteCustomer(String userid) throws Exception {
		
		sqlSession.delete(namespace+".deleteCustomer",userid);
		
	}

}
