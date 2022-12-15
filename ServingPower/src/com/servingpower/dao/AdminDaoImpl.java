package com.servingpower.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servingpower.bean.Labour;
import com.servingpower.utills.Utility;

public class AdminDaoImpl implements AdminDao{

	//@Override
	public boolean saveLabour(Labour lb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String signin(int id, String role, String password) {
		// TODO Auto-generated method stub
		PreparedStatement ptst;
		Connection cone=Utility.getDBConnection();
		try {
			ptst=cone.prepareStatement("select name from LoginCredential where password=?,role=?,userId=? ptst.id ");
			ptst.setInt(1, id);
			ptst.setString(2, password);
			ptst.setString(3,role);
			ResultSet st=ptst.executeQuery();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
