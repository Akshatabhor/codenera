package String;
import java.util.Scanner;
public class SpecialArrayReversal {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter  Strings : ");
				String s = sc.next();
				char ch[] = new char[s.length()];
				int k = 0;
				for(int i = 0;i < s.length();i++)
				{
					if(Character.isAlphabetic(s.charAt(i)))
					{
						ch[k++] = s.charAt(i);
					}
				}
				char c[] = s.toCharArray();
				k--;
				for(int i = 0;i < s.length();i++)
				{
					if(Character.isAlphabetic(s.charAt(i)))
					{
						c[i] = ch[k--];
					}
				}
				System.out.println("Reverse String ignore Special Character ");
				for(int i = 0;i < c.length;i++)
				{
					System.out.print(c[i]);
				}
//				String output = String.valueOf(c);
//				System.out.println(output);
			}

		
	}


