package algorithmStudy.doItJAVA.ch01;

import java.util.Scanner;

class Median {

    public static final int COUNT = 3;

    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vals = new int[COUNT];
        System.out.println("세 정수의 중앙값을 구합니다.");
        for (int i = 0; i < COUNT; i++) {
            vals[i] = sc.nextInt();
        }

        System.out.println("중앙값은 " + med3(vals[0], vals[1], vals[2]) + " 입니다.");
    }
}


