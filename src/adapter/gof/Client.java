package adapter.gof;

public class Client {
    public static void main(String... args) {
        Target adapter = new Adapter();
        adapter.request();
        
        Target objectAdapter = new ObjectAdapter();
        objectAdapter.request();
    }

}
