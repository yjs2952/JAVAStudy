package algorithmStudy.doItJAVA.ch01;

import java.util.Scanner;

public class DayOfYear {

    static int[][] mdays = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++) {
            days += mdays[isLeap(y)][i - 1];
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry = 0;

        System.out.println("그 해의 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int y = sc.nextInt();

            System.out.print("월 : ");
            int m = sc.nextInt();

            System.out.print("일 : ");
            int d = sc.nextInt();

            System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(y, m, d));
            System.out.print("더 할래? (1.예 / 0.아니오) : ");
            retry = sc.nextInt();

        } while (retry == 1);
    }
}

