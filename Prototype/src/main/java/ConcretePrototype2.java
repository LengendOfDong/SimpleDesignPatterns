/**
 * @author dadongge
 * @date 2020/4/12
 */
public class ConcretePrototype2 extends  Prototype{
    private Person person;

    public ConcretePrototype2(Person person){
        this.person = person;
    }


    @Override
    Prototype myClone() {
        return new ConcretePrototype2(new Person(person.getName(),person.getAge()));
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "person.name =" + person.getName() +
                '}';
    }
}
