package String;
import java.util.Scanner;
public class removewordlastoccurance {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Srting 1:");
		String s1=sc.nextLine();
		System.out.println("Enter String 2:");
		String s2= sc.nextLine();
		
		if(s1.contains(s2))
		{
		String s3[]=s1.split(" ");
		
		
		for(int i=s3.length-1; i>=0; i--)
		{
			if(s3[i].equals(s2))
			{
				s3[i]="";
				break;
			}
		
		}
		for(int i=0; i<s3.length; i++)
		{
			System.out.print(s3[i]+" ");
		}
		
	
		}
		else
		{
			System.out.println("Invalid Input: string 2 not present in string 1 ");
		}
	}

}
