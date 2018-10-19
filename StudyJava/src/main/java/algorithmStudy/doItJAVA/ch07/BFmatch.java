package algorithmStudy.doItJAVA.ch07;

import java.util.Scanner;

public class BFmatch {

    // 브루트 포스법으로 문자열을 검색하는 메소드
    static int bfMatch(String txt, String pat) {
        int pt = 0;     // txt 커서
        int pp = 0;     // pat 커서

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pat.length()) {
            return pt - pp;
        }
        return -1;
    }

    static int bfMatchLast(String txt, String pat) {
        int pt = 0;
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
            if (pp == pat.length()) {
                return pt;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = sc.nextLine();

        System.out.print("패턴 : ");
        String s2 = sc.nextLine();

        int idx = bfMatch(s1, s2);
        int idxl = bfMatchLast(s1, s2);

        if (idx == -1) {
            System.out.println("텍스트에 패턴이 없습니다.");
        } else {
            // 일치하는 문자 바로 앞까지의 길이를 구한다.
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += s1.substring(i, i + 1).getBytes().length;
            }
            len += s2.length();

            System.out.println(idx + 1 + "번째 문자부터 일치합니다.");
            System.out.println(idxl + "가 일치하는 마지막 번째입니다.");
            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
        }
    }
}
