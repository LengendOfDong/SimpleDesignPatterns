/**
 * 集中相关对象之间复杂的沟通和控制方式
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);
        //闹钟时间到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);
    }
}
