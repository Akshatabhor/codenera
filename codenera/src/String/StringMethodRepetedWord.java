package String;

import java.util.Scanner;

public class StringMethodRepetedWord {

	
		public static void main(String[] args) 
		{
			String s="java is simple java";
			System.out.println("Given string: "+ s);
			String[] a = s.split(" ");
			
			int maxcnt=0; 
			String maxword="";
			
			for (int i = 0; i < a.length; i++) 
			{
				int c=0;
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[i].equals(a[j]))
					{
						c++;
					}
				
				}
				if(c>maxcnt)
				{
					maxcnt=c;
					maxword=a[i];
				}
				
			}
			System.out.println(maxword);
			
			
		}

	}

