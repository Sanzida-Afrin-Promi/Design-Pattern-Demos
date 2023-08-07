package Factory_Pattern;

public class AsianScenerio implements Scenerio {
    String Asiantree="Mango Tree";
    String AsianAnimal = "Bengal Tiger";
    String AsianTerrain= "Asian Terrain";
    @Override
    public void draw() {
        for(int i=0;i<5;i++)
            System.out.println(Asiantree);
        for(int i=0;i<2;i++) System.out.println(AsianAnimal);
        System.out.println(AsianTerrain);

    }
}
