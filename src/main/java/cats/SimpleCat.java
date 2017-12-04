package cats;

/**
 * Created by Meyttt on 07.11.2017.
 */
public class SimpleCat implements Cat{
    @Override
    public void sayMeow() {
        System.out.println("Car's asking for food!");
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Car's asking for food!");
    }
}
