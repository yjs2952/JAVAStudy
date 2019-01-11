package java3rd.ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream
                .sorted()
                .forEach(n -> System.out.print(n + ", "));
        System.out.println();

        // 객체 요소일 경우
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 80),
                new Student("무자비", 70),
                new Student("이빨깡", 60)
        );

        studentList.stream()
                .sorted()
                .forEach(s -> System.out.print(s.getScore() + ", "));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s.getScore() + ", "));
    }
}
