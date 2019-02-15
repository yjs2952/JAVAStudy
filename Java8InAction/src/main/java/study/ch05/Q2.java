package study.ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list2 = list1.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println(list2.toString());

        List<Integer> list3 = Arrays.asList(1, 2, 3);
        List<Integer> list4 = Arrays.asList(3, 4);

        List<int[]> pairs = list3.stream()
                .flatMap(i -> list4.stream()
                                    .filter(j -> (i + j) % 3 == 0)
                                    .map(j -> new int[]{i, j})
                        )
                .collect(Collectors.toList());

        for (int[] pair : pairs) {
            System.out.print(Arrays.toString(pair));
        }

        System.out.println();
        System.out.println();

        int sum = 0;

        long start = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }
        long end = System.nanoTime();

        System.out.println("외부 반복 결과 : " + sum + ", 시간 : " + (end - start));

        start = System.nanoTime();
        sum = IntStream.rangeClosed(0, 100000).sum();
        end = System.nanoTime();

        System.out.println("내부 반복 결과 : " + sum + ", 시간 : " + (end - start));

        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::print);

        System.out.println();

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach(t -> System.out.print(t + ", "));

        System.out.println();

        Stream.generate(Math::random)
                .limit(20)
                .map(n -> Math.round(n * 1000 + 1))
                .forEach(obj -> System.out.print(obj + ", "));


    }
}
