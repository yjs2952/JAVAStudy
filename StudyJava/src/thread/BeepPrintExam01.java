package thread;

public class BeepPrintExam01 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread t2 = new Thread(() -> {

        });
    }
}
