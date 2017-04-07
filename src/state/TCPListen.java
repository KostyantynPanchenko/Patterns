package state;

public class TCPListen implements TCPConnectionState {

    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Reopen!");
        context.setState(new TCPOpen());
    }

    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("Connection closed.");
        context.setState(new TCPClosed());
    }

    @Override
    public void aknowledge(TCPConnectionContext context) {
        System.out.println("Already listening...");
    }

}
