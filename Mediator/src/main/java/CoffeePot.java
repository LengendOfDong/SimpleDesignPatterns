/**
 * @author dadongge
 * @date 2020/4/12
 */
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot(){
        System.out.println("doCoffeePot()");
    }
}
