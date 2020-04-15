package lazysafe;

/**
 * @author dadongge
 * @date 2020/4/11
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){

    }

    //性能问题，不推荐使用
    public static synchronized Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
