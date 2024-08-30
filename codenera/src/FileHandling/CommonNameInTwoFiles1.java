package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CommonNameInTwoFiles1 {
	public static void commonString(String s1,String s2) 
	{
		String str1[]=s1.split("[\\s\\p{Punct}]+");
		System.out.println("\nData in file 1: \n"+s1);
		String str2[]=s2.split("[\\s\\p{Punct}]+");
		System.out.println("\nData in file 2: \n"+s2);
		StringBuffer sb=new StringBuffer();
		FileWriter ob;
		try 
		{
			ob = new FileWriter("D:\\file1.txt");
			for(int i=0; i<str1.length; i++)
			{
				for(int j=0; j<str2.length; j++)
				{
					if(str1[i].equalsIgnoreCase(str2[j]))
					{
						ob.write(str1[i]+" ");
					}
				}
			}
			ob.close();
			
			File obj=new File("D:\\file3.txt");
			Scanner sc= new Scanner(obj);
			System.out.println("\nData in File commonNames");
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static String fileReader(String s)
	{
		File ob = new File(s);
		StringBuffer sb = new StringBuffer();
		try 
		{
			Scanner sc= new Scanner(ob);
			while(sc.hasNextLine())
			{
				sb.append(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		//System.out.println(sb);
		s= String.valueOf(sb);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=CommonNameInTwoFiles1.fileReader("D:\\doc1.txt");
		
		String s2=CommonNameInTwoFiles1.fileReader("D:\\doc2.txt");
		
		CommonNameInTwoFiles1.commonString(s1, s2);
		
		
		
	}

}
