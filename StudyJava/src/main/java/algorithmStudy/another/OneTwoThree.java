package algorithmStudy.another;

import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(recur(arr[i]));
        }
    }

    static int recur(int n){
        //if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        return recur(n-3) + recur(n-2) + recur(n-1);
    }
}
