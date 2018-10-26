package com.service;

import java.util.List;

import com.model.Login;
import com.model.Role;
import com.model.User;

public interface Serviceinterface
{
	public Role getRolename(Role role ); 
	
	public User saveUser(User u);
	public List<User> getAlldata();
	
	public Login getlogin(String uname,String password);
	
}
