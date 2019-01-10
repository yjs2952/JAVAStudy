package java3rd.ch16;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "아이언맨", "배트맨", "수퍼맨", "아이언맨", "헐크"
        );

        names.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("아"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .distinct()
                .filter(n -> n.startsWith("아"))
                .forEach(n -> System.out.println(n));
    }
}
