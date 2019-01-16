package algorithmStudy.leetcode.hash;

import java.util.Arrays;

public class _01_validAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.equals("") && t.equals(""))
            return true;

        if (s.equals("") || t.equals("")) {
            return false;
        }

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

        /*List<Integer> listS = s.chars().parallel().sorted().boxed().collect(Collectors.toList());
        List<Integer> listT = t.chars().parallel().sorted().boxed().collect(Collectors.toList());

        if (listS.size() != listT.size()) {
            return false;
        }

        for (int i = 0; i < listS.size(); i++) {
            if (listS.get(i) != listT.get(i)) {
                return false;
            }
        }*/

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("", ""));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("anagram", "nagaramaa"));
    }
}
