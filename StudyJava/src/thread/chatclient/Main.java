package thread.chatclient;

public class Main {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient(11004, "127.0.0.1");
        chatClient.start();
    }
}
