package decorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }
    
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding luxury car features .");
    }

}
