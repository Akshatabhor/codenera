package String;

public class MaxDiffSameChar {

	public static void main(String[] args) 
	{
		String s="socks"; 
		  int maxdiff=0; 
		  for (int i = 0; i < s.length(); i++)  
		  { 
		   for (int j = i+1; j< s.length(); j++)  
		   { 
		    if(s.charAt(i)==s.charAt(j)) 
		    { 
		     int diff=j-i-1; 
		     if(diff>maxdiff) 
		     { 
		      maxdiff=diff; 
		     } 
		    } 
		     
		   } 
		    
		  } 
		  System.out.println(maxdiff); 
		 } 
		 
		

	}


