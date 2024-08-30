package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete1 {

	public static void main(String[] args) 
	{
		try {
        	Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Pass@12345");
			PreparedStatement ps = con.prepareStatement("delete from employee where id = ? ");			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter id for delete record: ");
			int id = sc.nextInt();
			 ps.setInt(1, id);
			 
			 ps.executeUpdate();
			
			System.out.println("data deleted successfully...");
	
			con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
