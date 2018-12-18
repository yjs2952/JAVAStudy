package algorithmStudy.topcoder.ch05;

public class InterestingParty {
    public static int bestInvitation(String[] first, String[] second) {
        int i, j;
        int ans = 0;

        for (i = 0; i < first.length; i++) {
            int f = 0;
            int s = 0;
            for (j = 0; j < first.length; j++) {
                if (first[i].equals(first[j])) f++;
                if (first[i].equals(second[j])) f++;
                if (second[i].equals(first[j])) s++;
                if (second[i].equals(second[j])) s++;
            }
            ans = Math.max(f, ans);
            ans = Math.max(s, ans);
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