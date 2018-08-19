package com.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "user_salary")
public class UserSalary {

	@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = {
			@Parameter(value = "user", name = "property") })
	@Column(name = "ID")
	private int userId;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID")
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "salary")
	private int salary;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
