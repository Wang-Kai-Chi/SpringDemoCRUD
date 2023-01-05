package com.eric.demo02;

import javax.persistence.*;

@Entity
@Table(name = "cust")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String cname;
	private String tel;
	private String birthday;

	public String getName() {
		return cname;
	}

	public void setName(String cname) {
		this.cname = cname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", cname=" + cname + ", tel=" + tel + ", birthday=" + birthday + "]";
	}
	
	
}
