package thread.chat;

import thread.chatserver.ChatServer;

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
        //System.out.println("이름 입력");
        System.out.println("socket handler 시작");
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                out.println(line);
                out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { in.close(); } catch (Exception e) {}
            try { out.close(); } catch (Exception e) {}
        }
    }
}

