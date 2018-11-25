package algorithmStudy.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String rule = null;
        String a = null;
        String b = null;

        try {
            rule = in.readLine();
            a = in.readLine();
            b = in.readLine();
        } catch (IOException ie) {
            ie.printStackTrace();
        }

        System.out.println(solution(rule, a, b));

    }

    public static String solution(String rule, String A, String B) {
        int n = rule.length();
        char[] arr = rule.toCharArray();

        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();

        int a = 0;
        int b = 0;

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arrA[i] == arr[j]) {

                    a += ((j) * Math.pow(n, (arrA.length - i - 1)));
                    break;
                }
            }

            if (i >= arrB.length) {
                continue;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arrB[i] == arr[j]) {
                    b += ((j) * Math.pow(n, (arrB.length - i - 1)));
                    break;
                }
            }
        }

        return jinsuConverter(a - b, n, arr);
    }

    public static String jinsuConverter(int num, int n, char[] rule) {
        String str = "";
        while (true) {
            if (num % n == num) {
                str += num;
                break;
            } else {
                str += num % n;
                num = num / n;
            }
        }

        System.out.println(str);

        String result = "";

        char[] jnum = str.toCharArray();
        for (int i = jnum.length - 1; i >= 0; i--) {
            for (int j = 0; j < rule.length; j++) {
                if (jnum[i] == j) {

                    result += rule[j];
                }
            }
        }

        return result;
    }
}


