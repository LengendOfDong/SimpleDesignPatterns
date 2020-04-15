/**
 * @author dadongge
 * @date 2020/4/12
 */
public enum RequestType {
    //类型1
    TYPE1("1"),
    //类型2
    TYPE2("2"),
    //类型3
    TYPE3("3");

    private String type;

    RequestType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
