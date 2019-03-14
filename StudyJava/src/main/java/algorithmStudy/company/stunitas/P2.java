package algorithmStudy.company.stunitas;

import java.util.Scanner;

public class P2 {

    private static void solution(String[] input){

        for (String s : input) {
            String[] strArr = s.split(" ");

            int[] pieces = new int[4];

            for (int j = 0; j < pieces.length; j++) {
                pieces[j] = Integer.parseInt(strArr[j]);
            }

            System.out.println(result(pieces));
        }
    }

    private static int result(int[] pieces) {

        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                for (int k = 1; k <= 50; k++) {
                    if (pieces[0] * i + pieces[1] * j + pieces[2] * k == pieces[3]) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }

        solution(input);

        sc.close();
    }
}
