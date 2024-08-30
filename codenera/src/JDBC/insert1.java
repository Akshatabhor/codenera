package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert1 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Pass@12345");
			
			String sql = "insert into department(id,name,department) values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,2);
			ps.setString(2,"product");
			ps.setString(3,"Sales");
			
			
			ps.executeUpdate();
			System.out.println("Data inserted Successfully....");
			
			
			con.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}

}
