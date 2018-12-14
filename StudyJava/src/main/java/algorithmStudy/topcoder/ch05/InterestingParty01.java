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

        
        int ans = 0;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
