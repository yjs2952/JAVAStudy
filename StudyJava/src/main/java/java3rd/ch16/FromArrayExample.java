package java3rd.ch16;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArr = {"홍길동", "신용권", "김미나"};
        Stream<String> stringStream = Arrays.stream(strArr);
        stringStream.forEach( s -> System.out.print(s + ", "));

        System.out.println();

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }
}
