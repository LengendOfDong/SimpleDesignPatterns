/**
 * 将命令封装在对象中，具有以下作用：
 * 1.使用命令来参数化其他对象（可以利用多态，List<Command>）
 * 2.将命令放入队列中进行排队(利用多态方式，lightOnCommand和LightOffCommand都可以放入同一个队列中进行排队)
 * 3.将命令的操作记录到日志中(命令接口中可以加入log())
 * 4.支持可撤销的操作（命令接口中可以加入quit()）
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        invoker.setOnCommand(lightOnCommand, 0);
        invoker.setOffCommand(lightOffCommand, 0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
