package test.java;

import main.java.StringPrograms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProgramsTest {

    StringPrograms strprogram = new StringPrograms();

    @Test
    void testHighestFrequencyChar() {
        assertEquals('l', strprogram.highestFrequencyChar("hello"));      
        assertEquals('a', strprogram.highestFrequencyChar("aaaabbbcc")); 
    }

    @Test
    void testReplaceFirstVowel() {
        assertEquals("h-llo", strprogram.replaceFirstVowel("hello"));
        assertEquals("xyz", strprogram.replaceFirstVowel("xyz")); 
    }
    @Test
    public void testCountCharacters() {
        assertEquals("Alphabets: 2, Digits: 1, Special characters: 1", strprogram.countCharacters("ab2@"));
    }

    @Test
    void testRemoveSpaces() {
        assertEquals("helloworld", strprogram.removeSpaces("hello world"));
    }
    @Test
    void testConcatenateStrings() {
        assertEquals("HelloWorld", strprogram.concatenateStrings("Hello", "World"));
        assertEquals("Java123", strprogram.concatenateStrings("Java", "123"));
    }
}
