package adapter.gof;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }

}
