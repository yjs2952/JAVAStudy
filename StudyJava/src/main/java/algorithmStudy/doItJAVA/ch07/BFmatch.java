package algorithmStudy.doItJAVA.ch07;

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
            }
        }
    }
}
