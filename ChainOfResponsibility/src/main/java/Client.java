/**
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这些对象连城一条链，并沿着这条链发送请求，知道一个对象处理它为止
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args){
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1(null);
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2(concreteHandler1);
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3(concreteHandler2);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        concreteHandler3.handleRequest(request1);

        Request request2 = new Request(RequestType.TYPE2, "request2");
        concreteHandler3.handleRequest(request2);

        Request request3 = new Request(RequestType.TYPE3, "request3");
        concreteHandler3.handleRequest(request3);
    }
}
