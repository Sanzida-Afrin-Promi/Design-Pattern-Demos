package State_Pattern.Concrete_State;

import State_Pattern.Context.TCPConnection;
import State_Pattern.IState.TCPState;

public class Established_State implements TCPState {
    @Override
    public void open(TCPConnection tcpConnection) {
        System.out.println("This is already Established");
    }

    @Override
    public void close(TCPConnection tcpConnection) {
        System.out.println("Closing the connection");
        tcpConnection.setTcpState(new ClosedState());

    }

    @Override
    public void listen(TCPConnection tcpConnection) {
        System.out.println(" Started Listening the Connection");
        tcpConnection.setTcpState(new ListeningState());

    }
}
