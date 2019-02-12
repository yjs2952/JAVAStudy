package algorithmStudy.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1 {


    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        String[] strArr2 = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(strArr2[i]);
        }

        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr1);

        for (int num : arr2) {
            if (Arrays.binarySearch(arr1, num) >= 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        br.close();
    }
}
