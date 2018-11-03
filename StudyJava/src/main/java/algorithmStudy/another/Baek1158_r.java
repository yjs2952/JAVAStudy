package algorithmStudy.another;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Baek1158_r {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }
        while (!deque.isEmpty()) {
            for (int i = 0; i < m - 1; i++) {
                deque.addLast(deque.removeFirst());
            }
            sb.append(deque.removeFirst() + ", ");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 2) + ">");
    }
}
