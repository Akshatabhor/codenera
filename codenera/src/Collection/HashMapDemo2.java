/*Java program to count the occurrence of each character in 
a string using Hashmap

Given a string, the task is to write a program in Java which prints the number of occurrences of each character in a string.

Examples: 

Input: str = "java is simple"
Output:
r 1
s 2
e 4
F 1
G 2
k 2
o 1*/

package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) 
	{
        String str = "GeeksForGeeks";

		HashMap <Character,Integer> hm=new HashMap();
	
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println("Character Frequency");
		for(Map.Entry<Character, Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey() +" "+ e.getValue());
		}
	}

		/*public static void countOccurance(String str[])
		{
			HashMap <String, Integer> hm = new HashMap();
			for(int i=0; i<str.length; i++ )
			{
				if(hm.containsKey(str[i]))
				{
					hm.put(str[i], hm.get(str[i])+1);
				}
				else
				{
					hm.put(str[i], 1);
				}
			}
		
			for(Map.Entry<String, Integer> e : hm.entrySet())
			{
				System.out.println(e.getKey()+"\t\t : \t"+e.getValue() );
			}
		}
		public static void main(String[] args) {
			String s="Java is Simple Java is Application";
			System.out.println("Given String :"+s);
			String str[]=s.split(" ");
			HashMapDemo2.countOccurance(str);

		}*/

	}


