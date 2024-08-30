package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter course: ");
        String course = sc.next();
        System.out.print("Enter city: ");
        String city = sc.next();
        System.out.print("Enter total marks: ");
        int totalMarks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNo = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "Pass@12345");
            String query = "INSERT INTO Student (id, name, course, city, total_marks, phone_no) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, course);
            pstmt.setString(4, city);
            pstmt.setInt(5, totalMarks);
            pstmt.setString(6, phoneNo);
            pstmt.executeUpdate();

            System.out.println("Student added successfully.");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void viewStudents() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "Pass@12345");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM Student";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("List of Students:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("City: " + rs.getString("city"));
                System.out.println("Total Marks: " + rs.getInt("total_marks"));
                System.out.println("Phone No: " + rs.getString("phone_no"));
                System.out.println("----------------------------");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void editStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to edit: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new course: ");
        String course = sc.nextLine();
        System.out.print("Enter new city: ");
        String city = sc.nextLine();
        System.out.print("Enter new total marks: ");
        int totalMarks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new phone number: ");
        String phoneNo = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "Pass@12345");
            String query = "UPDATE Student SET name = ?, course = ?, city = ?, total_marks = ?, phone_no = ? WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, course);
            pstmt.setString(3, city);
            pstmt.setInt(4, totalMarks);
            pstmt.setString(5, phoneNo);
            pstmt.setInt(6, id);
            pstmt.executeUpdate();

            System.out.println("Student updated successfully.");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "Pass@12345");
            String query = "DELETE FROM Student WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Student deleted successfully.");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
