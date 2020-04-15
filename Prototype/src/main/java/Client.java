/**
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args){
        Prototype prototype = new ConcretePrototype("abc");
        Prototype prototype1 = prototype.myClone();
        System.out.println(prototype1.toString());

        Person person = new Person("zd","18");
        Prototype prototype2 = new ConcretePrototype2(person);
        Prototype prototype3 = prototype2.myClone();
        System.out.println(prototype3.toString());
        person.setName("zw");
        System.out.println(prototype3.toString());
    }
}
