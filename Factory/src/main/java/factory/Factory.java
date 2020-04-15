package factory;

import product.Product;

/**
 * @author dadongge
 * @date 2020/4/11
 */
public abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething(){
        Product product = factoryMethod();
        //dosomething with the product
    }
}

