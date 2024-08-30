package String;
import java.util.Scanner;
public class countoccuranceword {

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
			int cnt=0;
			for(int i=0; i<s3.length; i++)
			{
				if(s3[i].equals(s2))
				{
					cnt++;
				}
			}
			System.out.println(s2+" is present "+cnt+" times in given string");
		}
		else
		{
			System.out.println("Invalid Input: string 2 not present in string 1 ");
		}

	}



	}


