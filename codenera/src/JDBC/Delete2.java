package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delta_2024", "root", "Pass@12345");
            
            String sql = "DELETE FROM test1 WHERE salary < ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter salary threshold for deletion: ");
            int salaryThreshold = sc.nextInt();
            
            ps.setDouble(1, salaryThreshold);
            
            ps.executeUpdate();
            System.out.println("deleted successfully.");
           
            con.close();
          
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}

