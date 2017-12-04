package auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Meyttt on 09.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("auto.xml");
        Customer customer = (Customer) applicationContext.getBean("customerBean");
        System.out.println(customer);

    }
}
