package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert3 
{
	private static final String DB_URL = "jdbc:mysql://localhost:3306/test1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Pass@12345";
	public static void main(String[] args) 
	{
		String name = "Akshata";
        String email = "akshata123@gmail.com";
        String position = "Software Engineer";
        double salary = 75000.00;
        String doj = "2024-01-15"; 
        String city = "Pune";
        String country = "India";
        String zipCode = "412001";
        int age = 24; 
        if (age > 18) 
        {
            insertEmployee2(name, email, position, salary, doj, city, country, zipCode, age);
        } 
        else 
        {
            System.out.println("Employee age must be greater than 18.");
        }
		
	}
	private static void insertEmployee2(String name, String email, String position, double salary, String doj,String city, String country, String zipCode, int age)
	{
		String sql = "INSERT INTO employee2 (name, email, position, salary, doj, city, country, zip_code, age) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) 
        {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, position);
            preparedStatement.setDouble(4, salary);
            preparedStatement.setDate(5, java.sql.Date.valueOf(doj));
            preparedStatement.setString(6, city);
            preparedStatement.setString(7, country);
            preparedStatement.setString(8, zipCode);
            preparedStatement.setInt(9, age);
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) 
            {
                System.out.println("A new employee was inserted successfully!");
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
		
	}

}