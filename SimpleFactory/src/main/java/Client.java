/**
 * @author dadongge
 * @date 2020/4/11
 */
public class Client {
    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        //do something with the product
    }
}
