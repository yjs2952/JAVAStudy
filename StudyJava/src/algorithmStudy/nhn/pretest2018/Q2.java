package algorithmStudy.nhn.pretest2018;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rotDir = sc.nextInt();
        String[][] arr = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextLine();
            }
        }

        solution(arr, rotDir);
    }

    public static void solution(String[][] arr, int rotDir) {

    }
}
