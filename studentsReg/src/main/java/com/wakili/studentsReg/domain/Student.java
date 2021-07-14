package com.wakili.studentsReg.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String othername;
    private String gender;
    private String dateofbirth;    
    private int departmentid;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long id, String firstname, String lastname, String othername, String gender, String dateofbirth,
			int departmentid) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.othername = othername;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.departmentid = departmentid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getOthername() {
		return othername;
	}
	public void setOthername(String othername) {
		this.othername = othername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	
    
    
}
