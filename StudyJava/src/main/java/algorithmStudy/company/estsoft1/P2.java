package algorithmStudy.company.estsoft1;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    private static int solution(int[] A) {

        int len = A.length;

        if (len == 0) {
            return 0;
        }

        boolean[] flag = new boolean[len];
        List<Integer> list = new ArrayList<>();
        int max = 0;

        int i = 0;
        list.add(i);
        flag[i] = true;

        for (int j = 1; j <= len; j++) {
            if (list.contains(A[i])) {
                max = Math.max(max, list.size());
                list.clear();

                for (int k = 0; k < flag.length; k++) {
                    if (!flag[k]) {
                        i = k;
                        list.add(k);
                        flag[k] = true;
                        break;
                    }
                }

                continue;
            }

            list.add(A[i]);
            flag[A[i]] = true;

            i = A[i];

            if (list.size() > len) {
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(solution(A));
    }
}
