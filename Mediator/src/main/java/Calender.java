/**
 * @author dadongge
 * @date 2020/4/12
 */
public class Calender extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender(){
        System.out.println("doCalender()");
    }
}
