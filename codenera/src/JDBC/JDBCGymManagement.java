package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCGymManagement {

    private static final String URL = "jdbc:mysql://localhost:3306/gym_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Pass@12345";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Gym Management System Member Management");
                System.out.println("1. Add New Member");
                System.out.println("2. View All Members");
                System.out.println("3. Update Member Profile");
                System.out.println("4. Delete Member");
                System.out.println("5. Search Member by Name");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                

                switch (choice) {
                    case 1:
                        addMember(scanner);
                        break;
                    case 2:
                        viewAllDetails();
                        break;
                    case 3:
                        updateMemberProfile(scanner);
                        break;
                    case 4:
                        deleteMember(scanner);
                        break;
                    case 5:
                        searchMemberByName(scanner);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private static void searchMemberByName(Scanner sc) {
        System.out.print("Enter First name to search: ");
        String fname = sc.nextLine();
        
        String sql = "SELECT * FROM Members WHERE first_name LIKE ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + fname + "%");
            System.out.println("Id     First_Name        Last_Name       Membership_Plan      Email      Contact_Number       Join_Date");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.printf("%d  |  %s    |   %s      |  %s      |     %s      |     %s  |  %s%n",
                            rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
                            rs.getString("membership_plan"), rs.getString("email"), rs.getString("contact_number"),
                            rs.getString("join_date"));
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteMember(Scanner sc) {
        System.out.print("Enter Member ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        
        String sql = "DELETE FROM Members WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Member deleted successfully.");
            } else {
                System.out.println("No member found with ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateMemberProfile(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Membership Plan: ");
        String membershipPlan = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Contact No: ");
        String contactNumber = sc.nextLine();
        System.out.print("Joining Date (YYYY-MM-DD): ");
        String joinDate = sc.nextLine();

        String sql = "UPDATE Members SET first_name = ?, last_name = ?, membership_plan = ?, email = ?, contact_number = ?, join_date = ? WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, membershipPlan);
            ps.setString(4, email);
            ps.setString(5, contactNumber);
            ps.setString(6, joinDate);
            ps.setInt(7, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Member updated successfully.");
            } else {
                System.out.println("No member found with ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewAllDetails() {
        String sql = "SELECT * FROM Members";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            System.out.println("Id     First_Name        Last_Name       Membership_Plan      Email      Contact_Number       Join_Date");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%d  |  %s    |   %s      |  %s      |     %s      |     %s  |  %s%n",
                        rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
                        rs.getString("membership_plan"), rs.getString("email"), rs.getString("contact_number"),
                        rs.getString("join_date"));
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addMember(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Membership Plan: ");
        String membershipPlan = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Contact No: ");
        String contactNumber = sc.nextLine();
        System.out.print("Joining Date (YYYY-MM-DD): ");
        String joinDate = sc.nextLine();

        String sql = "INSERT INTO Members (id, first_name, last_name, membership_plan, email, contact_number, join_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, membershipPlan);
            ps.setString(5, email);
            ps.setString(6, contactNumber);
            ps.setString(7, joinDate);
            ps.executeUpdate();
            System.out.println("Member added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
