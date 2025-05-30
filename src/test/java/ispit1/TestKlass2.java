package ispit1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKlass2 {

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
    // ako prviot zbor e Stop, treba da izvadi 0 char i 0 redovi


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
    // ako vneseme 3 parametri, treba da izvadi 12 char, i 3 reda

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
// ako vneseme 3 parametri i STOP, treba da izvadi 12 char, i 3 reda, i da ne go broi STOP

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

        //Najdolgiot zbor e prviot od povekje so ista (najgolema) dolzina


    }

}
