package algorithmStudy.company.kakaopage.p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4 {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String[] strArr1 = new String[n];

        for (int i = 0; i < n; i++) {
            strArr1[i] = br.readLine();
        }

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            String[] strArr2 = strArr1[i].split(" ");

            for (String word : strArr2) {
                stack.push(word);
            }

            int size = strArr2.length;

            for (int j = 0; j < size; j++) {

                if (j != size - 1) {
                    System.out.print(stack.pop() + " ");
                } else {
                    System.out.print(stack.pop());
                }

            }

            if (i != n - 1) {
                System.out.println();
            }

        }


    }
}
