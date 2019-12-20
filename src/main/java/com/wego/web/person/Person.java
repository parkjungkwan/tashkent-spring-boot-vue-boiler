package com.wego.web.person;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PERSON")
public class Person {
	@Id
	@GeneratedValue
	@Column(name="ID", nullable=false) 
	private Long id;
	@Column(name="USERID",length = 64, nullable=false) 
	private String userid;
	@Column(name="PASSWD",length = 64, nullable=false) 
	private String passwd;
	@Column(name="NAME",length = 64, nullable=false) 
	private String name;
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTHDAY", nullable=false) 
	private Date birthday;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
