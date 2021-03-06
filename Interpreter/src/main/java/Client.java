/**
 * D And (A Or (B Or C))
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static Expression buildInterpreterTree(){
        //Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");
        //B Or C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        //A Or (B Or C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        //D And (A Or (B Or C))
        return new AndExpression(terminal4, alternation2);
    }

    public static void main(String[] args){
        Expression define = buildInterpreterTree();
        String context1 = "D A";
        String context2 = "A B";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));

    }
}
