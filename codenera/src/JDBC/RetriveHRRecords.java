package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveHRRecords {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			String sql = "select * from test1 where department = 'HR'";
			
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("id    name     department   salary");
			System.out.println("-------------------------------------");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "  |  " + rs.getString(2) +"    |   " + rs.getString(3) +"    |   " + rs.getInt(4));
			}
			System.out.println("--------------------------------------");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
