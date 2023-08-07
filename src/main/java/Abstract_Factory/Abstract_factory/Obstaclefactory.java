package Abstract_Factory.Abstract_factory;

import Abstract_Factory.Concrete_Product.Asteroids.Asteroids;
import Abstract_Factory.Concrete_Product.Debris_Field.Debris_Field;
import Abstract_Factory.Concrete_Product.SpaceCraft.SpaceCraft;

public interface Obstaclefactory {
    Asteroids createAsteroids(int score);
    Debris_Field createDebrisField(int score);
    SpaceCraft createSpaceCraft(int score);
}
