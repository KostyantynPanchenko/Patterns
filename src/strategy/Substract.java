package strategy;

public class Substract implements Strategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a - b);
    }

}
