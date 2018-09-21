package my.examples.miniwas;

public class MiniWas extends Thread {

    @Override
    public void run() {
        Connector conn = new Connector(8080);
        conn.run();
    }
}
