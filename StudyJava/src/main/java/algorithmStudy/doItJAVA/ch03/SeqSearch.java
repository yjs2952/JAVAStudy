package algorithmStudy.doItJAVA.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SeqSearch {
    // 요소수가 n 인 배열 a에서 key와 같은 요소를 선형 검색합니다.
    /*static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }*/

    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("검사할 값 : ");
        int key = sc.nextInt();
        int idx = seqSearch(x, num, key);

        if (idx == -1) {
            System.out.println("일치하는 값이 없다.");
        } else {
            System.out.println(key + "는 x[" + idx + "]에 있습니다.");
        }
    }
}
