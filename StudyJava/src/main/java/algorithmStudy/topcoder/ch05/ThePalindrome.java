package algorithmStudy.topcoder.ch05;

public class ThePalindrome {

    public static int find(String s) {

        for (int i = s.length(); ; i++) {
            boolean ok = true;
            for (int j = 0; j < s.length(); j++) {
                if (i - j - 1 < s.length() && s.charAt(j) != s.charAt(i - j - 1)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(find("121"));
    }
}
