package practice2;

public class Car {
    private String carName, engineName;
    public static int numberOfCar;
    public Car(String name, String engine){
        carName = name;
        engineName = engine;
        numberOfCar++;
    }


}
