package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.stereotype.Service;

import com.daoi.Logindaoi;
import com.daoi.Roledaoi;
import com.daoi.Userdaoi;
import com.model.Login;
import com.model.Role;
import com.model.User;
import com.service.Serviceinterface;
@Service
public class Serviceimpl implements Serviceinterface 
{
@Autowired 	
Roledaoi roledaoi;
@Autowired
Userdaoi userdaoi;
@Autowired
Logindaoi logindaoi;
	@Override
	public Role getRolename(Role role) {
		System.out.println("in getrole serviceimpl");
		System.out.println(role.getRoleid());
		return roledaoi.findOne(role.getRoleid());
		
	}
	@Override
	public User saveUser(User u) 
	{
		System.out.println("in save serviceimpl....");
		User ut=userdaoi.save(u);
	     System.out.println(ut.getFname()+ut.getLname()+ut.getMob()+ut.getLogin().getPassword()+ut.getLogin().getUname()+ut.getLogin().getRole().getRolename());
		return ut;
	}
	@Override
	public List<User> getAlldata() 
	{
		System.out.println("in serviceimpl getdata.......");
		List<User>list= (List<User>) userdaoi.findAll();
		return list;
	}
	@Override
	public Login getlogin(String uname, String password) 
	{
		System.out.println("in Sserviceimpl..getlogin");
		Login login= logindaoi.findAllByUnameAndPassword(uname, password);
		System.out.println(login.getPassword()+"password login");
		return login;
	}
	
}
