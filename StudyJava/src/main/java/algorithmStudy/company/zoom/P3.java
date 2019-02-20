package algorithmStudy.company.zoom;

public class P3 {
    public static String solution(int U, int L, int[] C) {
        int sum = 0;
        StringBuffer up = new StringBuffer();
        StringBuffer low = new StringBuffer();

        for (int i = 0; i < C.length; i++)
            sum += C[i];

        if (U + L != sum)
            return "IMPOSSIBLE";

        for (int i = 0; i < C.length; i++) {
            if (C[i] == 2) {
                up.append(1);
                low.append(1);
                U--;
                L--;
            } else if (C[i] == 0) {
                up.append(0);
                low.append(0);
            } else if (C[i] == 1) {
                if (U > L) {
                    up.append(1);
                    low.append(0);
                    U--;
                } else {
                    up.append(0);
                    low.append(1);
                    L--;
                }
            }
        }
        up.append("," + low.toString());
        return up.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new int[]{1, 2, 0, 1, 1, 0, 2}));
    }
}
