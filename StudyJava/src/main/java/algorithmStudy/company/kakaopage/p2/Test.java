package algorithmStudy.company.kakaopage.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    private static long solution1(long[] arr) {
        long sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum += arr[i];
            }
            max = Math.max(max, sum);
        }
        return max;
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

        System.out.println(solution1(numArr));
    }

    private static long getProgress(String input) {
        int size = input.length();
        int completedSize = 0;

        for (int i = 0; i < size - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                completedSize = i + 1;
            }
        }

        return (100 * completedSize / size);
    }

    private static void p2(BufferedReader br) throws IOException {
        String str = br.readLine();
        System.out.println(getProgress(str));
    }

    private static List<Integer> input(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        return list;
    }

    private static void p3(BufferedReader br) throws IOException {
        List<Integer> list1 = input(br);
        List<Integer> list2 = input(br);
        List<Integer> merge = new ArrayList<>();
        int k = Integer.parseInt(br.readLine());

        int p = 0;
        int q = 0;
        while (p < list1.size() && q < list2.size()) {
            if (list1.get(p) < list2.get(q)) {
                merge.add(list1.get(p++));
            } else if (list1.get(p) > list2.get(q)) {
                merge.add(list2.get(q++));
            }
        }

        while (p < list1.size()) {
            merge.add(list1.get(p++));
        }

        while (q < list2.size()) {
            merge.add(list2.get(q++));
        }

        System.out.println(merge.get(k - 1));
    }

    private static String solution4(String input) {
        String[] groups = input.split("]");

        StringBuilder sb = new StringBuilder();

        for (String str : groups) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            sb.append(chArr[1]);
        }
        return sb.toString();
    }

    private static void p4(BufferedReader br) throws IOException {
        String input = br.readLine();

        System.out.println(solution4(input));
    }

    private static String solution5(String str, String pattern) {
        int s = 0;
        int p = 0;
        int asterP = -1;
        int asterS = 0;
        int pLength = pattern.length();

        while (s < str.length()) {

            if (p < pLength &&
                    (str.charAt(s) == pattern.charAt(p) || pattern.charAt(p) == '?')) {
                s++;
                p++;
            } else if (p < pLength && pattern.charAt(p) == '*') {
                asterP = p;
                asterS = s;
                p++;
            } else if (asterP != -1) {
                s = ++asterS;
                p = asterP + 1;
            } else {
                return "False";
            }
        }

        while (p < pLength && (pattern.charAt(p) == '*' || pattern.charAt(p) == '?')) {
            p++;
        }

        return p == pLength ? "True" : "False";
    }

    private static void p5(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < n; i++) {
            System.out.println(solution5(arr[i][0], arr[i][1]));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //p1(br);
        //p2(br);
        //p3(br);
        //p4(br);
        p5(br);
    }
}

