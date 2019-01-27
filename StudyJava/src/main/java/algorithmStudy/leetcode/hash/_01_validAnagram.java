package algorithmStudy.leetcode.hash;

import java.util.Arrays;

public class _01_validAnagram {
    public static boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length != tArr.length) {
            return false;
        }

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("", ""));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("anagram", "nagaramaa"));
    }
}
