package SOLID;

//Dependency Inversion Principle (DIP)
// High-level modules should not depend on low-level modules. Both should depend on abstractions.

public class AreaCalculator {


    // Dependency inversion adhered example

        private final Shape shape;

        public AreaCalculator(Shape shape) {
            this.shape = shape;
        }

        public double calculateArea() {
            return shape.calculateArea();

    }

}
