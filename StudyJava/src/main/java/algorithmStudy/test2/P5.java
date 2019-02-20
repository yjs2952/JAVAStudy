/*
package algorithmStudy.test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5 {
    public static boolean solution(String input) {
        int index = input.indexOf(' ');
        char[] first = input.substring(0, index).toCharArray();
        char[] second = input.substring(index + 1).toCharArray();

        int point = 0;
        for (char c : first) {
            if (c == second[point] || second[point] == '?')
                point++;
            else if (second[point] == '*') {
                if (point == second.length - 1)
                    return true;
                else if (c == second[point + 1] || (second[point + 1] == '?' && point < second.length - 2)) {
                    if (point == second.length - 2)
                        point++;
                    else
                        point += 2;
                }
            } else
                return false;
        }

        if (point != second.length) {
            for (int i = point; i < second.length; i++)
                if (second[i] != '*' && second[i] != '?')
                    return false;
        }

        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
}*/
