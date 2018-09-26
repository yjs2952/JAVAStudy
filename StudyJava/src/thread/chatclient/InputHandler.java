package thread.chatclient;

import java.io.BufferedReader;
import java.io.IOException;

public class InputHandler extends Thread {

    BufferedReader in;

    public InputHandler(BufferedReader in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
