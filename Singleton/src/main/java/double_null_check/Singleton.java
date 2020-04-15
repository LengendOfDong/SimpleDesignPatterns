package double_null_check;

/**
 * uniqueInstance = new Singleton()分为三步执行
 * 1.为uniqueInstance分配内存空间
 * 2.初始化uniqueInstance
 * 3.将uniqueInstance指向分配的内存地址
 * 由于JVM有指令重排序的特性，在多线程时有可能执行顺序的原因导致uniqueInstance还未初始化就返回了（1->3->2）
 * @author dadongge
 * @date 2020/4/11
 */
public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton(){

    }

    private static Singleton getUniqueInstance(){
        //用于判断uniqueInstance有没有实例化
        if(uniqueInstance == null){
            //对实例化部分进行加锁，没有才进行实例化
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
