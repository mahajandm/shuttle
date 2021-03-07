package com.Shuttle.Shuttle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name="user_details")
public class UserEntity {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int Id;
private String userName;
private String password;
private String userType;
private String email;
private String mobile;

public UserEntity(int id, String userName, String password, String userType, String email, String mobile) {
	super();
	Id = id;
	this.userName = userName;
	this.password = password;
	this.userType = userType;
	this.email = email;
	this.mobile = mobile;
}

public UserEntity() {
	super();
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

@Override
public String toString() {
	return "UserEntity [Id=" + Id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
			+ ", email=" + email + ", mobile=" + mobile + "]";
}



}
