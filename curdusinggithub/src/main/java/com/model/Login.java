package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Login {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int loginid;
private String uname,password;
public int getLoginid() {
	return loginid;
}
public void setLoginid(int loginid) {
	this.loginid = loginid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
@ManyToOne(cascade=CascadeType.ALL)
private Role role;
}
