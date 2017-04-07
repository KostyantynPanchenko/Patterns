package state;

public class TCPClosed implements TCPConnectionState {

    @Override
    public void open(TCPConnectionContext context) {
        System.out.println("Connection open!");
        context.setState(new TCPOpen());
    }

    @Override
    public void close(TCPConnectionContext context) {
        System.out.println("Already closed.");
    }

    @Override
    public void aknowledge(TCPConnectionContext context) {
        System.out.println("Connection closed.");
    }

}
