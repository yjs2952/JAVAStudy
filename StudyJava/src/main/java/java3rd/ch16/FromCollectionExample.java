package java3rd.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 80),
                new Student("배트맨", 90),
                new Student("수퍼맨", 70)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach( s -> System.out.println(s.getName()));
    }
}
