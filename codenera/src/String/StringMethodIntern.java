package String;

public class StringMethodIntern {

	public static void main(String[] args) 
	{
		/*String s1="java";
		String s2=s1.intern();
		String s3=new String("java");
		 String s4 = s3.intern();
		 
		 System.out.println(s1==s2);
		 System.out.println(s1==s3);
		 System.out.println(s1==s4);
		 System.out.println(s2==s4);
		 System.out.println(s3==s4);
		 System.out.println(s3==s2);
		 System.out.println(s3==s1);
		 */
		
		String s1="java";//another example
		String s2=s1;
		String s3=s2.intern();
		String s4=new String("java");
		String s5=s4.intern();
	
		
		



		
	}

}
