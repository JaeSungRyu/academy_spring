package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {
	
	//고객정보 추가를 위한 메소드
	public void insertCustomer(CustomerVO vo);
	//고객정보 조회를 위한 메소드
	public CustomerVO readCustomer(String customerid) throws Exception;
	//고객정보 수정을 위한 메소드
	public void updateCustomer(CustomerVO vo) throws Exception;
	//고객정보 삭제를 위한 메소드
	public void deleteCustomer(String userid) throws Exception;
	
}
