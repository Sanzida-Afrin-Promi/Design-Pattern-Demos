package Abstract_Factory.Concrete_Factory;

import Abstract_Factory.Abstract_factory.Obstaclefactory;
import Abstract_Factory.Concrete_Product.Asteroids.*;
import Abstract_Factory.Concrete_Product.Debris_Field.Debris_Field;
import Abstract_Factory.Concrete_Product.Debris_Field.Dynamic_DebrisField;
import Abstract_Factory.Concrete_Product.Debris_Field.Persistent_DebrisField;
import Abstract_Factory.Concrete_Product.SpaceCraft.AttackDrones;
import Abstract_Factory.Concrete_Product.SpaceCraft.Bombers;
import Abstract_Factory.Concrete_Product.SpaceCraft.SpaceCraft;

public class Level2ObstacleFactory implements Obstaclefactory {
    @Override
    public Asteroids createAsteroids(int score) {
        if(score>500) return new Ion_asteroids();
        else return new Rocky_Asteroids();

    }

    @Override
    public Debris_Field createDebrisField(int score) {
        if(score>1000) return new Dynamic_DebrisField();
        else return new Persistent_DebrisField();
    }

    @Override
    public SpaceCraft createSpaceCraft(int score) {
        if(score>1000) return new Bombers();
        else return new AttackDrones();
    }
}
