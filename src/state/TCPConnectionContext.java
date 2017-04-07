package state;

public class TCPConnectionContext {

    private TCPConnectionState state;
    
    public void open() {
        state.open(this);
    }
    
    public void close() {
        state.close(this);
    }
    
    public void aknowledge() {
        state.aknowledge(this);
    }

    public TCPConnectionState getState() {
        return state;
    }

    public void setState(TCPConnectionState state) {
        this.state = state;
    }
    
}
