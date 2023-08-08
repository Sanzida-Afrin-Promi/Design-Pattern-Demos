package Composite_Pattern;

public class Labour extends Employee{
    private String name;
    public Labour(String name){
        this.name=name;
    }
    @Override
    public void display() {
        System.out.println("Name of the labour:"+name);

    }
}
