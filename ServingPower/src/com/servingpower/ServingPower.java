package com.servingpower;

import java.util.Scanner;

import com.servingpower.service.AdminService;
import com.servingpower.service.AdminServiceImpl;

public class ServingPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("ServingPower");
      System.out.println("1.Login");
      Scanner sc=new Scanner(System.in);
      int login=sc.nextInt();
      if(login==1)
      {
    	  System.out.println("Enter user Id");
    	  int id=sc.nextInt();
    	  System.out.println("Enter Role");
    	  String role=sc.next();
    	  System.out.println("Enter password");
    	  String password=sc.next();
    	  
    	  AdminService service=new AdminServiceImpl();
    	  
    	  service.login(id, role, password);
      }
      }

}
