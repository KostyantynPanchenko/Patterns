package state;

public interface TCPConnectionState {

    void open(TCPConnectionContext context);
    void close(TCPConnectionContext context);
    void aknowledge(TCPConnectionContext context);
}
