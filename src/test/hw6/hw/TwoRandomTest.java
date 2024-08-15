package test.hw6.hw;

import homeworks.hw6.hw.TwoRandom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoRandomTest {

    @Test
    void twoRand() {
        TwoRandom twoRandom = new TwoRandom(3, 3);

        String sResult = twoRandom.twoRand();

        assertTrue(sResult.contains("Средние значения равны") || sResult.contains("список имеет большее среднее значение"));
    }
}
