package com.hibernate.main;

import com.hibernate.UserDAOImpl.UserDAOImpl;
import com.hibernate.entity.User;
import com.hibernate.entity.UserSalary;

public class HibernateMain {
	public static void main(String args[]) {
		User user = new User();
		UserDAOImpl users = new UserDAOImpl();
		UserSalary sal = new UserSalary();
		
		user.setName("Pawan");
		user.setPassword("12345678");
		user.setConfirm_password("123445");
		user.setDob("13-10-1996");
		user.setMobile_no("9650173120");
		user.setGender("Male");
		user.setAddress("sector-17 Rohini");

		sal.setSalary(50000);
		sal.setUser(user);
		user.setSal(sal);

		boolean b = users.saveUser(user);
		if (b) {
			System.out.println("user successfully save");
		} else {
			System.out.println("Something went wrong");
		}
	}
}
