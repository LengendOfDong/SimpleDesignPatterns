/**
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
