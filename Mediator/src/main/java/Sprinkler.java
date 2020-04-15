/**
 * @author dadongge
 * @date 2020/4/12
 */
public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler(){
        System.out.println("doSprinkler()");
    }
}
