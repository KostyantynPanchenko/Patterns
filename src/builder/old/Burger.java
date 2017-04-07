package builder.old;

public abstract class Burger extends Food {

    @Override
    Packing getPacking() {
        return new Wrapper();
    }
}
