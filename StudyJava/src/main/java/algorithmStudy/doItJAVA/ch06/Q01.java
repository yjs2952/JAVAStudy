package algorithmStudy.doItJAVA.ch06;

import java.util.Scanner;

public class Q01 {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = 0;
        temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void sort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        sort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
