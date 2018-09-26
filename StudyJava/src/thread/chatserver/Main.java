package thread.chatserver;

public class Main {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(11004);
        chatServer.start();
    }
}
