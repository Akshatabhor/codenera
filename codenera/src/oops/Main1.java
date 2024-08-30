package oops;

class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     } else {
         System.out.println("Insufficient funds or invalid withdrawal amount.");
     }
 }

 public double checkBalance() {
     return balance;
 }

 public double getBalance() {
     return balance;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }
}

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 // Constructor
 public SavingsAccount(double initialBalance, double interestRate) {
     super(initialBalance);  // Call the superclass constructor
     this.interestRate = interestRate;
 }

 public void addInterest() {
     double interest = getBalance() * interestRate / 100;
     deposit(interest);  // Add interest to the balance
     System.out.println("Interest added: " + interest);
 }
}

class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 public CheckingAccount(double initialBalance, double overdraftLimit) {
     super(initialBalance);  // Call the superclass constructor
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= getBalance() + overdraftLimit) {
         setBalance(getBalance() - amount);
         System.out.println("Withdrew: " + amount);
     } else {
         System.out.println("Overdraft limit exceeded or invalid withdrawal amount.");
     }
 }
}

public class Main1 {
 public static void main(String[] args) {
     SavingsAccount savings = new SavingsAccount(1000, 5);  
     savings.deposit(200);
     savings.addInterest();
     System.out.println("Savings Account Balance: " + savings.checkBalance());

     CheckingAccount checking = new CheckingAccount(500, 200);  
     checking.withdraw(600);
     System.out.println("Checking Account Balance: " + checking.checkBalance());
 }
}
