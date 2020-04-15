package factory;

import product.ConcreteProduct1;
import product.Product;

/**
 * @author dadongge
 * @date 2020/4/11
 */
public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
