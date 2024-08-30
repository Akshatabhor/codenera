/* Write a Java program to create an abstract class BankAccount 
 * with abstract methods deposit() and withdraw(). 
 * Create subclasses: SavingsAccount and CurrentAccount that extend the 
 * BankAccount class and implement the respective methods to handle 
 * deposits and withdrawals for each account type.

*/

package Abstraction;
abstract class bankaccount
{
	abstract void deposite();
	abstract void withdraw();
}
class savingaccount extends bankaccount
{
	 int n=5000;
	    @Override
	    void deposite() {
	        System.out.println("Your Savings account balance is :"+n);
	        System.out.println("1000 deposited ");
	        this.n+=1000;
	        System.out.println("Your Current balance is "+(this.n));
	    }
	    @Override
	    void withdraw() {

	        System.out.println("4000 credited.... ");
	        this.n-=4000;
	        System.out.println("Your Current balance is "+(this.n));
	    }

}
class currentaccount extends bankaccount
{
	 int n=7000;
	    @Override
	    void deposite() {
	        System.out.println("Your current account balance is :"+n);
	        System.out.println("1000 deposited ");
	        this.n+=1000;
	        System.out.println("Your Current balance is "+(this.n));
	    }
	    @Override
	    void withdraw() {

	        System.out.println("4000 credited.... ");
	        this.n-=4000;
	        System.out.println("Your Current balance is "+(this.n));
	    }


}
public class Example3 {

	public static void main(String[] args) {
		bankaccount b=new currentaccount();
        System.out.println("Current account ----->");
         b.deposite();
         b.withdraw();
        System.out.println("====================================");
        System.out.println("Savings Account ------->");
        bankaccount c=new savingaccount();
        c.withdraw();
        c.deposite();

	}

}
