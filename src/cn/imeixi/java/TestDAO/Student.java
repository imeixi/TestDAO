package cn.imeixi.java.TestDAO;

import java.sql.Date;

public class Student {

	Integer id = null;
	String name = null;
	String sex = null;
	Date birth = null;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Student(Integer id, String name, String sex, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		
}
