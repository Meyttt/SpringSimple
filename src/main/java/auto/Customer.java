package auto;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Meyttt on 09.11.2017.
 */
public class Customer {
    private Person person;
    private int type;
    private String action;

    public Customer() {
    }

    public Person getPerson() {
        return person;
    }
    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return getPerson()+": [action: "+getAction()+"; type: "+getType()+"];";
    }

}
