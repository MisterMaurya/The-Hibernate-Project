package com.hibernate.dao;

import com.hibernate.entity.User;

public interface UserDAO {
	public boolean saveUser(User user);

	public boolean updateUser(User user);

}
