package factory;

import product.ConcreteProduct2;
import product.Product;

/**
 * @author dadongge
 * @date 2020/4/11
 */
public class ConcreteFactory2 extends Factory{

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
