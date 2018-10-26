package com.daoi;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface Logindaoi extends CrudRepository<Login, Integer>
{
	public Login findAllByUnameAndPassword(String uname, String password);
}
