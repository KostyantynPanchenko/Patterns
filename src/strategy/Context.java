package strategy;

public class Context {

    private Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void executeStrategy(int a, int b) {
        strategy.performOperation(a, b);
    }
}
