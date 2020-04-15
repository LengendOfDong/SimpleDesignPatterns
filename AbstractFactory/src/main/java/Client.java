/**
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractFactory abstractFactory2 = new ConcreteFactory2();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        AbstractProductA productA1 = abstractFactory2.createProductA();
        AbstractProductB productB1 = abstractFactory2.createProductB();
        //do something
    }
}
