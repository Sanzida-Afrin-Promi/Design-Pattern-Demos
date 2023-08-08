package Composite_Pattern;

public class Client {
    public static void main(String args[]){
        Labour l1= new Labour("Rakib");
        Labour l2=new Labour("Emon");
        Labour l3= new Labour("Sakib");
        Manager m1= new Manager("Safayet");
        m1.add(l1);
        m1.add(l3);
        Manager m2= new Manager("Rabbi");
        m2.add(l2);
        Manager root=new Manager(" Head :Habib");
        root.add(m1);
        root.add(m2);
        root.display();
        m1.remove(l3);
        root.display();
        root.remove(m1);
        root.display();
    }
}
