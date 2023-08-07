package Abstract_Factory.Concrete_Factory;

import Abstract_Factory.Abstract_factory.Obstaclefactory;
import Abstract_Factory.Concrete_Product.Asteroids.Asteroids;
import Abstract_Factory.Concrete_Product.Asteroids.Ice_Asteroids;
import Abstract_Factory.Concrete_Product.Asteroids.Silicon_Asteroids;
import Abstract_Factory.Concrete_Product.Debris_Field.Debris_Field;
import Abstract_Factory.Concrete_Product.Debris_Field.Persistent_DebrisField;
import Abstract_Factory.Concrete_Product.Debris_Field.Static_DebrisField;
import Abstract_Factory.Concrete_Product.SpaceCraft.FighterShips;
import Abstract_Factory.Concrete_Product.SpaceCraft.SpaceCraft;

public class Level1ObstacleFactory implements Obstaclefactory {
    @Override
    public Asteroids createAsteroids(int score) {
       if(score>500) return new Silicon_Asteroids();
       else return new Ice_Asteroids();
    }

    @Override
    public Debris_Field createDebrisField(int score) {
        if(score>800)return new Persistent_DebrisField();
        else return new Static_DebrisField();
    }

    @Override
    public SpaceCraft createSpaceCraft(int score) {

        return new FighterShips();
    }
}
