package homeworks.hw3.hw3.task12;

import homeworks.hw3.task12.EvenOddNumb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenOddNumbTest {
    EvenOddNumb evenOddNumb;
    int iOddNumber = 11;
    int iEvenNumber = 12;

    @BeforeEach
    void setUp() {
        evenOddNumb = new EvenOddNumb();
    }

    @Test
    void oddNumber() {
        assertFalse(evenOddNumb.evenOddNumb(iOddNumber));
    }

    @Test
    void evenNumber() {
        assertTrue(evenOddNumb.evenOddNumb(iEvenNumber));
    }
}