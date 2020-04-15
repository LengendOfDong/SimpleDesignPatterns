package factory;

import product.ConcreteProduct;
import product.Product;

/**
 * @author dadongge
 * @date 2020/4/11
 */
public class ConcreteFactory extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
