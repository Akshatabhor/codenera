package String;

public class AlphabetPosition {

    public static void main(String[] args) {
        String s1 = "ABcED";
        String s2 = "geeksforgeeks";

        System.out.println(countCharactersAtSamePosition(s1)); 
        System.out.println(countCharactersAtSamePosition(s2)); 
    }

    public static int countCharactersAtSamePosition(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int position = i + 1;

            if (ch == (char)('A' + i) || ch == (char)('a' + i)) {
                count++;
            }
        }

        return count;
    }
}
