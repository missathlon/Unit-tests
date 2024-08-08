package test.homeworks.hw3.task1;

import Homeworks.hw3.task1.EvenOddNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class EvenOddNumberTest {

    @Test
    public void testIsEvenPositiveEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(4)).isTrue();
    }

    @Test
    public void testIsEvenPositiveOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(7)).isFalse();
    }

    @Test
    public void testIsEvenZero() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(0)).isTrue();
    }

    @Test
    public void testIsEvenNegativeEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(-2)).isTrue();
    }

    @Test
    public void testIsEvenNegativeOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(-3)).isFalse();
    }
}