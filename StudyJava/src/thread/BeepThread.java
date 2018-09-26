package thread;

import java.awt.*;

public class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit t = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            t.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
