package algorithmStudy.doItJAVA.ch05;

public class GCD {
    public static int gcd(int x, int y) {

        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static int gcdLoop(int a, int b) {
        while (b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public static int gcdArray(int[] a) {
        int gcd = gcdLoop(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            gcd = gcd(gcd, a[i]);
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(180, 92));
        System.out.println(gcdLoop(6, 21));

        int[] gcdArray = new int[]{18, 24, 30, 36, 96};
        //long start = System.nanoTime();
        System.out.println(gcdArray(gcdArray));
        //long end = System.nanoTime();
        //System.out.println(end - start);
    }
}
