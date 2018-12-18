package algorithmStudy.topcoder.ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterestingParty01 {
    public static int bestInvitation(String[] first, String[] second) {
        Map<String, Integer> dic = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            dic.put(first[i], 0);
            dic.put(second[i], 0);
        }

        for (int i = 0; i < first.length; i++) {
            dic.put(first[i], dic.get(first[i]) + 1);
            dic.put(second[i], dic.get(second[i]) + 1);
        }


        int ans = 0;
        for (String key : dic.keySet()) {
            ans = Math.max(ans, dic.get(key));
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] f = {"fs", "gd", "sw", "fs"};
        String[] s = {"ht", "fs", "sw", "bt"};

        long start = System.nanoTime();
        System.out.println(bestInvitation(f, s));
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
