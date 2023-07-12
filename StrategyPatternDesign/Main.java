import StrategyPattern.*;

public class Main {
    Context context1 = new Context(new ConcreteStrategy1());
    Context context2 = new Context(new ConcreteStrategy2());
    
    public static void main(String[] args) {
        Main main = new Main();
        main.context1.execute();
        main.context2.execute();
    }
}
