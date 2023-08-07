package State_Pattern.IState;

import State_Pattern.Context.TCPConnection;

public interface TCPState {
    void open(TCPConnection tcpConnection);
    void close(TCPConnection tcpConnection);
    void listen(TCPConnection tcpConnection);
}
