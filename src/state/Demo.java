package state;

public class Demo {

    public static void main(String[] args) {
        TCPConnectionContext context = new TCPConnectionContext();
        TCPConnectionState state = new TCPClosed();        
        
        context.setState(state);
        context.open();
        context.open();
        context.aknowledge();
        context.open();
        context.close();
        context.close();
    }

}
