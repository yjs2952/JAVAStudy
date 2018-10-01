package algorithmStudy.doItJAVA.ch01;

import java.util.Scanner;

/**
 * 입력받은 10진수를 2 ~ 36 진수로 변환
 */
public class CardConvRev {
    // 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣얻고 자릿수를 반환
    static int cardConvR(int x, int r, char[] d) {
        int digit = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXZ";

        do {
            d[digit++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 0;
        int cd = 0;
        int dno = 0;
        int retry = 0;
        char[] cno = new char[32];

        System.out.println("10진수 기수 변환");
        do {

            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할래 ? (2 ~ 36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = dno - 1; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한번 더 할래 ? (1.예 / 2.아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}