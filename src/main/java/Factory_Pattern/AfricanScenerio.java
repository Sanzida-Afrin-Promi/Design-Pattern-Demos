package Factory_Pattern;

public class AfricanScenerio implements Scenerio{
    String africanTree="Adansonia Digitata Tree";
    String africanAnimal ="African Buffalo";
    String africanTerriain ="African Terrian";

    @Override
    public void draw() {
        for(int i=0;i<5;i++)
            System.out.println(africanTree);
        for(int i=0;i<2;i++) System.out.println(africanAnimal);
        System.out.println(africanTerriain);

    }
}
