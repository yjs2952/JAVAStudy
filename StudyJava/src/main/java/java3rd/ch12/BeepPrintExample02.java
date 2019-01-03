package java3rd.ch12;

import javax.tools.Tool;
import java.awt.*;

public class BeepPrintExample02 {
    public static void main(String[] args) {
        //Runnable beepTask = new BeepTask();
        Thread thread = new Thread( () -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
