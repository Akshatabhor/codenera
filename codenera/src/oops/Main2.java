package oops;

class Person {
 private String name;
 private int age;
 private String address;

 public Person(String name, int age, String address) {
     this.name = name;
     this.age = age;
     this.address = address;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Address: " + address);
 }
}

class Student extends Person {
 private int rollNumber;

 public Student(String name, int age, String address, int rollNumber) {
     super(name, age, address);  // Call the superclass constructor
     this.rollNumber = rollNumber;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();  
     System.out.println("Roll Number: " + rollNumber);
 }
}

public class Main2 {
 public static void main(String[] args) {
     Person person = new Person("John Doe", 30, "123 Main St");
     System.out.println("Person Information:");
     person.displayInfo();

     Student student = new Student("Alice Smith", 20, "456 Elm St", 101);
     System.out.println("\nStudent Information:");
     student.displayInfo();
 }
}

