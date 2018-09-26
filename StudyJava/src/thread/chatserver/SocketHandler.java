package thread.chatserver;

import java.io.*;
import java.net.Socket;

public class SocketHandler extends Thread {

    private ChatServer chatServer;
    private Socket socket;
    private String name;

    public SocketHandler(ChatServer chatServer, Socket socket) {
        this.chatServer = chatServer;
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("SocketHandler Start!");

        BufferedReader is = null;
        PrintWriter os = null;

        try {
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            this.name = is.readLine();
            chatServer.broadcast(name + "님이 입장 하셨습니다.");

            chatServer.addPrinterWriter(os);

            String line = null;
            while ((line = is.readLine()) != null) {
                chatServer.broadcast(this.name + " : " + line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chatServer.removePrinterWriter(os);
            chatServer.broadcast(name+"님이 퇴장 하셨습니다.");
            System.out.println("Chat Handler finally");
            try {
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
