package String;
import java.util.Scanner;

		public class GoodBadString
		{
			static boolean vowel(char c)
		    {
		        if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
		            || c == 'u') {
		            return true;
		        }
		        return false;
		    }
		    static String isGoodorBad(String S)
		    {
		        int v = 0, c = 0;
		        for (int i = 0; i < S.length(); i++)
		        {
		            char ch = S.charAt(i);
		            if (vowel(ch)) 
		            {
		                c = 0;
		                v++;
		            }
		            else if (ch == '?') 
		            {
		                v++;
		                c++;
		            }
		            else 
		            {
		                v = 0;
		                c++;
		            }
		            if (v > 5 || c > 3) 
		            {
		                return "String is Bad";
		            }
		        }
		        return "String is Good : 1";
		    

		    }

			public static void main(String[] args) 
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String :");
				String str = sc.nextLine();
				System.out.println(isGoodorBad(str));
			}
				 

		
	}


