package test.homeworks.hw3.task2;

import Homeworks.hw3.task2.NumberInInterval;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberInIntervalTest {

    @Test
    public void testNumberInIntervalPositiveBoundaryNumber() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(26)).isTrue();
        assertThat(checker.numberInInterval(99)).isTrue();
    }

    @Test
    public void testNumberInIntervalNegativeBoundaryNumber() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(25)).isFalse();
        assertThat(checker.numberInInterval(100)).isFalse();
    }
}
