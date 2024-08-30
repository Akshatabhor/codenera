package String;
import java.util.Scanner;
public class largestSmallestWord 
{
	public void largestSmallest(String s)
		{
			int max=0,min=Integer.MAX_VALUE;
			String maxString="", minString="";
			String s1[]=s.split(" ");
			
			for(int i=0; i<s1.length; i++)
			{
				if(s1[i].length() > max)
				{
					maxString=s1[i];
					max=s1[i].length();
				}
				
				if(s1[i].length() < min)
				{
					minString=s1[i];
					min=s1[i].length();
				}
			}
			System.out.println("Largest String: "+maxString);
			System.out.println("smallest String : "+minString);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String: ");
			String s=sc.nextLine();
			
			largestSmallestWord obj=new largestSmallestWord();
			obj.largestSmallest(s);
		}

	}

	


