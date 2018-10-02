package algorithmStudy.doItJAVA.ch05;

import java.util.Scanner;
import java.util.Stack;

public class Q7 {
    public static void move(int num, int x, int y) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        //s.push(num);
        while (true) {
            if (num > 1) {
                s.push(num);
                s1.push(y);
                s1.push(x);
                num = num - 1;
                y = 6 - x - y;
                continue;
                //move(num - 1, x, 6 - x - y);
            }
            System.out.println("원반[" + num + "]을 " + x + " 기둥에서 " + y + " 기둥으로 옮김");
            if (!s.isEmpty()) {
                num = s.pop();
                x = s1.pop();
                y = s1.pop();
                //move(num - 1, 6 - x - y, y);
                System.out.println("원반[" + num + "]을 " + x + " 기둥에서 " + y + " 기둥으로 옮김");
                num = num - 1;
                x = 6 - x - y;
                //num = num - 1;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 : ");
        int n = sc.nextInt();

        move(n, 1, 3);
    }
}
