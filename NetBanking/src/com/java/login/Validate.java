package com.java.login;
import java.sql.*;

public class Validate
 {
	
	public static Connection connect() throws SQLException
	{
		 Connection con = null;
		//loading drivers for mysql
        try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating connection with the database 
	         con=DriverManager.getConnection
	                       ("jdbc:mysql://localhost:3306/netbanking","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return con;

	 
	}
     public static boolean checkUser(String name,String pass) 
     {
      boolean st =false;
      try{
    	  
    	  Connection con=connect();
	 
         PreparedStatement ps =con.prepareStatement
                             ("select * from userreg where name=? and pass=?");
         ps.setString(1, name);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
     
     //Validating customer
     public static boolean checkCustomer(String name,String pass) 
     {
      boolean st =false;
      try{

    	  Connection con=connect();
    	  
         PreparedStatement ps =con.prepareStatement
                             ("select * from CustomerLogin where name=? and pass=?");
         ps.setString(1, name);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
