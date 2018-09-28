package algorithmStudy.doItJAVA.ch05;

import java.util.Stack;

public class Q5 {
    public static void recur3(int n) {
        Stack<Integer> s = new Stack<>();
        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }

            if (!s.isEmpty()) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }

        }
    }

    public static void main(String[] args) {
        recur3(4);
    }
}
