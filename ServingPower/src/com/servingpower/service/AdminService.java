package com.servingpower.service;

import java.util.ArrayList;

import com.servingpower.bean.Labour;

public interface AdminService {
	
	public boolean addLabour(Labour lb, String ps);
	
	public ArrayList login(int id,String role,String password);
	public ArrayList getDetails(int id);

	

}
