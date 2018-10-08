package algorithmStudy.doItJAVA.ch06;

import java.util.Scanner;

public class Q05 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubleSort(int a[], int n) {
        int left = 0;
        int right = n - 1;
        int last = right;

        while (left < right) {
            for (int i = right; i > left; i--) {
                if (a[i] < a[i - 1]) {
                    swap(a, i, i - 1);
                    last = i;
                }
            }
            left = last;

            for (int i = left; i < right; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    last = i;
                }
            }
            right = last;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        bubleSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
