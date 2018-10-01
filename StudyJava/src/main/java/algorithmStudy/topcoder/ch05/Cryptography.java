package algorithmStudy.topcoder.ch05;

import java.util.Arrays;

public class Cryptography {
    public static long encrypt(int[] numbers) {
        // 가장 작은 수를 찾아라
        // 그리고 1 더하라
        //int minIndex = 0;
        //int min = 1000;
        long result = 1L;
        /*for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (min == 1) {
                break;
            }
        }*/

        Arrays.sort(numbers);
        numbers[0]++;

        //result = min + 1;

        // 작은 수 + 1과 모든 요소를 곱하라
        for (int i = 0; i < numbers.length; i++) {
            if (/*i == minIndex || */numbers[i] == 1) {
                continue;
            }
            result *= numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encrypt(new int[]{1, 2, 3}));
        System.out.println(encrypt(new int[]{1, 3, 2, 1, 1, 3}));
        System.out.println(encrypt(new int[]{1000, 999, 998, 997, 996, 995}));
    }
}
