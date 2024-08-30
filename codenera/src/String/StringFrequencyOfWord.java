package String;
import java.util.Scanner;
public class StringFrequencyOfWord 
{
	public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				String str=sc.nextLine();
				
				String s[]=str.split(" ");
				for(int i=0;i<s.length;i++)
				{
					int c=1;
					for(int j=i+1;j<s.length;j++)
					{
						if(s[i]==s[j])
						{
							c++;
							s[j]="\0";
						}
					}
					if(s[i]!="\0")
					{
						System.out.println(s[i]+ "frequency:"+c);
					}
				}
				
	}

}
