package algorithmStudy.nhn.pretest2018;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();   // 카드 수
        int p = sc.nextInt();   // 섞기 횟수
        int[] n = new int[p];   // 제외할 카드 수

        for (int i = 0; i < p; i++) {
            n[i] = sc.nextInt();
        }

        shuffle(c, p, n);
    }

    public static void shuffle(int c, int p, int[] n) {
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= c; i++) {
            list.add(i);
        }

        for (int i = 0; i < p; i++) {
            int end = c;
            while (true) {
                int index = n[i];
                for (int j = n[i]; j < end - n[i]; j++) {
                    temp.add(list.get(j));
                }

                for (int j = n[i]; j < end - n[i]; j++) {
                    list.remove(index);
                }

                for (int j = temp.size() - 1; j >= 0; j--) {
                    list.addFirst(temp.get(j));
                }

                if (temp.size() <= n[i]) {
                    temp.clear();
                    break;
                }
                end = temp.size();
                temp.clear();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
