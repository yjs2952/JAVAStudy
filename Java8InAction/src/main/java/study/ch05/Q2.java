package study.ch05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list2 = list1.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

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

    }
}
