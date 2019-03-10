package algorithmStudy.book1.ch01;

import java.util.HashMap;
import java.util.Map;

public class MemoizationExample {

    private static Map<String, Long> map = new HashMap<>();

    private static long choose1(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }

        return choose1(n - 1, r - 1) + choose1(n - 1, r);
    }

    private static long choose2(int n, int r) {

        if (n == 0 || n == r) {
            return 1;
        }

        if (map.get(String.valueOf(n) + r) != null) {
            return map.get(String.valueOf(n) + r);
        }

        map.put(String.valueOf(n) + r, choose2(n - 1, r - 1) + choose2(n - 1, r));
        return map.get(String.valueOf(n) + r);
    }

    public static void main(String[] args) {
        System.out.println(choose1(20, 10));
        System.out.println(choose2(20, 10));
    }
}
