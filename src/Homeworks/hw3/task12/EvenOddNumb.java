package Homeworks.hw3.task12;

public class EvenOddNumb {

    // Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    public boolean evenOddNumb(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static class NumberInInterval {

        // Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true,
        // если попадает и false - если нет.
        // Покрыть тестами метод на 100%

        public boolean numberInInterval(int n) {
            if (n > 25 && n < 100) {
                return true;
            } else {
                return false;
            }
        }
    }
}
