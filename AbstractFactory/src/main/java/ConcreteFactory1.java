/**
 * @author dadongge
 * @date 2020/4/12
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
