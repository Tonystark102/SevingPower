package com.servingpower.service;

import java.util.ArrayList;

import com.servingpower.bean.Labour;
import com.servingpower.dao.AdminDao;
import com.servingpower.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService {

	
	public boolean addLabour(Labour lb,String ps) {
		// TODO Auto-generated method stub
		return new AdminDaoImpl().saveLabour(lb,ps);
	}

	@Override
	public ArrayList login(int id, String role, String password) {
		// TODO Auto-generated method stub
		
		AdminDaoImpl ed=new AdminDaoImpl();
		
		return ed.signin(id, role, password);
	}

	@Override
	public ArrayList getDetails(int id) {
		// TODO Auto-generated method stub
		AdminDao Dao=new AdminDaoImpl(); 
		return Dao.findDetails(id);
	}
	
	

}
