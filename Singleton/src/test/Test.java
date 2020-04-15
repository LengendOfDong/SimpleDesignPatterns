import com.sun.xml.internal.ws.encoding.soap.streaming.SOAPNamespaceConstants;

/**
 * 1.先初始化父类静态代码块
 * 2.再初始化子类静态代码块
 * 3.初始化父类非静态代码块
 * 4.初始化子类非静态代码块
 * 5.非静态方法
 * 注：
 * 1.非静态内部类中不能写静态类型数据包括静态块以及静态变量
 * 2.静态类初始化一次之后就不会在初始化
 * 3.静态内部类以及非静态内部类都是在调用时才初始化
 * 4.如果只调用静态成员，则只初始化静态变量，静态块，而不会去初始化非静态元素
 * @author dadongge
 * @date 2020/4/11
 */
class Father{
    static int a = 100;
    int b = 2;

    static{
        System.out.println("这是父类静态代码块" + a);
        a = 10;
    }

    {
        System.out.println("这是父类非静态代码块" + a);
    }

    void f(){
        System.out.println("这是父类非静态方法" + b);
    }

    static void f2(){
        System.out.println("这是父类静态方法" + a);
    }

    static class inner1{
        static{
            System.out.println("这是父类静态内部类静态块" + a);
        }

        {
            System.out.println("这是父类静态内部类非静态块" + a);
        }
    }

    class inner2{
        int n = 5;
        {
            System.out.println("这是父类非静态内部类的非静态代码块" + n);
        }
    }

}

class Son extends Father{
    static int c = 100;
    int d = 3;

    static{
        System.out.println("这是子类静态代码块" + a);
        a = 10;
    }

    {
        System.out.println("这是子类非静态代码块" + a);
    }

    void f(){
        System.out.println("这是子类非静态方法" + b);
    }

    static void f2(){
        System.out.println("这是子类静态方法" + a);
    }

    static class inner1{
        static int t = 30;
        static{
            System.out.println("这是子类静态内部类静态块" + c);
        }

        {
            System.out.println("这是子类静态内部类非静态块" + a);
        }
    }

    class inner2{
        int m = 4;
        {
            System.out.println("这是子类非静态内部类的非静态代码块" + m);
        }
    }
}


public class Test {
    public static void main(String[] args){
        Son son = new Son();
        son.f();
        System.out.println("===========================");
        new Son().new inner2();
        System.out.println("===========================");
        System.out.println(Son.inner1.t);
        System.out.println("===========================");
        new Son.inner1();
        System.out.println("===========================");
        System.out.println(Son.inner1.t);
        System.out.println("===========================");
        System.out.println(new Son().new inner2().m);
        System.out.println("===========================");
        new Father().new inner2();
        System.out.println("===========================");
        new Father.inner1();
        System.out.println("===========================");
    }
}
