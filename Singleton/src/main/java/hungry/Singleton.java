package hungry;

/**
 * 饿汉式-线程安全
 * 线程不安全问题主要是由于uniqueInstance被实例化多次，采取直接实例化uniqueInstance
 * 的方式不会产生线程不安全的问题
 * @author dadongge
 * @date 2020/4/11
 */
public class Singleton {
    //直接实例化丢失了延迟实例化带来的节约资源的好处
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){

    }

    private static Singleton getUniqueInstance(){
        return uniqueInstance;
    }
}
