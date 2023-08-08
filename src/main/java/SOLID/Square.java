package SOLID;
// Liskov Substitution Principle (LSP)
// Subtypes should be substitutable for their base types.Both Square and Rectangle implements Shape.


public class Square implements Shape,Drawable{

    private final double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public void draw() {
        //Draw square

    }
}
