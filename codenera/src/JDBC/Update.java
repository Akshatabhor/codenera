package JDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

    public static void main(String[] args) {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024","root","Pass@12345");
			PreparedStatement ps = con.prepareStatement("update emp3 set id = ? ,name = ?,city = ? where id = ? ");			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter id : ");
			int id = sc.nextInt();
			 ps.setInt(1, id);
			 System.out.println("Enter name : ");
			 String name = sc.next();

			 ps.setString(2, name);
			 System.out.println("Enter city : ");
			 String email = sc.next();
			 ps.setString(3, email);
			 
			 ps.setInt(4, id);
					
			ps.executeUpdate();
			
			System.out.println("data updated successfully...");
	
			con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
