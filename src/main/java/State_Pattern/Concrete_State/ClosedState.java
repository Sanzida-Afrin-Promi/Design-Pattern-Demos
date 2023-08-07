package State_Pattern.Concrete_State;

import State_Pattern.Context.TCPConnection;
import State_Pattern.IState.TCPState;

public class ClosedState implements TCPState {
    @Override
    public void open(TCPConnection tcpConnection) {
        System.out.println("Opening the connection");
        tcpConnection.setTcpState(new Established_State());
    }

    @Override
    public void close(TCPConnection tcpConnection) {
        System.out.println("Already in Closed State");

    }

    @Override
    public void listen(TCPConnection tcpConnection) {
        System.out.println("Can't Listen.It's not opened yet");

    }
}
