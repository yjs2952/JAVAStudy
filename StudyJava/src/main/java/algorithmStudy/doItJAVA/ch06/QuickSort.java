package algorithmStudy.doItJAVA.ch06;

import java.util.Scanner;

public class QuickSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right) {
        // 피벗 기준으로 좌 우로 나눈다
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        // 분할정복으로 정렬한다.
        if (left < pr) quickSort(a, left, pr);
        if (right > pl) quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("퀵정렬");
        System.out.print("요소수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            x[i] = sc.nextInt();
        }

        quickSort(x, 0, nx - 1);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println("x["+i+"] = " + x[i]);
        }
    }
}
