package thread.chatclient;

import java.io.*;
import java.net.Socket;

public class ChatClient extends Thread {

    private int port;
    private String ip;
    private String name;

    public ChatClient(int port, String ip) {
        this.port = port;
        this.ip = ip;
    }

    @Override
    public void run() {
        Socket socket = null;
        BufferedReader in = null;
        BufferedReader keyboard = null;
        PrintWriter out = null;

        try {
            socket = new Socket(ip, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println("이름을 입력하세요 : ");
            this.name = in.readLine();

            out.println(name);
            out.flush();

            InputHandler handler = new InputHandler(in);
            handler.start();

            String line = null;
            while ((line = keyboard.readLine()) != null) {
                out.println(line);
                out.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
            try {
                keyboard.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
