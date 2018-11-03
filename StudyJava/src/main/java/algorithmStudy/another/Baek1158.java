package algorithmStudy.another;

import java.util.LinkedList;
import java.util.Scanner;

public class Baek1158 {
    public static void josep(LinkedList list, int n, int m) {

        int index = 0;
        System.out.print("<");
        while (list.size() != 0) {
            for (int i = 0; i < m - 1; i++) {
                if (list.size() < m) {
                    if (index > list.size() - 1) {
                        index = 0;
                    }
                }
                index++;
            }

            if (list.size() - 1 < index) {
                index = index - (list.size());
            }

            if (list.size() - 1 >= index) {
                System.out.print(list.get(index));
                list.remove(index);
            }
            if (list.size() > 0) {
                System.out.print(" ");
            }
        }
        System.out.print(">");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        josep(list, n, m);
    }
}
