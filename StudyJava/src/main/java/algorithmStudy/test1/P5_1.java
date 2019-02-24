package algorithmStudy.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5_1 {
    public static void solution(int[] num1, int[] num2, int size1, int size2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int cnt = 0;
        StringBuilder output = new StringBuilder();

        while (pointer1 < size1 && pointer2 < size2) {
            if (num1[pointer1] > num2[pointer2])
                output.append(num2[pointer2++]).append(" ");
            else
                output.append(num1[pointer1++]).append(" ");
            cnt++;
        }

        if (pointer1 < size1) {
            for (int i = pointer1; i < size1; i++)
                output.append(num1[i]).append(" ");
        } else {
            for (int i = pointer2; i < size2; i++)
                output.append(num2[i]).append(" ");
        }

        System.out.println("Output\n" + output.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num1;
        int[] num2;

        System.out.println("Input:");
        int size1 = Integer.parseInt(br.readLine());
        num1 = new int[size1];
        for (int i = 0; i < size1; i++)
            num1[i] = Integer.parseInt(br.readLine());

        int size2 = Integer.parseInt(br.readLine());
        num2 = new int[size2];
        for (int i = 0; i < size2; i++)
            num2[i] = Integer.parseInt(br.readLine());

        solution(num1, num2, size1, size2);
    }
}