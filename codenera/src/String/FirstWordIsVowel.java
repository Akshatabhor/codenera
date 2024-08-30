package String;
import java.util.Scanner;
public class FirstWordIsVowel {

	public static void main(String[] args) 
	{
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the String:");
				String str=sc.nextLine();
				
				String s[]=str.split(" ");
				for(int i=0;i<s.length;i++)
				{
					char ch=s[i].charAt(0);

					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					{
						System.out.println(s[i]);
					}
				}
					
				}
	}


