package com.servingpower.service;

import com.servingpower.bean.Labour;

public interface AdminService {
	
	public boolean addLabour(Labour lb);
	
	public String login(int id,String role,String password);
	

}
