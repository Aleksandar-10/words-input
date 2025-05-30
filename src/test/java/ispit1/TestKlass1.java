package ispit1;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKlass1 {

    @Test

    void testMultipleInputs() {
        ByteArrayInputStream in = new ByteArrayInputStream("alek\nstop".getBytes());
        System.setIn(in);
        Klass1.main(new String[0]);

        int actualLineCounter = Klass1.getLineCount();
        int actualCharCounter = Klass1.getCharCount();
        int expectedLineCounter = 1;
        int expectedCharCounter = 4;

        assertEquals(expectedLineCounter, actualLineCounter);
        assertEquals(expectedCharCounter, actualCharCounter);
    }

}
 // testiranje na multiple inputs

