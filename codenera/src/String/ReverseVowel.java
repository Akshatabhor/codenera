package String;
import java.util.Scanner;
public class ReverseVowel {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String :");
				String str = sc.nextLine();
				char ch[] = str.toCharArray();
				char ch1[] = new char[ch.length];
				int x = 0;
				for(int i = 0;i < ch.length;i++)
				{
					if(ch[i] == 'a' |ch[i] == 'e' |ch[i] == 'i' |ch[i] == 'o' |ch[i] == 'u')
					{
						ch1[x++] = ch[i];
					}
				}
				for(int i = 0;i < ch.length;i++)
				{
					if(ch[i] == 'a' |ch[i] == 'e' |ch[i] == 'i' |ch[i] == 'o' |ch[i] == 'u')
					{
						ch[i] = ch1[--x];
					}
				}
				String s1 = new String(ch);
				System.out.println("String After reeverse vowels : " +s1);
			}

		
	}


