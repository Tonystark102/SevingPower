package com.servingpower.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.servingpower.bean.Labour;
import com.servingpower.utills.Utility;

public class AdminDaoImpl implements AdminDao{

	//@Override
	public boolean saveLabour(Labour lb,String ps) {
		// TODO Auto-generated method stub
		PreparedStatement ptst;
		Connection cone=Utility.getDBConnection();
		//Connection cone=Utility.getDBConnection();
		try {
			ptst=cone.prepareStatement("Insert into Labour values(?,?,?,?,?,?,?)");
			ptst.setInt(1, lb.getId());
			ptst.setString(2, lb.getName());
			ptst.setString(3, lb.getNumber());
			ptst.setInt(4, lb.getSalary());
			ptst.setInt(5, lb.getAge());
			ptst.setString(6, lb.getCategory());
			ptst.setString(7, lb.getAddress());
			
			int count=ptst.executeUpdate();
			ptst=cone.prepareStatement("Insert into LoginCredential values(?,?,?,?)");
			ptst.setInt(1, lb.getId());
			ptst.setString(2, ps);
			ptst.setString(3, lb.getCategory());
			ptst.setString(4, lb.getName());
			int count1=ptst.executeUpdate();
			if(count==1 && count1==1)
			{
			System.out.println("Labour added succefully");
			return true;
			}
			return false;
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured "+e);
		}
		return false;
	}

	@Override
	public ArrayList signin(int id, String role, String password) {
		// TODO Auto-generated method stub
		PreparedStatement ptst;
		Connection cone=Utility.getDBConnection();
		try {
			ptst=cone.prepareStatement("select name,Role,UserId from LoginCredential where password=? and role=? and userId=?");
			ptst.setString(1, password);
			ptst.setString(2, role);
			ptst.setInt(3,id);
			ResultSet res=ptst.executeQuery();
              while (res.next()) {
			  
			  String Name=res.getString(1);
			  String role1=res.getString(2);
			  int lbid=res.getInt(3);
			 ArrayList list=new ArrayList();
			 list.add(Name);
			 list.add(role1);
			 list.add(lbid);
			  	return list;
			  }
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("e"+e);
		}
		return null;
	}

	@Override
	public ArrayList findDetails(int id) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		PreparedStatement ptst;
		Connection cone=Utility.getDBConnection();
		try {
			ptst=cone.prepareStatement("select name,category,mobileNumber,age,address from Labour where id=?");
			ptst.setInt(1, id);
			
			ResultSet res=ptst.executeQuery();
              while (res.next()) {
			  
			  String Name=res.getString(1);
			  String role1=res.getString(2);
			  String mbNumber=res.getString(3);
			  int age=res.getInt(4);
			  String address=res.getString(5);
			 ArrayList list=new ArrayList();
			 list.add(Name);
			 list.add(role1);
			 list.add(mbNumber);
			 list.add(age);
			 list.add(address);
			 
			  	return list;
			  }
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("e"+e);
		}
		return null;
	
		
	}

}
