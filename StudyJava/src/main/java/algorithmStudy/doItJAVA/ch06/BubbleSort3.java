package algorithmStudy.doItJAVA.ch06;

import java.util.Scanner;

public class BubbleSort3 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 교환이 한번 일어날 때 마다 마지막에 교환한 자리는 이미 정렬이 되었으므로 무시하고 반복한다.
    // 더 이상 교환할 게 없으면 반복문을 빠져나간다.
    static void bubleSort(int a[], int n) {
        int k = 0;
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
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
