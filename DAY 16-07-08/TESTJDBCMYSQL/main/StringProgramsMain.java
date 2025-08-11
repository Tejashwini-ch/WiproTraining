package main.java;
public class StringProgramsMain {
    public static void main(String[] args) {
        StringPrograms str = new StringPrograms();

        System.out.println("1. Highest frequency char: " + str.highestFrequencyChar("programming"));
        System.out.println("2. Replacing the first vowel: " + str.replaceFirstVowel("hello world"));
        System.out.println("3. " + str.countCharacters("Hello123@#"));
        System.out.println("4. Removing  spaces: " + str.removeSpaces("hello world test"));
        System.out.println("5. Concatenating the strings: " + str.concatenateStrings("Hello", "World"));
    }
}