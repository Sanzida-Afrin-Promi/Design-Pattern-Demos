package Factory_Pattern;

public class AfricanScenerioFactory implements ScenerioFactory{
    @Override
    public Scenerio create() {
        return new AfricanScenerio();
    }
}
