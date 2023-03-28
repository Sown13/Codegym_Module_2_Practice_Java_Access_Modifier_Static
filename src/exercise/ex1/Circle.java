package exercise.ex1;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";
    public Circle (){}
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
