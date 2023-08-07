package Factory_Pattern;

public class AmericanScenerioFactory implements ScenerioFactory {
    @Override
    public Scenerio create() {
      return new AmericanScenerio();
    }
}
