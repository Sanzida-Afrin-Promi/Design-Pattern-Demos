package SOLID;

public class Circle implements Shape, Drawable {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // ...
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        // Draw the circle
    }
}
