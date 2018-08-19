package com.hibernate.UserDAOImpl;

import org.hibernate.Session;

import com.hibernate.dao.UserDAO;
import com.hibernate.entity.User;
import com.hibernate.services.ConnectToDB;

public class UserDAOImpl implements UserDAO {
	ConnectToDB connect = new ConnectToDB();
	Session session = null;

	public boolean saveUser(User user) {
		session=connect.getSession();
		session.beginTransaction();
		try {
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	public boolean updateUser(User user) {
		session=connect.getSession();
		session.beginTransaction();
		
		

		return false;
	}

}
