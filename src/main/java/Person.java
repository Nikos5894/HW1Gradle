import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;
    private String surName;


}

class Main{

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mykola");
        person.setSurName("Osadchuk");
        System.out.println(person.getName() + " | " + person.getSurName());

    }
}
