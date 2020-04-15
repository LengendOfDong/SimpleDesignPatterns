import java.util.StringTokenizer;

/**
 * @author dadongge
 * @date 2020/4/12
 */
public class TerminalExpression extends Expression {
    private String literal = null;

    public TerminalExpression(String str){
        literal = str;
    }

    @Override
    public boolean interpret(String str){
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            String test = st.nextToken();
            if(test.equals(literal)){
                return true;
            }
        }
        return false;
    }


}
