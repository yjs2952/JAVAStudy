package algorithmStudy.book1.ch01;

public class Factorial {

    private static int factorial1(int n) {

        int r = 1;

        for (int i = 2; i <= n; i++) {
            r *= i;
        }

        return r;
    }

    private static int factorial2(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial2(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial1(100));
    }
}
