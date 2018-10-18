package algorithmStudy.another;

import java.util.Scanner;

public class guaro {

    static int guaroCalc(char[] chArr, int i) {

        int sum = 1;

        if (i >= chArr.length - 1) {
            return sum;
        }

        int temp = 1;
        char c = chArr[i];

        if (c == ')' || c == ']') {
            return 1;
        }

        if (c == '(') {
            sum = 2 * guaroCalc(chArr, i + 1);
        }

        if (c == '[') {
            sum = 3 * guaroCalc(chArr, i + 1);
        }

        if (chArr[i+1] == ']' || chArr[i+1] == ')') {
            while (i < chArr.length - 1) {
                c = chArr[++i];
                if (c == '(' || c == '[') {
                    break;
                }
            }
            sum += guaroCalc(chArr, i);
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        int result = guaroCalc(ch, 0);
        System.out.println(result);
    }
}
