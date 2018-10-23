package algorithmStudy.another;

import java.util.Arrays;
import java.util.Scanner;

/*
백준 2309번 일곱 난쟁이
 */
public class Baek2309 {

    static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void solution(int[] arr){
        int sum = sum(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((sum - (arr[i] + arr[j])) == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        solution(arr);
        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
