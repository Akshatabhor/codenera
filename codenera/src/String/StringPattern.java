package String;
public class StringPattern
{
    public static void main(String[] args) 
    {
        String str = "Welcome";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j == i || j == len - 1 - i) {
                    System.out.print(str.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
