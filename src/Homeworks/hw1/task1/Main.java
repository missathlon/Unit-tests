package Homeworks.hw1.task1;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Сумма с учётом скидки: " + calculator.calculateDiscount(15358.76, 25));
        System.out.println("Сумма с учётом скидки: " + calculator.calculateDiscount(15358.76, 101));
    }
}
