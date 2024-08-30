package JDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultiRec 
{
	public static void main(String[] args) 
	{
		try 
		{			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			PreparedStatement ps = con.prepareStatement("insert into emp3 values(?,?,?)");
			
			while(true)
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter id : ");
				int id = sc.nextInt();
				 ps.setInt(1, id);
				 System.out.println("Enter name : ");
				 String name = sc.next();

				 ps.setString(2, name);
				
				 System.out.println("Enter email : ");
				 String email = sc.next();
				 ps.setString(3, email);
				 		
				 ps.addBatch();
				 
				 System.out.println("Do you want to conitue press yes(y) or No (n) : ");
				 char c = sc.next().charAt(0);
				 if(c=='n')
					 break;
			}
			ps.executeBatch();
			
			System.out.println("data inserted successfully...");
				
			con.close();			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}