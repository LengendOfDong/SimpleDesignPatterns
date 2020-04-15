import java.util.Arrays;

/**
 * @author dadongge
 * @date 2020/4/12
 */
public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder(){
        super(16);
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
