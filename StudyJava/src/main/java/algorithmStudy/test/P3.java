package algorithmStudy.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();

            char[] arr = strArr[i].toCharArray();

            for (int j = 0; j < arr.length; j++) {
                char ch = arr[j];
                if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97) && ch <= 122)) {
                    if (!((arr[j + 1] >= 48 && arr[j + 1] <= 57) || (arr[j + 1] >= 65 && arr[j + 1] <= 90) || (arr[j + 1] >= 97) && arr[j + 1] <= 122)) {

                    } else {
                        sb.append(" ");
                    }

                } else {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
