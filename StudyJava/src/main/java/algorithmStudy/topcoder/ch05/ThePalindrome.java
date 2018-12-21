package algorithmStudy.topcoder.ch05;

public class ThePalindrome {

    public static int find(String s) {

        for (int i = s.length(); ; i++) {
            boolean ok = true;
            for (int k = 0; k < s.length(); k++) {
                if ((i - k - 1) < s.length() && s.charAt(i - k - 1) != s.charAt(k)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(find("12345"));
    }
}
