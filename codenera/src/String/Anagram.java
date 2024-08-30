package String;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("Enter another string :");
        String str1=s.nextLine();
       if(anagram(str,str1))
       {
           System.out.println("Strings are anagram !");
       }else {
           System.out.println("Strings are not anagram !");
       }
    }
    public static boolean anagram(String s1,String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer>hm1=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
           if (hm1.containsKey(s1.charAt(i))){
               hm1.put(s1.charAt(i),hm1.get(s1.charAt(i))+1);
           }else {
               hm1.put(s1.charAt(i),1);
           }
        }
        for (int i = 0; i < s2.length(); i++) {
            hm1.remove(s2.charAt(i));
        }
        return hm1.isEmpty();
    }
}