package FileHandling;


import java.io.*;
public class CommonNameInTwoFiles {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\file1.txt");
        File f2=new File("D:\\file3.txt");
        try {
            BufferedReader b1=new BufferedReader(new FileReader(f1));
            BufferedReader b2=new BufferedReader(new FileReader(f2));
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            String s;
            while ((s=b1.readLine())!=null){
                sb1.append(s);
                sb1.append(" ");
            }
            while ((s=b2.readLine())!=null){
                sb2.append(s);
                sb2.append(" ");
            }
            System.out.println("File 1 Content:");
            System.out.println(sb1);
            System.out.println("File 2 Content:");
            System.out.println(sb2);
            System.out.println("--------------------------------");
            System.out.println("Common Names in both file :");
            common(sb1.toString(),sb2.toString());
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void common(String s1, String s2) throws IOException {
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            for (String s : str2) {
                if (str1[i].equals(s)) {
                   sb.append(str1[i]);
                   sb.append(" ");
                }
            }
        }
        File fl=new File("Common_Name.txt");
        fl.createNewFile();
        BufferedWriter bw=new BufferedWriter(new FileWriter(fl));
        for (String s:sb.toString().split(" ")){
            bw.write(s+" ");
        }
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader(fl));
        System.out.println( br.readLine());
    }
}