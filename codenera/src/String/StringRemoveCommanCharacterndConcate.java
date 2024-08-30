package String;
import java.util.*;
public class StringRemoveCommanCharacterndConcate 
{
		public static void findAndPrintUncommonChars(String str1,String str2)
		{
			String ans = "";
			boolean[] used = new boolean[26];
			for (int i = 0; i < str1.length(); i++) 
			{
				boolean found = false;

				for (int j = 0; j < str2.length(); j++) 
				{
					if (str1.charAt(i) == str2.charAt(j))
					{
						found = true;
						break;
					}
				}
				if (!found && !used[str1.charAt(i) - 'a'])
				{
			        used[str1.charAt(i) - 'a'] = true;
			        ans += str1.charAt(i);
			     }
			}
			for (int i = 0; i < str2.length(); i++)
			{
			     boolean found = false;
			 
			     for (int j = 0; j < str1.length(); j++) 
			      {
			    	  if (str2.charAt(i) == str1.charAt(j)) 
			    	  {
			    		  found = true;
			    		  break;
			    	  }
			     }
			      if (!found && !used[str2.charAt(i) - 'a'])
			      {
			          used[str2.charAt(i) - 'a'] = true;
			          ans += str2.charAt(i);
			       }
			}
			      
			char tempArray[] = ans.toCharArray();
			Arrays.sort(tempArray);
			ans = new String(tempArray);
			if (ans.length() == 0)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(ans + " ");
			}
		}
			     
		public static void main(String[] args) 
		{
			String str1 = "aacdb";
			String str2 = "gafd";
			System.out.println("Uncommon characters of given Strings :");
			findAndPrintUncommonChars(str1, str2);

		}

	}


