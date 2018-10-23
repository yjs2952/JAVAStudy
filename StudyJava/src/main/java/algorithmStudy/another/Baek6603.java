package algorithmStudy.another;

import java.util.Scanner;

/*
백준 로또 문제
 */
public class Baek6603 {

    static void dfs(int[] arr, int[] lotto, int start, int depth){
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        } else {
            for (int i = start; i < lotto.length; i++) {
                arr[depth] = lotto[i];
                dfs(arr, lotto, i + 1, depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int[] arr = new int[13];
        int[] lotto = new int[k];

        for (int i = 0; i < k; i++) {
            lotto[i] = sc.nextInt();
        }

        dfs(arr, lotto,0, 0);
    }
}
