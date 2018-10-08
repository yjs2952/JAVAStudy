package algorithmStudy.doItJAVA.ch06;

import java.util.Scanner;

public class BubbleSort2 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //  더 이상 교환이 일어나지 않을 경우 남은 반복문을 돌지 않고 빠져 나간다.
    static void bubleSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            }
            if (exchg == 0) {
                break;
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

        bubleSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
