package org.tud.zyao.domain;

import java.io.Serializable;
import java.util.Date;


public class Student implements Serializable {
	private int studentNo;
	private String loginPwd;
	private String studentName;
	private String sex;
	
	//java.util.Date or java.sql.Date?
	private Date bornDate;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentNo, String loginPwd, String studentName, String sex, Date bornDate) {
		super();
		this.studentNo = studentNo;
		this.loginPwd = loginPwd;
		this.studentName = studentName;
		this.sex = sex;
		this.bornDate = bornDate;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", loginPwd=" + loginPwd + ", studentName=" + studentName + ", sex="
				+ sex + ", bornDate=" + bornDate + "]";
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	
	
}
