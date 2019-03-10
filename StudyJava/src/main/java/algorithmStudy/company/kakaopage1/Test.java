package algorithmStudy.company.kakaopage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Test {

    private static int[] memoization = new int[10000];

    private static int nextFibNum(int num) {

        for (int i = 0; i <= 60; i++) {
            int result = fib(i);
            if (result > num) {
                return result;
            }
        }
        return 0;
    }

    private static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        if (memoization[n] != 0) {
            return memoization[n];
        } else {
            memoization[n] = fib(n - 1) + fib(n - 2);
            return memoization[n];
        }
    }

    private static void p2(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nextFibNum(arr[i]));
        }
    }

    private static void p3(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (!Character.isLetterOrDigit(ch)) {
                    if (j + 1 < str.length() && Character.isLetterOrDigit(str.charAt(j + 1)))
                        sb.append(" ");
                } else {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }

    private static void p4(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split(" ");
            Arrays.sort(strArr, Collections.reverseOrder());

            result[i] = "";

            for (int j = 0; j < strArr.length; j++) {
                if (j < strArr.length - 1) {
                    result[i] += strArr[j] + " ";
                } else {
                    result[i] += strArr[j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] intArray(BufferedReader br) throws IOException{
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        return numbers;
    }

    private static void p5(BufferedReader br) throws IOException {
        int[] arr1 = intArray(br);
        int[] arr2 = intArray(br);

        int p = 0;
        int q = 0;

        StringBuilder sb = new StringBuilder();

        while (p < arr1.length && q < arr2.length) {
            if (arr1[p] < arr2[q]) {
                sb.append(arr1[p++]);
                sb.append(" ");
            } else if (arr1[p] > arr2[q]){
                sb.append(arr2[q++]);
                sb.append(" ");
            }
        }

        while (p < arr1.length) {
            sb.append(arr1[p++]);
            sb.append(" ");
        }

        while (q < arr2.length) {
            sb.append(arr2[q++]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }

    private static void p6(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] strArr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        boolean isSmooth = true;

        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) > 1) {
                isSmooth = false;
                System.out.println("NO");
                break;
            }
        }

        if (isSmooth) {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //p2(br);
        //p3(br);
        //p4(br);
        //p5(br);
        p6(br);
    }
}
