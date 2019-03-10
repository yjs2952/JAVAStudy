package algorithmStudy.company.kakaopage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P6_1 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input);

        int[] arr = new int[Integer.parseInt(input)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(isSmooth(arr));
    }

    private static String isSmooth(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) <= 1) {
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}

