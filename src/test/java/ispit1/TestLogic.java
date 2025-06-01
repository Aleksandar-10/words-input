package ispit1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogic {

    @Test
    void testCountWordStop() {
        Klass2 klass2 = new Klass2();
        klass2.count("STOP");

        int actualCharCount = klass2.getCharCounter();
        int actualLineCount = klass2.getLineCounter();
        int expected = 0;

        assertEquals(expected, actualCharCount);
        assertEquals(expected, actualLineCount);
    }
    // Test if the first word is Stop, should not be counted


    @Test
    void testCountWordsNoStop() {
        Klass2 klass2 = new Klass2();
        klass2.count("mile");
        klass2.count("alek");
        klass2.count("ilce");

        int actualCharCounter = klass2.getCharCounter();
        int expectedCharCounter = 12;
        assertEquals(expectedCharCounter, actualCharCounter);

        int actualLineCounter = klass2.getLineCounter();
        int expectedLineCounter = 3;
        assertEquals(expectedLineCounter, actualLineCounter);
    }
    // Test if we enter 3 parameters, it should give 12 char and 3 rows


    @Test
    void testCountWordsWithStop() {
        Klass2 klass2 = new Klass2();
        klass2.count("mile");
        klass2.count("alek");
        klass2.count("ilce");
        klass2.count("stop");

        int actualCharCounter = klass2.getCharCounter();
        int expectedCharCounter = 12;
        assertEquals(expectedCharCounter, actualCharCounter);

        int actualLineCounter = klass2.getLineCounter();
        int expectedLineCounter = 3;
        assertEquals(expectedLineCounter, actualLineCounter);

    }
    // Test if we enter 3 parameters and Stop, it should give 12 char and 3 rows, and not count the Stop


    @Test
    void testLongestWord() {
        Klass2 klass2 = new Klass2();
        klass2.count("mile");
        klass2.count("aleksandar");
        klass2.count("ilce");
        klass2.count("stop");

        String actual = klass2.getLongestWord();
        String expected = "aleksandar";
        assertEquals(expected, actual);

        // Test the Longest word

    }

}
