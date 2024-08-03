package Homeworks.hw1.task1;

public class Calculator {

    public double calculateDiscount(double purchaseAmount, double discountAmount) throws ArithmeticException {

        if (purchaseAmount < 0 || discountAmount < 0) {
            throw new ArithmeticException("Значение не может быть отрицательным");
        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100%");
        } else {
            return purchaseAmount * (1 - discountAmount / 100);
        }
    }
}
