package thread.chatserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ChatServer extends Thread {

    private int port;
    private Set<PrintWriter> clientOutputSet = null;

    public ChatServer(int port) {
        this.port = port;
        this.clientOutputSet = new CopyOnWriteArraySet<>();
    }

    public void addPrinterWriter(PrintWriter out){
        clientOutputSet.add(out);
    }

    public void removePrinterWriter(PrintWriter out){
        clientOutputSet.remove(out);
    }

    public void broadcast(String msg) {
        for (PrintWriter out : clientOutputSet) {
            try {
                out.println(msg);
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        System.out.println("소켓 연결 대기중");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("연결 수락 : " +isa.getHostName());

                SocketHandler socketHandler = new SocketHandler(this, socket);
                socketHandler.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { serverSocket.close(); } catch (IOException e) {}
        }
    }
}