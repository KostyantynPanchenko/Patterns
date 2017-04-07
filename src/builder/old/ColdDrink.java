package builder.old;

public abstract class ColdDrink extends Food {

    @Override
    Packing getPacking() {
        return new Bottle();
    }
}
