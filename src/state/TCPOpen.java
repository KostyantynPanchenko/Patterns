package state;

public class TCPOpen implements TCPConnectionState {

    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Already open!");
    }

    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("Connection closed.");
        context.setState(new TCPClosed());
    }

    @Override
    public void aknowledge(TCPConnectionContext context) {
        System.out.println("Open and Listening...");
        context.setState(new TCPListen());
    }

}
