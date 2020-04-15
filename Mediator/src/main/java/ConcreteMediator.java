/**
 * @author dadongge
 * @date 2020/4/12
 */
public class ConcreteMediator extends Mediator {
    private Alarm alarm;

    private CoffeePot coffeePot;

    private Calender calender;

    private Sprinkler sprinkler;

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calender calender, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.calender = calender;
        this.coffeePot = coffeePot;
        this.sprinkler = sprinkler;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            default:
                doSprinkleEvent();
        }
    }

    public void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doCoffeePotEvent() {
        coffeePot.doCoffeePot();
        alarm.doAlarm();
        calender.doCalender();
    }

    public void doCalenderEvent() {
        calender.doCalender();
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        sprinkler.doSprinkler();
    }

    public void doSprinkleEvent() {
        sprinkler.doSprinkler();
        alarm.doAlarm();
        calender.doCalender();
    }
}
