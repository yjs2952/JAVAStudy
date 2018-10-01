package thread;

public class BeepPrintExample02 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread t1 = new Thread(beepTask);
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
