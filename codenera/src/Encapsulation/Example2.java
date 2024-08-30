 /*Write a Java program to create a class called BankAccount with 
  * private instance variables accountNumber and balance. 
  * Provide public getter and setter methods to access and modify these variables.
  */

package Encapsulation;
class bankaccount
{
	private int accountnumber;
	private int balance;
	//setter method
	public void setaccountnumber(int accountnumber)
	{
		this.accountnumber=accountnumber;
	}
	public void setbalance(int balance)
	{
		this.balance=balance;
	}
	//getter method
	public int getaccountnumber()
	{
		return accountnumber;
	}
	public int getbalance()
	{
		return balance;
	}
}
public class Example2 {

	public static void main(String[] args) 
	{
		bankaccount obj=new bankaccount();
		obj.setaccountnumber(91453);
		obj.setbalance(10000);
		
		System.out.println("abc person account number:"+obj.getaccountnumber());
		System.out.println("abc person account balance:"+obj.getbalance());
	}

}
