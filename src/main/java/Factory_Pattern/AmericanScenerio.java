package Factory_Pattern;

public class AmericanScenerio implements Scenerio {
    String americanTree="Red maple Tree";
    String americanAnimal ="Red Fox";
    String americanTerrain="American Terrain";

    @Override
    public void draw() {
        for(int i=0;i<5;i++)
        System.out.println(americanTree);
        for(int i=0;i<2;i++) System.out.println(americanAnimal);
        System.out.println(americanTerrain);

    }
}
