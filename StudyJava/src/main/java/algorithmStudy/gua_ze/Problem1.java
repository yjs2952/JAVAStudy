package algorithmStudy.gua_ze;

import java.util.Scanner;

public class Problem1 {
    /*public static int getNextInteger(int n) {

        while (true) {
            n++;

            if (!String.valueOf(n).contains("0")) {
                break;
            }
        }

        return n;
    }*/

    public static void getNextInteger(String input) {

        String[] inputNumbers = input.split(", ");

        for (String inputNumber : inputNumbers) {
            int n = Integer.parseInt(inputNumber);

            while (true) {
                n++;

                if (!String.valueOf(n).contains("0")) {
                    break;
                }
            }
            System.out.print(n + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        String input = sc.nextLine();
        System.out.println("출력 : ");
        getNextInteger(input);
    }
}
