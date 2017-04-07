package adapter.gof;

public class ObjectAdapter implements Target {

    private Adaptee adaptee = new Adaptee();
    
    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
