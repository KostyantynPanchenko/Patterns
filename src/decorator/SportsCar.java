package decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }
    
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding sports car features.");
    }

}
