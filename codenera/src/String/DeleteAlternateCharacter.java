package String;

public class DeleteAlternateCharacter 
{
	public static String deleteAlternateCharacters(String str)
	{
        String s = "";
        for (int i = 0; i < str.length(); i += 2) 
        {
            s =s+ str.charAt(i);
        }
        return s;
	}
	public static void main(String[] args)
	{
		String str = "Geeks";
        String result = deleteAlternateCharacters(str);
        System.out.println(result); 
	}
	
}
