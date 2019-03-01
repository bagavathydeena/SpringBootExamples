package com.bagavathy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_DETAIL")
public class Account {
	@Column(name="ACCOUNT_NAME")
	String name;
	@Column(name="ACCOUNT_ID")
	String id;
	@Column(name="ACCOUNT_AGE")
	long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
}
