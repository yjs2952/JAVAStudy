package algorithmStudy.company.hyperconnect;

import java.util.Arrays;

public class P2 {

    public static String firstUniqueName(String[] names) {

        String name = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {
                    names[i] = null;
                    names[j] = null;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                name = names[i];
                break;
            }
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}
