/**
 * @author dadongge
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for(int i = 0; i < count; i++){
            sb.append((char)('a' + i));
        }
        System.out.println(sb.toString());
    }
}
