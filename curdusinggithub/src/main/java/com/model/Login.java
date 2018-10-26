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
private String username,password;
public int getLoginid() {
	return loginid;
}
public void setLoginid(int loginid) {
	this.loginid = loginid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
