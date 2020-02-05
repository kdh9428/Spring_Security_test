package com.java.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityDto implements UserDetails{

	private String user_name;
	private String password;
	
	public SecurityDto(String user_name,String password) {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
