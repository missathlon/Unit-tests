package Homeworks.hw2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", 2022);
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2021);

        // переопределение метода toString в классах-наследниках достойно восхищения...
        System.out.println(car);
        System.out.println(motorcycle);

        car.testDrive();
        System.out.println("Car speed after test drive: " + car.getSpeed());
        car.park();
        System.out.println("Car speed after parking: " + car.getSpeed());

        motorcycle.testDrive();
        System.out.println("Motorcycle speed after test drive: " + motorcycle.getSpeed());
        motorcycle.park();
        System.out.println("Motorcycle speed after parking: " + motorcycle.getSpeed());
    }
}
