package examples.study3;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("dkdkdk", "aaaa", "bbb", "cccc");

        for (String s : list1) {
            System.out.println(s);
        }
    }
}
