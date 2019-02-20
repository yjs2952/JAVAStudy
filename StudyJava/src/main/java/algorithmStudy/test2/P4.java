package algorithmStudy.test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P4 {
    public static String solution(String input) {
        String[] groups = input.split("\\]");
        StringBuffer sb = new StringBuffer();

        for (String group : groups) {
            char[] arr = group.toCharArray();
            Arrays.sort(arr);
            sb.append(arr[1]);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}
