package State_Pattern.Context;

import State_Pattern.Concrete_State.ClosedState;
import State_Pattern.IState.TCPState;

public class TCPConnection {
    private TCPState tcpState = new ClosedState();

     public void setTcpState(TCPState tcpState){
        this.tcpState=tcpState;
    }
    public void open()
    {
        tcpState.open(this);
    }
    public void close()
    {
        tcpState.close(this);
    }
     public void listen()
    {
        tcpState.listen(this);
    }

}
