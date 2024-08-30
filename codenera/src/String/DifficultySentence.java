package String;

public class DifficultySentence
{
	public static void main(String[] args) {
	        String S1 = "Difficulty of sentence";
	        String S2 = "I am good";
	        System.out.println(calculateDifficulty(S1));
	        System.out.println(calculateDifficulty(S2));
	    }

	    public static int calculateDifficulty(String sentence) {
	        int hardCount = 0;
	        int easyCount = 0;

	        String[] words = sentence.split("\\s+");

	        for (String word : words) {
	            if (isHardWord(word)) {
	                hardCount++;
	            } else {
	                easyCount++;
	            }
	        }

	        return 5 * hardCount + 3 * easyCount;
	    }

	    public static boolean isHardWord(String word) {
	        word = word.toLowerCase();
	        int consonants = 0;
	        int vowels = 0;

	        for (char c : word.toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                vowels++;
	                consonants = 0; 
	            } else {
	                consonants++;
	            }

	            if (consonants > 4 || consonants > vowels) {
	                return true; 
	            }
	        }

	        return false; 
	    }
	}


