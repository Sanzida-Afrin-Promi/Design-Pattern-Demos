package SOLID;
// Open/Closed Principle (OCP)
// Classes are open for extension but closed for modification.

// New Triangle class added without modifying existing classes


public class Triangle implements Shape,Drawable{
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        //draw Triangle

    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;

    }
}
