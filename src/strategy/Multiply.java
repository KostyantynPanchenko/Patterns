package strategy;

public class Multiply implements Strategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a * b);
    }

}
