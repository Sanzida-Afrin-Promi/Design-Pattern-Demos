package Abstract_Factory;

import Abstract_Factory.Abstract_factory.Obstaclefactory;
import Abstract_Factory.Concrete_Factory.Level1ObstacleFactory;
import Abstract_Factory.Concrete_Factory.Level2ObstacleFactory;
import Abstract_Factory.Product.Obstacle;

public class Client {
    public static void main(String args[]){
        int level = (int)(Math.random() * 2) + 1;
        Obstaclefactory factory;
        Obstacle obstacle;

        if(level==1) factory= new Level1ObstacleFactory();
            else factory=new Level2ObstacleFactory();

            int score =(int)(Math.random()*2000);
            System.out.println(score);
        System.out.println(level);
            obstacle=factory.createAsteroids(score);
            obstacle.show();

            obstacle=factory.createDebrisField(score);
            obstacle.show();

            obstacle=factory.createSpaceCraft(score);
            obstacle.show();
    }
}
