package algorithmStudy.company.stunitas;

import java.util.Scanner;

public class P1 {

    private static String S = "4";
    private static String B = "3";
    private static String L = "2";

    // 딸기, 바나나, 라임, 자두 순으로
    private static void solution(String[] input1, String[] input2) {

        int[][] sum = null;    // (0, n) 동생, (1, n) 동생 친구
        String[][] strArr = new String[2][];
        for (int i = 0; i < input1.length; i++) {
            sum = new int[2][4];
            strArr[0] = input1[i].split(" ");
            strArr[1] = input2[i].split(" ");

            for (int k = 0; k < 2; k++) {
                for (int j = 1; j < strArr[k].length; j++) {
                    if (strArr[k][j].equals(S)) {
                        sum[k][0]++;
                    } else if (strArr[k][j].equals(B)) {
                        sum[k][1]++;
                    } else if (strArr[k][j].equals(L)) {
                        sum[k][2]++;
                    } else {
                        sum[k][3]++;
                    }
                }
            }

            System.out.println(compare(sum[0], sum[1], 0));
        }
    }

    private static String compare(int[] sum1, int[] sum2, int i) {
        if (i == sum1.length) {
            return "D";
        }

        if (sum1[i] > sum2[i]) {
            return "A";
        } else if (sum1[i] < sum2[i]) {
            return "B";
        } else {
            return compare(sum1, sum2, ++i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] input1 = new String[n];
        String[] input2 = new String[n];

        for (int i = 0; i < n; i++) {
            input1[i] = sc.nextLine();
            input2[i] = sc.nextLine();
        }

        solution(input1, input2);
        sc.close();
    }
}
