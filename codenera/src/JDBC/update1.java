package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update1 {

	public static void main(String[] args)
	{
		 try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Pass@12345");
				PreparedStatement ps = con.prepareStatement("update employee set salary = ?  where id = ? ");			
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter salary : ");
				 String salary = sc.next();
				System.out.println("Enter  ID: ");
		         int id = sc.nextInt();

		         ps.setString(1, salary);
		         ps.setInt(2, id);
						
				ps.executeUpdate();
				
				System.out.println("data updated successfully...");
		
				con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
