package cats;

/**
 * Created by Meyttt on 07.11.2017.
 */
public class CatFactory {
    public PrettyCat getPrettyCat(){return new PrettyCat();}
    public static SimpleCat getSimpleCat(){return new SimpleCat();}
    public static SmartCat getSmartCat(){return new SmartCat();}
}
