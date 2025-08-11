package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.Programs;
import java.util.List;

public class ProgramsTest {

    Programs programs = new Programs();

    @Test
    void testReverseTableForFive() {
        String expected =
              "5 x 10 = 50\n"
            + "5 x 9 = 45\n"
            + "5 x 8 = 40\n"
            + "5 x 7 = 35\n"
            + "5 x 6 = 30\n"
            + "5 x 5 = 25\n"
            + "5 x 4 = 20\n"
            + "5 x 3 = 15\n"
            + "5 x 2 = 10\n"
            + "5 x 1 = 5\n";
        assertEquals(expected, programs.reverseTable(5));
    }

    @Test
    void testGetAlphabets() {
        String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        assertEquals(expected, programs.getAlphabets());
    }

    @Test
    void testPrintASCIIValues() {
        StringBuilder expectedBuilder = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            expectedBuilder.append(ch).append(" = ").append((int) ch).append("\n");
        }
        String expected = expectedBuilder.toString();

        assertEquals(expected, programs.printASCIIValues());
    }


    @Test
    void testFactorial() {
        assertEquals(1, programs.factorial(0));
        assertEquals(1, programs.factorial(1));
        assertEquals(120, programs.factorial(5));
    }

    @Test
    void testCountNumbers() {
        int[] input = {1, -2, 3, 4 ,5 ,-5, -6, -9, 0, 10, 0};
        int[] expected = {5, 4, 2};
        assertArrayEquals(expected, programs.countNumbers(input));
    }

    @Test
    void testFindMinMax() {
        int[] input = {5, 3, 8, -2, 0, 11};
        int[] expected = {11, -2};
        assertArrayEquals(expected, programs.findMinMax(input));
    }

    @Test
    void testDivisibleByNine() {
        int[] result = programs.divisibleByNine();

        int expectedCount = 11;
        int expectedSum = 1683;

        assertEquals(expectedCount, result[0]);
        assertEquals(expectedSum, result[1]);
    }

    @Test
    void testOnesComplement() {
        assertEquals(-6, programs.onesComplement(5));
        assertEquals(0, programs.onesComplement(-1));
        assertEquals(-1, programs.onesComplement(0));
    }

    @Test
    void testTwosComplement() {
        assertEquals(-5, programs.twosComplement(5));
        assertEquals(1, programs.twosComplement(-1));
        assertEquals(0, programs.twosComplement(0)); 
    }


    @Test
    void testFibonacci() {
        int[] expected = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, programs.fibonacci(5));
    }
}
