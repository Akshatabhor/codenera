package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Search {

	public static void main(String[] args)
	{
		 try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
				PreparedStatement ps = con.prepareStatement("select * from emp3 where id = ? ");			
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter id for searching records : ");
				int id = sc.nextInt();
				 ps.setInt(1, id);
				 
				ResultSet rs=ps.executeQuery();
				
				System.out.println("id       name         city");
				if(rs.next())
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"    "+rs.getString(3));
				}
				else 
				{
					System.out.println("not found");
				}
		
				con.close();
	        }
		 catch (Exception e)
		 {
	            e.printStackTrace();
	        }
	}

}
