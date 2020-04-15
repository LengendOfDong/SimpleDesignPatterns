package innerclass;

/**
 * 静态内部类
 * @author dadongge
 * @date 2020/4/11
 */
public class Singleton {

    private Singleton(){

    }

    private static class SingletonHolder{
        private static Singleton INSTANCE = new Singleton();
    }

    private static Singleton getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}
