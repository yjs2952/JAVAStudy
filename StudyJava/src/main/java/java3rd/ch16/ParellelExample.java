package java3rd.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParellelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "람다식", "박병렬");

        long start = System.nanoTime();

        // 순차처리
        Stream<String> stream = list.stream();
        stream.forEach(ParellelExample :: print);

        long end = System.nanoTime();
        System.out.println("순차처리 시간 : " + (end - start));


        System.out.println();
        long start1 = System.nanoTime();

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParellelExample::print);

        long end1 = System.nanoTime();

        System.out.println("병렬 처리 시간 : " + (end1 - start1));
    }

    public static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
