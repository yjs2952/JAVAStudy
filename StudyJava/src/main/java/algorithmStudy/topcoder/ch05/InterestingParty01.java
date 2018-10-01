package algorithmStudy.topcoder.ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterestingParty01 {
    public static int bestInvitation(String[] first, String[] second) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            map.put(first[i], 0);
            map.put(second[i], 0);
        }

        for (int i = 0; i < first.length; i++) {
            map.put(first[i], map.get(first[i]) + 1);
            map.put(second[i], map.get(second[i]) + 1);
        }

        int ans = 0;
        for (String key : map.keySet()) {
            ans = Math.max(ans, map.get(key));
        }
        return ans;
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

        int result = bestInvitation(first, second);
        System.out.println(result);
    }
}
