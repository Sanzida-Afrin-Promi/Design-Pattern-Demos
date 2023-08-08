package SOLID;

// Interface Segregation Principle (ISP)
// StraightLine doesn't implement Shape as it won't count area interfaces they do not use.



public class StraightLine implements Drawable{
    @Override
    public void draw() {
        //Draw StraightLine
    }
}
