package thread;

import java.awt.*;

public class BeepPrintExample03 {
    public static void main(String[] args) {
        Thread t = new BeepThread();
        //t.start();

        Thread t1 = new Thread() {
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
        };

        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
