package com.test.spring.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SignupForm {
	@NotNull
	@Pattern(regexp="[A-Za-z0-9._%-+]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", message="Please Provide a Valid email *(Sorry Not able to save your e-mail currently, Please try again in few days.)")
	private String email;
	private String name;
	private String password;
	
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "SignupForm [email=" + email + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	@Override
//	public String toString() {
//		return "SignupForm [email=" + email + ", name=" + name + ", password="
//				+ password + "]";
//	
//}
}