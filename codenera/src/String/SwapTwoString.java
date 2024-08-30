package String;

public class SwapTwoString {

	public static void main(String[] args) 
	{
		String s1="java";
		String s2="Html";
		int l=s1.length();
		System.out.println("string 1:"+s1);
		System.out.println("string 2:"+s2);

			s1=s1.concat(s2);
			s2=s1.substring(0,l);
			System.out.println("string 2:"+s2);
			s1=s1.substring(l);
			System.out.println("string 1:"+s1);

	}

}
