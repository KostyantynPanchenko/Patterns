package strategy;

public class Demo {

    public static void main(String[] args) {
        
        Context context = new Context(new Add());
        context.executeStrategy(10, 5);
        
        context = new Context(new Substract());
        context.executeStrategy(10, 5);
        
        context = new Context(new Multiply());
        context.executeStrategy(10, 5);
    }

}
