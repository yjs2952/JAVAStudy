package algorithmStudy.doItJAVA.ch05;

import java.util.Stack;

public class Q7_1 {
    public static void move(int n, char from, char middle, char to) {
        Stack<Integer> s = new Stack<>();
        Stack<Character> s1 = new Stack<>();
        //s.push(n);
        char temp = ' ';
        while (true) {
            if (n > 1) {
                s.push(n);
                s1.push(to);
                s1.push(middle);
                s1.push(from);

                n = n - 1;
                temp = to;
                to = middle;
                middle = temp;
                continue;
                //move(n-1, from, to, middle);
            }

            System.out.println("원반[" + n + "]을 " + from + " 기둥에서 " + to + " 기둥으로 옮김");

            if (!s.isEmpty()) {
                n = s.pop();
                from = s1.pop();
                middle = s1.pop();
                to = s1.pop();
                //move(num - 1, 6 - x - y, y);
                System.out.println("원반[" + n + "]을 " + from + " 기둥에서 " + to + " 기둥으로 옮김");
                n = n - 1;
                temp = middle;
                middle = from;
                from = temp;
                //move(n-1, middle, from, to);
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        move(3, 'A', 'B', 'C');
    }
}
