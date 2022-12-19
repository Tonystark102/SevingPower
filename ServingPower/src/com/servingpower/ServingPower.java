package com.servingpower;

import java.util.ArrayList;
import java.util.Scanner;

import com.servingpower.bean.Labour;
import com.servingpower.service.AdminService;
import com.servingpower.service.AdminServiceImpl;

public class ServingPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("ServingPower");
      System.out.println("1.Login");
      Scanner sc=new Scanner(System.in);
      int login=sc.nextInt();
      ArrayList userDetails = null;
      if(login==1)
      {
    	  System.out.println("Enter user Id");
    	  int id=sc.nextInt();
    	  System.out.println("Enter Role");
    	  String role=sc.next();
    	  System.out.println("Enter password");
    	  String password=sc.next();
    	  
    	  AdminService service=new AdminServiceImpl();
    	  
    	   userDetails=service.login(id, role, password);
    	   if((userDetails.get(1).toString().equalsIgnoreCase("admin")))
    	      {
    		   
    		   System.out.println("Hi  "+userDetails +"\n\n\n");
    	    	  System.out.println("1.Add Labour");
    	    	  int std=sc.nextInt();
    	    	  if(std==1)
    	    	  {
    	    		  
    	    	  
 
    	    	  
    	    	  Labour lb=new Labour();
    	    	  System.out.println("Enter id");
    	    	  int lid=sc.nextInt();
    	    	  System.out.println("Enter password");
    	    	  String ps=sc.next();
    	    	  System.out.println("Enter Labour Name");
    	    	  String lName=sc.next();
    	    	  System.out.println("Enter age");
    	    	  int age=sc.nextInt();
    	    	  System.out.println("Enter Categoey");
    	    	  String cat=sc.next();
    	    	  System.out.println("Enter salary");
    	    	  int salary=sc.nextInt();
    	    	  System.out.println("Enter mobile Number");
    	    	  String number=sc.next();
    	    	  System.out.println("Enter address");
    	    	  String address=sc.next();
    	    	  lb.setAddress(address);
    	    	  lb.setAge(age);
    	    	  lb.setCategory(cat);
    	    	  lb.setId(lid);
    	    	  lb.setNumber(number);
    	    	  lb.setSalary(salary);
    	    	  lb.setName(lName);
    	    	  
    	    	  service.addLabour(lb,ps);
    	       }
    	      }
    	   else if (!(userDetails.get(1).toString().equalsIgnoreCase("admin")))
    	   {
    		   System.out.println("Hi "+userDetails.get(0).toString());
    		   System.out.println("1.profile");
    		   System.out.println("2.Vacancy");
    		   AdminService serviceObj=new AdminServiceImpl();
    		   int dOption=sc.nextInt();
    		   if(dOption==1)
    		   {
    			  ArrayList lst= serviceObj.getDetails(id);
    			 
    			   System.out.println("Name :"+lst.get(0));
    			   System.out.println("Role :"+lst.get(1));
    			   System.out.println("Mobile Number :"+lst.get(2));
    			   System.out.println("Age :"+lst.get(3));
    			   System.out.println("Address :"+lst.get(4));
    		   }
    	   }
    	      else
    	      {
    	    	 System.out.println("You are not a valid user"); 
    	      }
      }
      
      }

}
