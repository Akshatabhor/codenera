package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Pass@12345");
			
			String sql = "select * from employee";
			
			PreparedStatement pa = con.prepareStatement(sql);
			System.out.println("id        Name          department          salary");
			System.out.println("-----------------------------------------------");
			ResultSet rs = pa.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "    |     " + rs.getString(2) + "     |    " + rs.getString(3) +"   |   " + rs.getInt(4));
				
			}
			System.out.println("-----------------------------------------------");
			con.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
