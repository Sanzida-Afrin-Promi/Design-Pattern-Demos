package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
     private String name;
     private List<Employee> children;
     public Manager(String name){
         this.name=name;
         children=new ArrayList<>();
     }
     public void add(Employee employee)
     {
         children.add(employee);
     }
     public void remove(Employee employee){
         children.remove(employee);
     }
    @Override
    public void display() {
         System.out.println("Manager name : "+name);
        System.out.println("Employee under the Manager: ");
         for(Employee employee:children){
             employee.display();
         }

    }
}
