package StringBuffer;

public class Bufferlength {

	public static void main(String[] args) 
	{
		String str="java";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("String 1:"+str);
		int length=sb.length();
		System.out.println("String length:"+length);
	}

}
