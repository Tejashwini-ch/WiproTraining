package main.java;

public class StringPrograms {

    // 1. Highest frequency character in a string
    public char highestFrequencyChar(String str) {
        int[] frequency = new int[256];
        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }

        int maxFreqChar = 0;
        char result = 0;

        for (char ch : str.toCharArray()) {
            if (frequency[ch] > maxFreqChar) {
                maxFreqChar = frequency[ch];
                result = ch;
            }
        }

        return result;
    }

    // 2. Replace first vowel with '-'
    public String replaceFirstVowel(String str) {
        String vowels = "aeiouAEIOU";
        String result = "";
        boolean replaced = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!replaced && vowels.indexOf(ch) != -1) {
                result += '-';
                replaced = true;
            } else {
                result += ch;
            }
        }

        return result;
    }

    // 3. Count alphabets, digits, and special characters
 	public String countCharacters(String input) {
 		int alphabets = 0, digits = 0, specialchar = 0;

 		for (int i = 0; i < input.length(); i++) {
 			char ch = input.charAt(i);

 			if (Character.isLetter(ch)) {
 				alphabets++;
 			} else if (Character.isDigit(ch)) {
 				digits++;
 			} else {
 				specialchar++;
 			}
 		}

 		return "Alphabets: " + alphabets + ", Digits: " + digits + ", Special characters: " + specialchar;
 	}

    // 4. Remove spaces from a string
    public String removeSpaces(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                result += ch;
            }
        }
        return result;
    }

    // 5. Concatenate two strings
    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}
