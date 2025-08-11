package test.java;
import org.junit.jupiter.api.*;

import main.java.CollectionProgram;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionProgramTest {

    @Test
    public void testExtractsubString() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        List<String> subString = CollectionProgram.extractsubString(list, 1, 3);
        assertEquals(Arrays.asList("B", "C"), subString);
    }

}
