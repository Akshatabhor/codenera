package FileHandling;

import java.io.*;
public class LongestWordInFile {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\file1.txt");
        String s=readFile(file);
        longest(s);
    }
    public static String readFile(File f) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader(f));
        String string;
        StringBuilder sb=new StringBuilder();
        while ((string=bf.readLine())!=null){
            sb.append(string);
            sb.append(" ");
        }
        System.out.println("File Content:");
        System.out.println(sb);
        return sb.toString();
    }
    public static void longest(String s){
        String[] str=s.split(" ");
        int max=0;
        String maxStr="";
        for (String s1:str){
            if (maxStr.length()<s1.length()){
                max=s1.length();
                maxStr=s1;
            }
        }
        System.out.println("The longest String is :"+maxStr);
    }
}
