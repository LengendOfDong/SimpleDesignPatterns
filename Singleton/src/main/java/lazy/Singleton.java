package lazy;

/**
 * 确保一个类只有一个实例，并提供该实例的全局访问点
 * 1.懒汉式，线程不安全
 * @author dadongge
 * @date 2020/4/11
 */
public class Singleton {
    //被延迟实例化，这样没有用到该类，那么就不会实例化uniqueInstance,从而节约资源
    private static Singleton uniqueInstance;

    //这个是必须的，限定获取实例的路径不能通过构造函数获取
    private Singleton(){

    }

    //获取实例的方式只能通过公有静态函数
    //多线程环境下是不安全的，有多个线程同时进入，则会实例化多次uniqueInstance
    public static Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
