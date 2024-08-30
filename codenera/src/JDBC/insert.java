package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			
			String sql="insert into emp3 values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2, "Akshu");
			ps.setString(3, "akahsta@123.com");
			
			ps.executeUpdate();
			System.out.println("data inserted successfully...");
			
			con.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
