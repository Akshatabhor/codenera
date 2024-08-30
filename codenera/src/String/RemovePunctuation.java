package String;
import java.util.Scanner;


public class RemovePunctuation {
	public static void main(String[] args)
    {
        // input string
        String str = "hello,all how,are you?";
         
        str = str.replaceAll("\\p{Punct}","");
         
        System.out.println(str);
    }
     
}

