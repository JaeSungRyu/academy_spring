package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {
	
	//������ �߰��� ���� �޼ҵ�
	public void insertCustomer(CustomerVO vo);
	//������ ��ȸ�� ���� �޼ҵ�
	public CustomerVO readCustomer(String customerid) throws Exception;
	//������ ������ ���� �޼ҵ�
	public void updateCustomer(CustomerVO vo) throws Exception;
	//������ ������ ���� �޼ҵ�
	public void deleteCustomer(String userid) throws Exception;
	
}
