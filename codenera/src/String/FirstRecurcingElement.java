package String;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class FirstRecurcingElement
{
	int charIndex = 0;
    String firstRecurringChar = "";

    public static void main(String[] args) {

    	FirstRecurcingElement Finder = new FirstRecurcingElement();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String inputStr = input.next();

        int IndexResult = Finder.findIndex(inputStr);
        String CharacterResult = Finder.findChar(inputStr);

        if (!Objects.equals(CharacterResult, "")) {
            System.out.println("The first recurring character in this string is " + CharacterResult + " and it recurs at index " + IndexResult);

        } else {
            System.out.println("No characters recur in this string");
        }

    }

    public int findIndex(String inputString) {

        char[] chars = inputString.toCharArray();


        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char c : chars) {
            characterArrayList.add(c);
        }


        for (Character c : characterArrayList) {

            if (!Objects.equals(firstRecurringChar, "")) {
                break;
            }


            for (int i = characterArrayList.indexOf(c) + 1; i < characterArrayList.size(); i++) {

                String a = String.valueOf(c);
                String b = String.valueOf(characterArrayList.get(i));
                charIndex = i;

                if (Objects.equals(a, b)) {
                    firstRecurringChar = b;
                    break;
                }

            }
        }

        return charIndex;
    }

    public String findChar(String inputString) {
        findIndex(inputString);
        return firstRecurringChar;
    }
}

