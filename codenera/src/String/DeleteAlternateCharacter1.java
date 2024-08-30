package String;

public class DeleteAlternateCharacter1 {

	public static void main(String[] args)
	{
		String str="Geeks";
		String s="";
		for(int i=0;i<str.length();i=i+2)
		{
			s=s+str.charAt(i);
		}
		System.out.println("delete alternate charachter of Geeks:"+s);
	}

}
