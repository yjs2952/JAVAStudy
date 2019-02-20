package algorithmStudy.test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2 {

    public static int getProgress(String input) {
        int size = input.length();
        int completedSize = 0;

        if (size <= 1) {
            return 0;
        }

        for (int i = 0; i < size - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                completedSize = i + 1;
                break;
            }
        }

        return completedSize != 0 ? (100 * completedSize / size) : 0;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(getProgress(input));
    }
}
