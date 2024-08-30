package FileHandling;
import java.io.*;
import java.util.*;
public class AddTextInExistingFile {
    public static void main(String[] args) {
        File file=new File("D:\\file1.txt");
        try {
            readFile(file);
            Scanner s=new Scanner(System.in);
            System.out.println("Enter string you want to add :");
            String str=s.nextLine();
            BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
            bw.write(" "+str);
            bw.close();
            readFile(file);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void readFile(File f) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader(f));
        String string;
        StringBuilder sb=new StringBuilder();
        while ((string=bf.readLine())!=null){
            sb.append(string);
            sb.append(" ");
        }
        System.out.println("File Content:");
        System.out.println(sb);
    }
}