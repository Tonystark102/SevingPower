package com.servingpower.service;

import com.servingpower.bean.Labour;
import com.servingpower.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService {

	
	public boolean addLabour(Labour lb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String login(int id, String role, String password) {
		// TODO Auto-generated method stub
		
		AdminDaoImpl ed=new AdminDaoImpl();
		
		return ed.signin(id, role, password);
	}
	
	

}
