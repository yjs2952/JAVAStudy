package algorithmStudy.tmon;

import java.util.Arrays;
import java.util.Scanner;

public class P1 {

    static String solution(int num, int n) {
        String t = "0123456789ABCDEF";
        int q = num / n;
        int r = num % n;
        if (q == 0)
            return String.valueOf(t.charAt(r));
        else
            return solution(q, n) + t.charAt(r);
    }

    static String method(int num, int n){

        String returnString = "";
        while(num != 0){

            // 나머지가 0~9 사이이면 캐릭터 값을 배열에 저장
            if( (num % n) < 10 ) {

                //문자열 우->좌로 배열
                returnString = (num % n) + returnString;

            }

            // 나머지가 10 이상이면 해당하는 값의 알파벳을 저장
            else {
                char temp1 = (char)((num % n)  + 55);
                returnString = temp1 + returnString;
            }

            // 몫을 구함
            num /= n;
        }

        return returnString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), 16));

    }
}
