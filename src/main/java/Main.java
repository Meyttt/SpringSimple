import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Meyttt on 06.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ExampleBean exampleBean = (ExampleBean) ctx.getBean("exampleBean");
        exampleBean.callMe();
    }


}
