package cats;

/**
 * Created by Meyttt on 07.11.2017.
 */
public class SmartCat implements Cat {
    @Override
    public void sayMeow() {
        System.out.println("Cat says \"Hello, world!\"");
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Cat says \"I`m too smart to do this!!\"");
    }
}
