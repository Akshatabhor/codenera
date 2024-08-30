package String;

public class rearrangeStringInLexicography1 {

	public static void main(String[] args) 
	{
		String s = "ACCBA10D2EW30"; 
		  char[] a = s.toCharArray(); 
		  int sum=0; 
		  for (int i = 0; i < a.length; i++)  
		  { 
		   for (int j= i+1; j< a.length; j++)  
		   { 
		    if(a[i]>a[j]) 
		    { 
		     char temp=a[i]; 
		     a[i]=a[j]; 
		     a[j]=temp; 
		    } 
		     
		   } 
		   //System.out.println(a[i]); 
		   if(Character.isDigit(a[i])) 
		   { 
		    sum=sum+Integer.parseInt(String.valueOf(a[i])); 
		   } 
		   else 
		   { 
		    System.out.print(a[i]+""); 
		     
		   } 
		 
		    
		  } 
		  System.out.print(sum+"");
	}

}
