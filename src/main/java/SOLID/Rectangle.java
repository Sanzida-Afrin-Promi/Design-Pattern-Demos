package SOLID;

public class Rectangle implements Shape, Drawable {
    private  double width;
    private  double height;
    // ...
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        // Draw the rectangle
    }
}


