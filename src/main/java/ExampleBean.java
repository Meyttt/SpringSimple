/**
 * Created by Meyttt on 06.11.2017.
 */
public class ExampleBean {
    public void setInjectedBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
        System.out.println("injection in constructor!");
    }

    private InjectedBean injectedBean;

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    //injectedBean will injected in constructor
    public void callMe(){
        injectedBean.doSmth(name);
    }
}
