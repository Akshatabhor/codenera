package String;

public class StringDemo 
{
	
	public static void main(String[] args) 
	{
		String s1="java";
		System.out.println(s1);
		s1=s1.concat(" is language");
		System.out.println(s1);
		
		char c[]= {'h','e','l','l','o','w'};
		String s2=new String(c);
		System.out.println("using sequence character:"+s2);
	}

}
