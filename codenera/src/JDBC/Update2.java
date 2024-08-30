package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/delta_2024","root","Pass@12345");
			
			String sql="update test1 set department=? where id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Department:");
			String department=sc.next();
			System.out.println("Enter id:");
			int id=sc.nextInt();
			
			ps.setString(1, department);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			
			System.out.println("data updated successfully");
			
			con.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
