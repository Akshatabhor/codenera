package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insert2 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			String sql="insert into test1(id,name,department,salary)values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			while (true)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter id:");
				int id=sc.nextInt();
				ps.setInt(1, id);
				System.out.println("Enter Name:");
				String name=sc.next();
				ps.setString(2, name);
				System.out.println("Enter department:");
				String department=sc.next();
				ps.setString(3, department);
				System.out.println("Enter Salary:");
				int salary=sc.nextInt();
				ps.setInt(4,salary);
				
				ps.addBatch();
				
				System.out.println("Do you want to continue press yes(y) or No(n) :");
				char c=sc.next().charAt(0);
				if(c=='n')
					break;
				
			}
			ps.executeBatch();
			
			System.out.println("Data inserted Successfully");
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
