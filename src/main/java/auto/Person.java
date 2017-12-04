package auto;

/**
 * Created by Meyttt on 09.11.2017.
 */
public class Person {
    String name;
    String address;
    String age;

    public Person() {
        System.out.println("nope");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName()+": [age: "+getAge()+"; address: "+getAddress()+";]";
    }
}
