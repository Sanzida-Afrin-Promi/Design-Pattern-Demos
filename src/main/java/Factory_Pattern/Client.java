package Factory_Pattern;

public class Client {
    public static void main(String args[]){

        ScenerioFactory factory;

        factory=new AsianScenerioFactory();
        Scenerio scenerio1= factory.create();
        scenerio1.draw();
        System.out.println();

        factory=new AfricanScenerioFactory();
        Scenerio scenerio2= factory.create();
        scenerio2.draw();
        System.out.println();

        factory=new AmericanScenerioFactory();
        Scenerio scenerio3= factory.create();
        scenerio3.draw();
    }
}
