package algorithmStudy.company.tmon;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    //static String[] memoi = new String[10000];
    private static Map<Integer, String> map = new HashMap<>();

    private static String solution(int num, int n) {
        int p = num / n;
        int q = num % n;

        String str = "0123456789ABCDEF";

         if (map.containsKey(num)) {
             return map.get(num);
         }else {
             if (p == 0) {
                 String temp = String.valueOf(str.charAt(q));
                 map.put(num, temp);
                 return temp;
             } else {
                 String temp = solution(p, n) + str.charAt(q);
                 map.put(num, temp);
                 return temp;
             }
         }
    }

    private static String method(int num, int n) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            if ((num % n) < 10) {
                sb.insert(0, num % n);
            } else {
                sb.insert(0, (char) (num % n + 55));
            }
            num /= n;
        }
        return sb.toString();
    }

    private static int countBits(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) count++;
            num /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(1236126387, 16));
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println();

        start = System.nanoTime();
        System.out.println(method(1236126387, 16));
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println(countBits(7));
    }
}
