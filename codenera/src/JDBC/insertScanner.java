package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertScanner {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			String sql="insert into emp3 values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("enter the n entry:");
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				System.out.println("enter"+i+"Email_id:");
				ps.setInt(1, sc.nextInt());
				sc.nextLine();
				System.out.println("enter"+i+"Name:");
				ps.setString(2, sc.nextLine());
				System.out.println("enter"+i+ "Email:");
				ps.setString(3, sc.nextLine());
				ps.executeUpdate();
			}
			System.out.println("data inserted successfully.....");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
