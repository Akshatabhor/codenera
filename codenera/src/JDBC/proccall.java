package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class proccall {

	public static void main(String[] args)
	{

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			String sql="call Get_All_Details()";
			CallableStatement cs=con.prepareCall(sql);
			System.out.println("id    fname    lname    city");
			ResultSet rs=cs.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
