package algorithmStudy.topcoder.ch05;

import java.util.Scanner;

public class InterestingParty {
    public static void bestInvitation(String[] first, String[] second) {
        int f, s;
        int ans = 0;

        for (int i = 0; i < first.length; i++) {
            f = 0;
            s = 0;
            for (int j = 0; j < first.length; j++) {
                if (first[i].equals(first[j]) || first[i].equals(second[j])) {
                    f++;
                }

                if (second[i].equals(first[j]) || second[i].equals(second[j])) {
                    s++;
                }
            }
            ans = Math.max(f, ans);
            ans = Math.max(s, ans);
        }

        System.out.println(ans);
        //return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = new String[4];
        String[] second = new String[4];

        for (int i = 0; i < first.length; i++) {
            first[i] = sc.nextLine().toLowerCase();
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = sc.nextLine().toLowerCase();
        }

        //int result = bestInvitation(first, second);
        //System.out.println(result);
        bestInvitation(first, second);
    }
}
