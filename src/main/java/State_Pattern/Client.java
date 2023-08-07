package State_Pattern;

import State_Pattern.Context.TCPConnection;

public class Client {
    public static void main(String args[]){
        TCPConnection tcpConnection=new TCPConnection();
        tcpConnection.open();
        tcpConnection.open();
        tcpConnection.listen();
        tcpConnection.open();
        tcpConnection.close();
        tcpConnection.listen();
        tcpConnection.open();
        tcpConnection.listen();
        tcpConnection.listen();
    }
}
