package algorithmStudy.doItJAVA.ch01;

/**
 * 배열 복제
 */
public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a.clone();

        b[3] = 0;

        System.out.print("a = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + a[i]);
        }

        System.out.print("\nb = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
    }
}
