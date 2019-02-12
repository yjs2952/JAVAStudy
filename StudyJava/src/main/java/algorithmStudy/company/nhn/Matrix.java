package algorithmStudy.company.nhn;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                continue;
            }
            for (int j = 0; j < n + 1; j++) {
                if (j == 0) {
                    continue;
                }
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrix(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    if (arr[i - 1][j] == 1 || arr[i + 1][j] == 1 || arr[i][j - 1] == 1 || arr[i][j + 1] == 1) {

                    } else {

                    }
                }
            }
        }
    }

    public static void bfs() {


    }
}
