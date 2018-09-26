package algorithmStudy.topcoder.ch01;

public class KiwiJuiceEasyTest {
    public static void main(String[] args) {

        KiwiJuiceEasy kiwi = new KiwiJuiceEasy();
        int[] bottle = kiwi.toPouring(new int[]{30, 20, 10}, new int[]{10, 5, 5}, new int[]{0, 1, 2}, new int[]{1, 2, 0});

        for (int i = 0; i < bottle.length; i++) {
            System.out.println(bottle[i]);
        }
    }
}
