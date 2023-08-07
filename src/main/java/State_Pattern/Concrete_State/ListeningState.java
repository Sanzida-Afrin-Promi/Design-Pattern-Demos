package State_Pattern.Concrete_State;

import State_Pattern.Context.TCPConnection;
import State_Pattern.IState.TCPState;

public class ListeningState implements TCPState {
    @Override
    public void open(TCPConnection tcpConnection) {
        System.out.println("Already Open");

    }

    @Override
    public void close(TCPConnection tcpConnection) {
        System.out.println("Closing the connection");
        tcpConnection.setTcpState(new ClosedState());

    }

    @Override
    public void listen(TCPConnection tcpConnection) {
        System.out.println("Already Listening");

    }
}
