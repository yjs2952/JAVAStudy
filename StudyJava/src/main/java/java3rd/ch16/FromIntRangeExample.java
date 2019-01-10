package java3rd.ch16;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(i -> sum += i);
        System.out.println("총합 : " + sum);
    }
}
