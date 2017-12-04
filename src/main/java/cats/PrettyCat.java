package cats;

/**
 * Created by Meyttt on 07.11.2017.
 */
public class PrettyCat implements Cat {
    @Override
    public void sayMeow() {
        System.out.println("Cat cute meows > W <");
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Cat cute lies and looks at you ");
        System.out.println("nope");

    }
}