package com.mis.domain;

import java.util.Date;

public class CustomerVO {
	
	//멤버변수 선언
	private String userid;
	private String name;
	private int birthyear;
	private String address;
	private String phone;
	private String grade;
	private Date regdate;
	private Date moddate;
	
	//기본 생성자
	public CustomerVO() {
		
		
	}
	//생성자
	public CustomerVO(String userid, String name, int birthyear, String address, String phone, String grade) {
		super();
		this.userid = userid;
		this.name = name;
		this.birthyear = birthyear;
		this.address = address;
		this.phone = phone;
		this.grade = grade;
	}

	//생성자
	public CustomerVO(String userid, String name, int birthyear, String address, String phone, String grade,
			Date regdate, Date moddate) {
		super();
		this.userid = userid;
		this.name = name;
		this.birthyear = birthyear;
		this.address = address;
		this.phone = phone;
		this.grade = grade;
		this.regdate = regdate;
		this.moddate = moddate;
	}
	
	//접근 & 수정자 생성
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getModdate() {
		return moddate;
	}

	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}
	
	//toString 초기화
	@Override
	public String toString() {
		return "CustomerVO [userid=" + userid + ", name=" + name + ", birthyear=" + birthyear + ", address=" + address
				+ ", phone=" + phone + ", grade=" + grade + ", regdate=" + regdate + ", moddate=" + moddate + "]";
	}
	
}
