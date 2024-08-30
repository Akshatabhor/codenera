package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WordCounting {
    public static void main(String[] args) {
        File file=new File("D:\\file1.txt");
        StringBuilder sb=new StringBuilder();
        try {
            BufferedReader bf=new BufferedReader(new FileReader(file));
            String s;
            while ((s=bf.readLine())!=null){
                sb.append(s);
                sb.append(" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The File Content:");
        System.out.println(sb);
        System.out.println("Word count is :"+count(sb.toString()));
    }
    public static int count(String s){
        String [] str=s.split(" ");
        return str.length;
    }
}