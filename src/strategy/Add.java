package strategy;

public class Add implements Strategy {

    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + b);
    }

}
