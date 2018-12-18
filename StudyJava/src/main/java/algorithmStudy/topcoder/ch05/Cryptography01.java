package algorithmStudy.topcoder.ch05;

import java.util.Arrays;

public class Cryptography01 {
    public static long encrypt(int[] numbers) {
        long ret = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for (int i = 0; i < numbers.length; i++) {
            ret *= numbers[i];
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(encrypt(new int[]{1, 1, 1, 1}));
        System.out.println(encrypt(new int[]{1, 2, 3}));
        System.out.println(encrypt(new int[]{1, 3, 2, 1, 1, 3}));
        System.out.println(encrypt(new int[]{1000, 999, 998, 997, 996, 995}));
    }
}
