package java3rd.ch16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 예외 발생
        /*double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();*/

        // 방법 1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (optional.isPresent()) {
            System.out.println("방법 1 평균 : " + optional.getAsDouble());
        }
        System.out.println("암것도 엄서");

        // 방법 2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법 2 평균 : " + avg);

        // 방법 3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법 3 평균 : " + a));
    }
}
