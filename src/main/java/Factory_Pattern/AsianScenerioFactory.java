package Factory_Pattern;

public class AsianScenerioFactory implements ScenerioFactory{
    @Override
    public Scenerio create() {
        return new AsianScenerio();
    }
}
