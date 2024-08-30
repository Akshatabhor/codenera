package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class retrieveData2 {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/delta_2024";
        String jdbcUser = "root";
        String jdbcPassword = "Pass@12345";

        Connection con = null;
        CallableStatement cs = null;
        Scanner sc = new Scanner(System.in);

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

            // Get employee ID from user input
            System.out.print("Enter Employee ID: ");
            String name = sc.next();

            // Prepare the callable statement
            String sql = "{CALL GetEmployeeDetails2(?)}";
            cs = con.prepareCall(sql);

            // Set the input parameter
            cs.setString(1, name);

            // Execute the stored procedure
            ResultSet rs = cs.executeQuery();

            // Process the result set
            if (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name")); // Adjusted to match the provided data
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Salary: " + rs.getDouble("salary"));
            } else {
                System.out.println("No employee found with ID: " + name);
            }

            // Close the result set
            rs.close();
        } 
        catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } 
        catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } 
        finally {
            // Close resources
            try {
                if (cs != null) {
                    cs.close();
                }
                if (con != null) {
                    con.close();
                }
                sc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
