package com.servingpower.dao;

import java.util.ArrayList;

import com.servingpower.bean.Labour;

public interface AdminDao {
	
	public boolean saveLabour(Labour lb,String ps);
	
	public ArrayList signin(int id,String role,String password);
	public ArrayList findDetails(int id);


}
