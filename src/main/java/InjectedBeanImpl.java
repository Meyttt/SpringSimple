/**
 * Created by Meyttt on 06.11.2017.
 */
public class InjectedBeanImpl implements InjectedBean {
    @Override
    public void doSmth(String name) {
        System.out.println("Hello in bean, "+name+"!");
    }
}
