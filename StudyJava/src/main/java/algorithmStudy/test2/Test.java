package algorithmStudy.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    private static int solution1(){

    }

    private static void p1(BufferedReader br) throws IOException {
        String input = br.readLine();
        String[] strArr = null;

        if (input.contains(",")) {
            strArr = input.split(", ");
        } else {
            strArr = input.split(" ");
        }

        long[] numArr = new long[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Long.parseLong(strArr[i]);
        }

        solution1(numArr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        p1(br);
    }
}
