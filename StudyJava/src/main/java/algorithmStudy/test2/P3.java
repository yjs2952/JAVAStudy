package algorithmStudy.test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3 {

    public static int solution(int[] arr1, int[] arr2, int num) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length && i+j < num-1) {
            if (arr1[i] < arr2[j])
                i++;
            else
                j++;
        }

        if (i+j != num-1) {
            if (i == arr1.length) {
                return arr2[num-i-j];
            }
            else if (j == arr2.length) {
                return arr1[num-j-i];
            }
        }

        if (arr1[i] < arr2[j])  return arr1[i];
        else return arr2[j];
    }

    public static int[] input(String s1, String s2) {
        int[] a = new int[Integer.parseInt(s1)];

        String[] lines = s2.split(" ");

        for(int i=0; i < lines.length ; i++) {
            a[i] = Integer.parseInt(lines[i]);
        }
        return a;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = input(br.readLine(), br.readLine());
        int[] arr2 = input(br.readLine(), br.readLine());
        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(arr1, arr2, num));
    }
}
