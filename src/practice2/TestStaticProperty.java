package practice2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Rollroyce", "V8");
        Car car2 = new Car("Rollroyce", "V6");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Merc","V5");
        System.out.println(Car.numberOfCar);
    }
}
