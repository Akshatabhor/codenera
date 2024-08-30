package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Q1Assignment {
    public static void main(String[] args) {
        String str="D:\\File1.txt";
        StringBuilder sb=new StringBuilder();
        try(BufferedReader bfr=new BufferedReader(new FileReader(str))){
            String s;
            while ((s= bfr.readLine())!=null){
                sb.append(s);
                sb.append("\n");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("File Content:");
        System.out.println(sb);
        System.out.println("Characters and Their Frequency :");
        charFrequency(sb.toString());
    }
    public static void charFrequency(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else {
                hm.put(s.charAt(i),1);
            }
        }
        System.out.println(hm);
        System.out.println("Maximum frequency of char :");
        mostFrequent(hm);
    }
    public static void mostFrequent(HashMap<Character,Integer>hm){
        char maxChar = ' ';
        int freq = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("max char :"+maxChar+"  Frequency :"+freq);
    }
}