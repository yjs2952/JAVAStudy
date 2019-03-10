package algorithmStudy.company.kakaopage2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5_1 {
    public static String solution(String str, String pattern) {
        int s = 0;
        int p = 0;
        int sPrev = 0;
        int pLength = pattern.length();
        int asterisk = -1;

        while (s < str.length()) {
            // str과 pattern이 동일한 문자이거나, pattern이 '?'면, 둘 다 1 증가
            if (p < pLength &&
                    (str.charAt(s) == pattern.charAt(p) || pattern.charAt(p) == '?')) {
                s++;
                p++;
            }
            // '*'가 나오면 일단 pattern만 1 증가
            else if (p < pLength && pattern.charAt(p) == '*') {
                asterisk = p;   // 현재 pattern 위치를 저장 (별의 위치)
                sPrev = s;      // 별이 나왔을 때의 문자열의 위치 저장
                p++;
            }
            // 직전에 '*'가 나왔으면 str을 증가
            else if (asterisk != -1) {
                s = ++sPrev;
                p = asterisk + 1;  // '*' 다음 위치로 세팅
            }
            // 현재 혹은 직전 모두 '*' 아님
            else return "False";
        }

        // pattern에 남아있는 문자들
        while (p < pLength && pattern.charAt(p) == '*') {
            p++;
        }

        return p == pLength ? "True" : "False";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[][] strArr = new String[n][2];

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < n; i++) {
            System.out.println(solution(strArr[i][0], strArr[i][1]));
        }
    }
}