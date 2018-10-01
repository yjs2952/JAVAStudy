package algorithmStudy.doItJAVA.ch05;

import java.util.Scanner;

public class Hanoi {
    public static void move(int num, int x, int y) {
        if (num > 1) {
            move(num - 1, x, 6 - x - y);
        }

        System.out.println("원반[" + num + "]을 " + x + " 기둥에서 " + y + " 기둥으로 옮김");

        if (num > 1) {
            move(num - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 : ");
        int n = sc.nextByte();

        move(n, 1, 3);
    }
}
