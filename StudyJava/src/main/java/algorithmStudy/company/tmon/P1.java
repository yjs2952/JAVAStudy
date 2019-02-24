package algorithmStudy.company.tmon;

import java.util.Scanner;

public class P1 {
    private static String solution(int num, int n) {
        String t = "0123456789ABCDEF";
        int q = num / n;
        int r = num % n;
        if (q == 0)
            return String.valueOf(t.charAt(r));
        else
            return method(q, n) + t.charAt(r);
    }

    private static String method(int num, int n){

        String returnString = "";
        while(num != 0){

            // 나머지가 0~9 사이이면 문자열에 추가
            if( (num % n) < 10 ) {

                //문자열 우->좌로 배열
                returnString = (num % n) + returnString;

            }

            // 나머지가 10 이상이면 해당하는 값의 알파벳을 문자열에 추가
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
        //Scanner sc = new Scanner(System.in);
        //System.out.println(method(11, 2));
        System.out.println((char) 65);

    }
}
