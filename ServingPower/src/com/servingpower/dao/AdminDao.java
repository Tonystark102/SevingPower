package com.servingpower.dao;

import com.servingpower.bean.Labour;

public interface AdminDao {
	
	public boolean saveLabour(Labour lb);
	
	public String signin(int id,String role,String password);

}
