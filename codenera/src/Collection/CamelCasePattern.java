package Collection;

import java.util.Arrays;

public class CamelCasePattern 
{

	public static void main(String[] args)
	{
		 String[] str={"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
	     String str2="WTF";
	     System.out.println("Givem String Array:->"+Arrays.toString(str));
	     System.out.println("Givem String:->"+str2);
	     for(int i = 0;i < str.length;i++)
	     {
	    	 int c = 0;
	    	 for(int j = 0;j < str[i].length();j++)
	    	 {
	    		 for(int k = 0;k < str2.length();k++)
	    		 {
	    			 if(str[i].charAt(j) == str2.charAt(k))
	    			 {
	    				 c++;
	    				 break;
	    			 }
	    		 }
	    	 }
	    	 if(c >= str2.length())
	    	 {
	    		 System.out.println(str[i]);
	    	 }
	     }

	}

}