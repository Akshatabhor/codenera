package Encapsulation;

import java.util.Scanner;

class student3      //read only
{
	private int rollno=1;
	private String name="Akshata";
	
	public int getrollno()
	{
		return rollno;
	}
	public String getname()
	{
		return name;
	}
}
class student4   //write only
{
	private int rollno;
	private String name;
	 public void setrollno(int rollno)
	 {
		 this.rollno=rollno;
	 }
	 public void setname(String name)
	 {
		 this.name=name;
	 }
	 public void disp()
	 {
		 System.out.println("rollno:"+rollno+" name:"+name);
	 }
}
public class EncapsulationDemo3 {

	public static void main(String[] args) 
	{
		student4 obj=new student4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno:");
		int rollno=sc.nextInt();
		System.out.println("enter the name:");
		String name=sc.next();
		
		obj.setrollno(rollno);
		obj.setname(name);
		obj.disp();
	}

}
