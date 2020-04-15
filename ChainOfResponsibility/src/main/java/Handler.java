/**
 * @author dadongge
 * @date 2020/4/12
 */
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor){
        this.successor = successor;
    }

    protected  abstract void handleRequest(Request request);
}
