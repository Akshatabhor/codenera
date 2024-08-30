package String;

import java.util.Scanner;

public class StringMethodDemo
{
	
	public static void Strupp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		str = str.toUpperCase(); // to convert given string in uppercase
		
		System.out.println("Upper case : "+str);
	}
	
	public static void Strlow()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		str = str.toLowerCase(); // to convert given string in Lowercase
		
		System.out.println("Lowercase str : "+str);
	}
	
	public static void chAt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Enter position : ");
		int i = sc.nextInt();
		
		char ch = str.charAt(i); //  0 denote at index position 
		
		// charAt() : it return the character at given index 
	
		System.out.println("char at "+i+"th  position : "+ch);
		
		System.err.println("character retrives in string using charAt() method :  ");
		for(int j = 0;j<str.length();j++)
		{
			System.out.println(str.charAt(j));
		}
		
		for(int j = 0;j<str.length();j++)
		{
			System.out.println(str.charAt(j));
		}
	}
	public static void len()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Length in given string : "+str.length());

		//length() : it return length of given string 
	}
	
	public static void indOf()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Enter Character for getting index : ");  // H
				
	    char c = sc.next().charAt(0); // hello
		
		// it gives first index of perticular character 
		
		System.out.println("first index of given charater  : "+str.indexOf(c));
	}
	  
	public static void lastindOf()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println("Enter Character for getting index : ");
		char c = sc.next().charAt(0);
		
		// it gives last index of perticular character 
		
		
		System.out.println("last index of given charater  : "+str.lastIndexOf(c));
		
		
	}
	public static void strconcat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.next(); // Hello  java
		
		System.out.println("Enter String 2: ");
		String str2 = sc.next();
		
		
		String str3 = str.concat(str2);
		System.out.println("Concated string : "+str3);
	}
	// /hello  
	public static void strtrim()
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String 1: ");
//		String str = sc.nextLine();//  Hello    
		
		
		String str = "Hello "; //   Hello  Java
		String str2 = "Hello";
		System.out.println(" string before trim : "+str+"Java");
		
		String s = str.trim(); //HelloJava
		System.out.println(" string after trim :"+s+"Java");
	
	}
	public static void strcontains()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.nextLine();//  Hello    
		System.out.println("Enter String 2: ");
		String str2=sc.next();
		if(str.contains(str2))
		{
			System.out.println("str2 contain present in first str");
		}
		else 
		{
			System.out.println("str2 contains not present in first str");
		}
	}
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		do
		{
			System.out.println("Enter choice 1.length \n 2.lowercase :\n3.Uppercase \n4.charAt()\n 5.indOf()\n6. lastIndex() ");
			System.out.println("\n7. concat() \n 8.trim() \n 9.");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 : Prog1.len();
					break;
			case 2 : Prog1.Strlow();
				break;
			case 3 : Prog1.Strlow();
			break;
			case 4 : Prog1.chAt();
			break;
			case 5 : Prog1.indOf();
			break;
			case 6 : Prog1.lastindOf();
			break;
			case 7: Prog1.strconcat();
			break;
			case 8: Prog1.strtrim();
			break;
			case 9: prog1.strcontains();
			break;
			
			default:System.err.println("Wrong input ");
			
			
			}
			System.out.println("Do you want to continue :press 1 or 0 for exit ");
			 ch = sc.nextInt();
			
		}while(ch == 1);
		
		
		System.out.println("Program terminated...");
		
		
		
				
		
		
		
	}

}