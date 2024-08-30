package String;

public class LastMatch1 {

	public static void main(String[] args)
	{
		String a = "abcdefghijklghifghsd"; 
		  String b= "ghi"; 
		  a.indexOf("ghi"); 
		  System.out.println(a.lastIndexOf(b)+1);
	}

}
