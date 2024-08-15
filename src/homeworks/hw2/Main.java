package homeworks.hw2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2021);

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
