package enum_impl;

/**
 * 该实现可以防止反射攻击。在其它实现中，通过setAccessible()方法可以将私有构造函数的访问级别
 * 设置成public,然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止
 * 多次实例化的代码。该实现是由JVM保证只会实例化一次，因此不会出现上述的反射攻击。
 *
 * 该实现在多次序列化和序列化之后，不会得到多个实例。而其他实现需要使用transient 修饰所有字段，
 * 并且实现序列化和反序列化的方法。
 * @author dadongge
 * @date 2020/4/11
 */

public enum Singleton {
    //单例的实例
    INSTANCE;

    private String objName;

    public String getObjName(){
        return objName;
    }

    public void setObjName(String objName){
        this.objName = objName;
    }

    public static void main(String[] args){
        Singleton singleton = Singleton.INSTANCE;
        singleton.setObjName("123");
        Singleton singleton1 = Singleton.INSTANCE;
        singleton1.setObjName("234");
        System.out.println(singleton.getObjName());
        System.out.println(singleton1.getObjName());
        Singleton[] enumConstants = Singleton.class.getEnumConstants();
        for(Singleton enumConstant : enumConstants){
            System.out.println(enumConstant.getObjName());
        }
    }
}
