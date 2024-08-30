package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Create a file");
            System.out.println("2. Write content to file");
            System.out.println("3. Read content from file");
            System.out.println("4. Delete a file");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    writeFile(scanner);
                    break;
                case 3:
                    readFile(scanner);
                    break;
                case 4:
                    deleteFile(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createFile(Scanner scanner) {
        System.out.print("Enter the file name to create: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    private static void writeFile(Scanner scanner) {
        System.out.print("Enter the file name to write to: ");
        String fileName = scanner.nextLine();
        System.out.println("Enter the content to write to the file:");
        String content = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void readFile(Scanner scanner) {
        System.out.print("Enter the file name to read from: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
