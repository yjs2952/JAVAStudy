package algorithmStudy.doItJAVA.ch01;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최대값 구하기");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++) {
            height[i] = 100 + r.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }
}
